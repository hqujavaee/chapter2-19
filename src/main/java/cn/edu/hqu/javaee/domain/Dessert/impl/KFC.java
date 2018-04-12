package cn.edu.hqu.javaee.domain.Dessert.impl;

import cn.edu.hqu.javaee.domain.Dessert.Shop;


public class KFC implements Shop {
	
	static private int id=0;
	public KFC() {
		id++;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "KFC-"+id;
	}

}
