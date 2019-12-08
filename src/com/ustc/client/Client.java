package com.ustc.client;

import com.ustc.bike.AbstractBike;
import com.ustc.bike.MountatinBike;
import com.ustc.bike.RoadBike;
import com.ustc.brand.GiantBrand;
import com.ustc.brand.InterfaceBrand;

/**
 * @Author: GoodbyeLullaby
 * @Date: 2019/12/8
 */

public class Client {
	public  void test() {
		InterfaceBrand brand1=new GiantBrand();
		InterfaceBrand brand2=new GiantBrand();
		AbstractBike bike1=new MountatinBike(brand1,"黑色");
		AbstractBike bike2=new RoadBike(brand1,"红色");
		AbstractBike bike3=new MountatinBike(brand2,"黑色");
		AbstractBike bike4=new RoadBike(brand2,"红色");

		bike1.print();
		bike2.print();
		bike3.print();
		bike4.print();


	}
}
