package com.ustc.bike;

import com.ustc.brand.InterfaceBrand;

/**
 * @Author: GoodbyeLullaby
 * @Date: 2019/12/8
 */

public class RoadBike extends AbstractBike {
	public RoadBike(InterfaceBrand brand, String color) {
		super(brand, color);
	}
	public void print(){
		System.out.println("属性：公路车");
		System.out.println("颜色："+color);
		brand.showBrand();
		System.out.println("---------------");
	}
}
