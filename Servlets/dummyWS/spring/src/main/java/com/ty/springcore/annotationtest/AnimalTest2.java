package com.ty.springcore.annotationtest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ty.springcore.baseInfobean.Pet;

public class AnimalTest2 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("petConfig.xml");
		Pet pet = context.getBean("pet",Pet.class);
		pet.getAnimal().speaks();
		pet.getAnimal().eat();
	}

}
