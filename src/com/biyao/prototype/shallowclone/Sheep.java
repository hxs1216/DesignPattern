package com.biyao.prototype.shallowclone;

/**
 * @author hxs
 * Title: 原型模式（浅拷贝）
 * Description: 对于基本数据类型，浅拷贝会直接进行值传递，对于对象只会进行引用传递（Cloneable）
 * 1、创建新的对象比较复杂时，可以利用原型模式简化对象的创建，提高效率
 * 2、不用重新初始化对象，而是动态地获得对象运行时的状态
 * 3、原始对象发生变化，克隆对象也会相应变化
 * Create Time: 2019/08/28
 */
public class Sheep implements Cloneable {
	private String name;
	private int age;
	private String color;
	private String address = "蒙古羊";
	public Sheep friend; //对象克隆浅拷贝是会如何处理？

	public Sheep(String name, int age, String color) {
		super();
		this.name = name;
		this.age = age;
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Sheep [name=" + name + ", age=" + age + ", color=" + color + ", address=" + address + "]";
	}

	//克隆该实例，使用默认的clone方法来完成
	@Override
	protected Object clone()  {
		Sheep sheep = null;
		try {
			sheep = (Sheep) super.clone();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sheep;
	}

	public static void main(String[] args) {
		System.out.println("原型模式完成对象的创建");

		//先创建一个对象
		Sheep sheep = new Sheep("tom", 1, "白色");
		sheep.friend = new Sheep("jack", 2, "黑色");

		Sheep sheep2 = (Sheep)sheep.clone(); //克隆
		Sheep sheep3 = (Sheep)sheep.clone(); //克隆
		Sheep sheep4 = (Sheep)sheep.clone(); //克隆
		Sheep sheep5 = (Sheep)sheep.clone(); //克隆

		System.out.println("sheep2.hashCode=" + sheep2.hashCode() + " sheep2=" + sheep2 + " sheep2.friend=" + sheep2.friend.hashCode());
		System.out.println("sheep3.hashCode=" + sheep3.hashCode() + " sheep3=" + sheep3 + " sheep3.friend=" + sheep3.friend.hashCode());
		System.out.println("sheep4.hashCode=" + sheep4.hashCode() + " sheep4=" + sheep4 + " sheep4.friend=" + sheep4.friend.hashCode());
		System.out.println("sheep5.hashCode=" + sheep5.hashCode() + " sheep5=" + sheep5 + " sheep5.friend=" + sheep5.friend.hashCode());
	}
	
	
}
