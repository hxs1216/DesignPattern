package com.biyao.builder.improve;


/**
 * @author hxs
 * Title: 构建者模式
 * Description: 创建一个House对象的各个部件指定的接口、抽象类
 */
public abstract class HouseBuilder {

	protected House house = new House();

	//将建造的流程写好, 抽象的方法
	public abstract void buildBasic();
	public abstract void buildWalls();
	public abstract void roofed();

	//建造房子好， 将产品(房子) 返回
	public House buildHouse() {
		return house;
	}

}
