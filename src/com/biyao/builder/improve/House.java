package com.biyao.builder.improve;

/**
 * @author hxs
 * Title: 构建者模式
 * Description: 一个具体的产品对象
 */
public class House {
	private String baise;
	private String wall;
	private String roofed;
	public String getBaise() {
		return baise;
	}
	public void setBaise(String baise) {
		this.baise = baise;
	}
	public String getWall() {
		return wall;
	}
	public void setWall(String wall) {
		this.wall = wall;
	}
	public String getRoofed() {
		return roofed;
	}
	public void setRoofed(String roofed) {
		this.roofed = roofed;
	}

}

