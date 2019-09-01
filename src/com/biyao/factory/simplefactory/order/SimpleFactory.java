package com.biyao.factory.simplefactory.order;


import com.biyao.factory.simplefactory.pizza.CheesePizza;
import com.biyao.factory.simplefactory.pizza.GreekPizza;
import com.biyao.factory.simplefactory.pizza.PepperPizza;
import com.biyao.factory.simplefactory.pizza.Pizza;

/**
 * @author hxs
 * Title: 简单工厂模式
 * Description: 简单工厂模式是由一个工厂对象决定创建出哪一种产品类的实例，
 * 由这个类来封装实例化对象的行为
 * Create Time: 2019/08/28
 */
public class SimpleFactory {

	//简单工厂模式（静态工厂模式）
	public static Pizza createPizza(String orderType) {
		Pizza pizza = null;
		System.out.println("使用简单工厂模式");
		if (orderType.equals("greek")) {
			pizza = new GreekPizza();
			pizza.setName(" 希腊披萨 ");
		} else if (orderType.equals("cheese")) {
			pizza = new CheesePizza();
			pizza.setName(" 奶酪披萨 ");
		} else if (orderType.equals("pepper")) {
			pizza = new PepperPizza();
			pizza.setName("胡椒披萨");
		}
		return pizza;
	}

}
