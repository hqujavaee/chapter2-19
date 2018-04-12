package cn.edu.hqu.javaee;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.edu.hqu.javaee.domain.Dessert.impl.Child;

public class Chapter219Application {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("classpath:config.xml");
		for(int i=0;i<10;i++) {
			Child child=context.getBean(Child.class);
			child.consume();
		}
		
		context.close();
	}
}
