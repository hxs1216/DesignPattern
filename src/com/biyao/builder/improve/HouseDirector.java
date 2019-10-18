package com.biyao.builder.improve;

/**
 * @author hxs
 * Title: 构建者模式
 * Description: 构建一个使用Builder接口的对象。它只要是用于创建一个复杂对象。它主要有两个作用，1.隔离客户与对象
 * 的生产过程 2.负责控制产品对象的生产过程
 */
public class HouseDirector {

	HouseBuilder houseBuilder = null;

	//构造器传入 houseBuilder
	public HouseDirector(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}

	//通过setter 传入 houseBuilder
	public void setHouseBuilder(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}

	//如何处理建造房子的流程，交给指挥者
	public House constructHouse() {
		houseBuilder.buildBasic();
		houseBuilder.buildWalls();
		houseBuilder.roofed();
		return houseBuilder.buildHouse();
	}


}
