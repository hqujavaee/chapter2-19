package cn.edu.hqu.javaee.domain.Dessert.impl;

import cn.edu.hqu.javaee.domain.Dessert.Consumer;
import cn.edu.hqu.javaee.domain.Dessert.Shop;

public class Child implements Consumer {

	private static int id=0;
	public Child() {
		id++;
	}
	private Shop container;
	private IceCream iceCream;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "小孩-"+id;
	}

	public Shop getContainer() {
		return container;
	}

	public void setContainer(Shop container) {
		this.container = container;
	}

	public IceCream getIceCream() {
		return iceCream;
	}

	public void setIceCream(IceCream iceCream) {
		this.iceCream = iceCream;
	}

	@Override
	public void consume() {
		System.out.println(toString()+"正在"+container.toString()+"吃"+iceCream.toString());
	}
}
