package com.biyao.prototype.deepclone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author hxs
 * Title: 原型模式（深拷贝）
 * Description: 对于基本数据类型，浅拷贝会直接进行值传递，对于引用数据类型的成员变量申请存储对象，
 * 并复制每个引用数据类型成员变量所引用的对象
 * Create Time: 2019/08/28
 */
public class DeepProtoType implements Serializable, Cloneable{

	public String name;
	public DeepCloneableTarget deepCloneableTarget;// 引用类型
	public DeepProtoType() {
		super();
	}

	//深拷贝
	//方式1:使用clone 方法
	@Override
	protected Object clone() throws CloneNotSupportedException {

		Object deep = null;

		//这里完成对基本数据类型(属性)和String的克隆
		deep = super.clone();

		//对引用类型的属性，进行单独处理
		DeepProtoType deepProtoType = (DeepProtoType)deep;
		deepProtoType.deepCloneableTarget  = (DeepCloneableTarget)deepCloneableTarget.clone();
		return deepProtoType;
	}

	//深拷贝
	//方式2 通过对象的序列化实现 (推荐)
	public Object deepClone() {

		//创建流对象
		ByteArrayOutputStream bos = null;
		ObjectOutputStream oos = null;
		ByteArrayInputStream bis = null;
		ObjectInputStream ois = null;
		try {

			//序列化
			bos = new ByteArrayOutputStream();
			oos = new ObjectOutputStream(bos);
			oos.writeObject(this); //当前这个对象以对象流的方式输出（从内存到byte[]）

			//反序列化
			bis = new ByteArrayInputStream(bos.toByteArray());
			ois = new ObjectInputStream(bis); //（从byte[]到内存）
			DeepProtoType copyObj = (DeepProtoType) ois.readObject();
			return copyObj;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {

			//关闭流
			try {
				bos.close();
				oos.close();
				bis.close();
				ois.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws Exception {
		DeepProtoType p = new DeepProtoType();
		p.name = "宋江";
		p.deepCloneableTarget = new DeepCloneableTarget("大牛", "小牛");

		//方式1 完成深拷贝
//		DeepProtoType p2 = (DeepProtoType) p.clone();
//		System.out.println("p.name=" + p.name + "p.deepCloneableTarget=" + p.deepCloneableTarget.hashCode());
//		System.out.println("p2.name=" + p.name + "p2.deepCloneableTarget=" + p2.deepCloneableTarget.hashCode());

		//方式2 完成深拷贝
		DeepProtoType p2 = (DeepProtoType) p.deepClone();
		System.out.println("p.name=" + p.name + " p.deepCloneableTarget=" + p.deepCloneableTarget.hashCode());
		System.out.println("p2.name=" + p.name + " p2.deepCloneableTarget=" + p2.deepCloneableTarget.hashCode());

	}

}
