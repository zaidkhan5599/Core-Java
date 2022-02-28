package com.ty.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ty.springcore.beans.MessageBean;
import com.ty.springcore.beans.MessageBean2;
import com.ty.springcore.beans.MessageBean3;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//     ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//     MessageBean messageBean = (MessageBean)context.getBean("messageBean");
//     System.out.println(messageBean.getMessage());
//   
//     MessageBean messageBean2 = context.getBean("messageBean", MessageBean.class);
//     messageBean2.setMessage("Inside 2");
//     System.out.println("Message" +messageBean.getMessage());
//     System.out.println("Message2 "+messageBean2.getMessage());
//     System.out.println(messageBean.hashCode());
//     System.out.println(messageBean2.hashCode());
    	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    	
    	MessageBean3 messageBean =(MessageBean3) context.getBean("newMessage");
    	System.out.println("Message "+messageBean.getMessage());
    	((AbstractApplicationContext)context).registerShutdownHook();
    	
     
    }
}




