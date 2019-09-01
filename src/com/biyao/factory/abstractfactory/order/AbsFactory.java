package com.biyao.factory.abstractfactory.order;
import com.biyao.factory.abstractfactory.pizza.Pizza;

/**
 * @author hxs
 * Title: 抽象工厂模式
 * Description: 一个抽象工厂模式的抽象层(接口)
 * 抽象工厂模式就是对简单工厂模式得改进，定义一个interface用于创建
 * 相关或有依赖关系的对象簇
 * Create Time: 2019/08/28
 */
public interface AbsFactory {

	//让下面的工厂子类来具体实现
	public Pizza createPizza(String orderType);
}

