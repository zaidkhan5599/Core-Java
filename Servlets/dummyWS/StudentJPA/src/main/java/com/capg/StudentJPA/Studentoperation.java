package com.capg.StudentJPA;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capg.StudentJPA.dto.Student;

public class Studentoperation {
	
	public static void main(String[] args) {
		EntityManagerFactory efactory = Persistence.createEntityManagerFactory("persistence");
		Student student = new Student();
		Scanner sc = new Scanner(System.in);
		
		
		outer:while(true)
		{
			while(true)
				
			{
				System.out.println("1.Create");
				System.out.println("2.Update");
				System.out.println("3.Delete");
				System.out.println("4.Exit");
				System.out.println("Enter your choice");
				Integer integer = Integer.parseInt(sc.nextLine());
			
			switch(integer)
			{
			case 1: 
			        EntityManager entity = efactory.createEntityManager();
			        System.out.println("Enter student id");
			        Integer id = Integer.parseInt(sc.nextLine());
			        System.out.println("Enter student name");
			        String name = sc.nextLine();
			        System.out.println("Enter student contact");
			        Long long1 = Long.parseLong(sc.nextLine());
			        System.out.println("Enter student email");
			        String email = sc.nextLine();
			        student.setId(id);
			        student.setName(name);
			        student.setEmail(email);
			        student.setContact(long1);
			       
				try {
					EntityTransaction transaction = entity.getTransaction();
			        transaction.begin();
			        entity.persist(student);
			        transaction.commit();
			        break;
				} catch (Exception e) {
					
					e.printStackTrace();
				}
				entity.close();
			
			case 2: entity = efactory.createEntityManager();
			        EntityTransaction transaction = entity.getTransaction();
			        transaction.begin();
			        System.out.println("Enter id u want to update");
			        id = Integer.parseInt(sc.nextLine());
			        student = entity.getReference(Student.class,id );
			        System.out.println(student);
			        System.out.println("Enter your email");
			        email = sc.nextLine();
			        System.out.println("Enter contact no");
			        long1 = Long.parseLong(sc.nextLine());
			        student.setEmail(email);
			        student.setContact(long1);
				try {
					entity.persist(student);
					transaction.commit();
				} catch (Exception e) {
					transaction.rollback();
					e.printStackTrace();
				}
			        entity.close();
			        		
			break;
			case 3:
				
					entity = efactory.createEntityManager();
				    transaction = entity.getTransaction();
				    transaction.begin();
				    System.out.println("Enter id u want to update");
			        id = Integer.parseInt(sc.nextLine());
			        try {
			        student = entity.find(Student.class,id );
			        entity.remove(student);
			        transaction.commit();
				} catch (NumberFormatException e) {
					transaction.rollback();
					e.printStackTrace();
				}
			        break;
			case 4:
				    break outer;
				    
				
			}
		}
	}

	}
}
