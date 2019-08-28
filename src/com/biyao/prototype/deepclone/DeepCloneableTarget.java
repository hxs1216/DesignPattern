package com.biyao.prototype.deepclone;
import java.io.Serializable;

/**
 * @author hxs
 * Title: 原型模式（浅拷贝）
 * Description: 对于基本数据类型，浅拷贝会直接进行值传递，对于对象只会进行引用传递（Cloneable）
 * 1、创建新的对象比较复杂时，可以利用原型模式简化对象的创建，提高效率
 * 2、不用重新初始化对象，而是动态地获得对象运行时的状态
 * 3、原始对象发生变化，克隆对象也会相应变化
 * Create Time: 2019/08/28
 */
public class DeepCloneableTarget implements Serializable, Cloneable {

	private static final long serialVersionUID = 1L;
	private String cloneName;
	private String cloneClass;

	public DeepCloneableTarget(String cloneName, String cloneClass) {
		this.cloneName = cloneName;
		this.cloneClass = cloneClass;
	}

	//因为该类的属性，都是String , 因此我们这里使用默认的clone完成即可
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
