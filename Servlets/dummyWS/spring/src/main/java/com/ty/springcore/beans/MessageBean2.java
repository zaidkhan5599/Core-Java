package com.ty.springcore.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class MessageBean2 implements InitializingBean, DisposableBean {
    private String message;
    
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Destroy Phase");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initialization Phase");
		
	}

}
