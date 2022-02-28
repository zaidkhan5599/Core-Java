package com.ty.springcore.annotationtest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ty.springcore.baseInfobean.Pet;
import com.ty.springcore.config.PetConfig;

public class AnimalTest {
	public static void main(String[] args) {
		
	
	ApplicationContext context = new AnnotationConfigApplicationContext(PetConfig.class);
	Pet pet=context.getBean(Pet.class);
	pet.getAnimal().eat();
	pet.getAnimal().speaks();
	

}
}