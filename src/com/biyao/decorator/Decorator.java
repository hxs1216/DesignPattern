package com.biyao.decorator;

/**
 * @author hxs
 * Title: 装饰者模式
 * Description：是一个装饰类，含有一个被装饰的对象
 */
public class Decorator extends Drink {
	private Drink obj;

	public Decorator(Drink obj) { //组合
		// TODO Auto-generated constructor stub
		this.obj = obj;
	}

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		// getPrice 自己价格
		return super.getPrice() + obj.cost();
	}

	@Override
	public String getDes() {
		// TODO Auto-generated method stub
		// obj.getDes() 输出被装饰者的信息
		return des + " " + getPrice() + " && " + obj.getDes();
	}
}
