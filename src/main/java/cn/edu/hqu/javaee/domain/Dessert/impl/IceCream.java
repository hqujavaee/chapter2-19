package cn.edu.hqu.javaee.domain.Dessert.impl;

import cn.edu.hqu.javaee.domain.Dessert.Dessert;

public class IceCream implements Dessert {
	static private int id=0;
	public IceCream() {
		id++;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "冰激凌"+id;
	}

}
