package com.ty.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.ty.springcore.baseInfobean.Dog;
import com.ty.springcore.baseInfobean.Tiger;
@Configuration
public class AnimalConfig {
	@Bean(name="tiger")
	public Tiger getAnimal() {
	
		return new Tiger();
	}
	@Bean(name="Dog")
	@Primary
	public Dog getDog() {
	
		return new Dog();
	}

}
