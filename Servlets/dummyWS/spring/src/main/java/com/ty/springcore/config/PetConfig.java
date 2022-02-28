package com.ty.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.ty.springcore.baseInfobean.Dog;
import com.ty.springcore.baseInfobean.Pet;
import com.ty.springcore.baseInfobean.Tiger;

@Configuration
public class PetConfig {
	
	@Bean
	public Pet getPet() {
	
		return new Pet();
	}
	

}
