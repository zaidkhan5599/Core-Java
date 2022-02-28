package com.ty.springcore.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.ty.springcore.beans.MessageBean;


@Configuration
public class MessageConfig {
	
	@Bean
//	@Scope("prototype")
	 public MessageBean getMessageBean()
	 {
		MessageBean messageBean = new MessageBean();
		messageBean.setMessage("Hello Spring World");
		return messageBean;
	 }

}
