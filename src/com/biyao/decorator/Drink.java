package com.biyao.decorator;

/**
 * @author hxs
 * Title: 装饰者模式
 * Description：动态的将新功能附加到对象上。在对象功能扩展方面，它比继承更有弹性，
 * 装饰者模式也体现了开闭原则
 */
public abstract class Drink {

	public String des; // 描述
	private float price = 0.0f;
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}

	//计算费用的抽象方法
	//子类来实现
	public abstract float cost();
	
}
