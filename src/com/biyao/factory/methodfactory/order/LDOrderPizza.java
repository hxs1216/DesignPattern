package com.biyao.factory.methodfactory.order;

import com.biyao.factory.methodfactory.pizza.LDCheesePizza;
import com.biyao.factory.methodfactory.pizza.LDPepperPizza;
import com.biyao.factory.methodfactory.pizza.Pizza;

public class LDOrderPizza extends OrderPizza {

	@Override
	Pizza createPizza(String orderType) {
		Pizza pizza = null;
		if(orderType.equals("cheese")) {
			pizza = new LDCheesePizza();
		} else if (orderType.equals("pepper")) {
			pizza = new LDPepperPizza();
		}
		// TODO Auto-generated method stub
		return pizza;
	}

}
