package com.ty.springcore.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class MessageBean3  {
    private String message;
    public MessageBean3()
    {
    	System.out.println("Constructor");
    }
    
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public void init()
	{
		System.out.println("Its My Initialize phase");
	}
	public void destroy()
	{
		System.out.println("My destroy phase");
	}

	

}
