package com.ustc.bike;

import com.ustc.brand.InterfaceBrand;

/**
 * @Author: GoodbyeLullaby
 * @Date: 2019/12/8
 */

public abstract class AbstractBike {
	InterfaceBrand brand;//自行车的品牌
	String color;//自行车的颜色

	public AbstractBike(InterfaceBrand brand, String color) {
		this.brand = brand;
		this.color = color;
	}

	public void print(){
		System.out.println();
	}


	public InterfaceBrand getBrand() {
		return brand;
	}

	public void setBrand(InterfaceBrand brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
