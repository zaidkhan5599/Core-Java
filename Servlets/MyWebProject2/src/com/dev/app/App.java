package com.dev.app;
//import com.dev.dao.*;
import java.util.*;
import com.dev.services.*;
import java.util.Scanner;
//import com.dev.dao.*;
import com.dev.beans.*;
import com.dev.exceptions.*;
public class App {
	public static void main(String[] args) {
		//StudentDao s = new RepoImpl();
		//Student s1 = new Student();
		Scanner sc = new Scanner(System.in);
		CreateException c = new CreateException();
		SearchIdNotFound se = new SearchIdNotFound();
		UpdateException u = new UpdateException();
		List<Student>l;
		StudentService stu = new StudentServiceImpl();
//		System.out.println("Enter  id");
//		int id2 = Integer.parseInt(sc.nextLine());
//		System.out.println("Enter password");
//		String password1 = sc.nextLine();
//		s.login(id2, password1);
		Integer n=0;
		outer:while(true)
		{
			System.out.println("1.Creating new Profile");
			System.out.println("2.Searching ");
			System.out.println("3.Updating");
			System.out.println("4.Deletion");
			System.out.println("5.Display all");
			System.out.println("6.Exit");
			
			n=Integer.parseInt(sc.nextLine());
		
				switch(n)
			{
			
			
			case 1:boolean b=stu.createProfile();
				System.out.println(b);
                if(b)
				{
                System.out.println("Successfully added");
                break;
				}
				else {
					System.out.println("Unsuccessful");
				}
			   
			    break;
			    
			case 2:System.out.println("Enter id for searching the student");
			       int id1 = Integer.parseInt(sc.nextLine());
			       if(stu.search_student(id1)==null)
			       {
			    	 throw se;  
			       }
			       else
			       {
			    	   Student s2 = stu.search_student(id1);
			    	   System.out.println(s2);
			       }
			       break;
			case 3:System.out.println("Enter id of student you want to update");
			       int id= Integer.parseInt(sc.nextLine());
			       System.out.println("Enter student name you want to update");
			       String name = sc.nextLine();
			       System.out.println("Enter password of student profile");
			       String password = sc.nextLine();
			      boolean statusu= stu.update_student(id, name, password);
			      if(!statusu)
			      {
			    	  throw u;
			      }
			       break;
			case 4:System.out.println("Enter student id you want to delete");
			       id = Integer.parseInt(sc.nextLine());
			       System.out.println("Enter student name you want to delete");
			       name = sc.nextLine();
			      boolean s2= stu.deleteStudent(id, name);
			      System.out.println(s2);
			       if(!s2)
			       {
			    	   throw u;
			       }
			      
			       break;
			case 5:l=stu.display_all();
			        System.out.println(l);
			       break;
			case 6:break outer;
				   
			       
			}
		}
	}

}
