package com.biyao.factory.simplefactory.pizza;

/**
 * @author hxs
 * Title: 简单工厂模式
 * Description: 将Pizza 类做成抽象
 * 简单工厂模式是由一个工厂对象决定创建出哪一种产品类的实例，由这个类来封装实例化对象的行为
 * Create Time: 2019/08/28
 */
public abstract class Pizza {
	protected String name; //名字

	//准备原材料, 不同的披萨不一样，因此，我们做成抽象方法
	public abstract void prepare();

	public void bake() {
		System.out.println(name + " baking;");
	}

	public void cut() {
		System.out.println(name + " cutting;");
	}

	//打包
	public void box() {
		System.out.println(name + " boxing;");
	}

	public void setName(String name) {
		this.name = name;
	}
}
