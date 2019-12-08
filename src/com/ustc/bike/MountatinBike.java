package com.ustc.bike;

import com.ustc.brand.InterfaceBrand;

/**
 * @Author: GoodbyeLullaby
 * @Date: 2019/12/8
 */

public class MountatinBike extends AbstractBike {
	public MountatinBike(InterfaceBrand brand, String color) {
		super( brand, color);
	}
	public void print(){
		System.out.println("属性：山地车");
		System.out.println("颜色："+color);
		brand.showBrand();
		System.out.println("---------------");
	}
}
