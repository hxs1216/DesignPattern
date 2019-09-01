package com.biyao.factory.methodfactory.order;

import com.biyao.factory.methodfactory.pizza.BJCheesePizza;
import com.biyao.factory.methodfactory.pizza.BJPepperPizza;
import com.biyao.factory.methodfactory.pizza.Pizza;

public class BJOrderPizza extends OrderPizza {


	@Override
	Pizza createPizza(String orderType) {

		Pizza pizza = null;
		if(orderType.equals("cheese")) {
			pizza = new BJCheesePizza();
		} else if (orderType.equals("pepper")) {
			pizza = new BJPepperPizza();
		}
		// TODO Auto-generated method stub
		return pizza;
	}

}

