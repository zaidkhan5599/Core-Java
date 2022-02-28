package com.ty.springcore.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import lombok.Data;

public class MessageBean {
	private String message;
 
 public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	@PostConstruct
	public void init()
	{
		System.out.println("Init-Phase!");
	}
	@PreDestroy
	public void destroy()
	{
		System.out.println("Its Destroy Phase!!!!!!!");
	}
	

}
