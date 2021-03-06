package com.dev.app;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.dev.beans.Admin;
import com.dev.beans.Client;
import com.dev.beans.Contract;
import com.dev.beans.Haulier;
import com.dev.beans.Inventories;
import com.dev.beans.Orders;
import com.dev.beans.Product;
import com.dev.beans.Resources;
import com.dev.service.Scheduler.*;
import com.dev.service.*;

public class Adminapp {
	public static boolean admin(String username, String Password,Admin a)
	{
		if(a.getUsername().equals(username)&&a.getPassword().equals(Password))
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Admin a = new Admin("Bharat","Bharat");
		Scanner sc = new Scanner(System.in);
		ClientService c3 = new ClientImpl1();
		AdminService admin = new AdminImpl1();
		ResourseService res = new ResourcesImpl1();
		HaulierService haul = new HaulierImpl1();
		Client c;
		List<Client>client = null;
		List<Contract>contract;
		List<Orders>orders;
		Pattern pt;
		outer:while(true)
		{
			System.out.println("A.Admin Module");
			System.out.println("B.Client Module");
			System.out.println("C.Scheduler Module");
			System.out.println("D.Resources");
			char choice = sc.nextLine().charAt(0);
			switch(choice)
			{
			case 'A':
				
				System.out.println("Enter username");
				String name = sc.nextLine();
				System.out.println("Enter Password");
				String password = sc.nextLine();
				boolean b=admin(name,password,a);
		
			inner:while(true)
			{
				if(b)
				{
				System.out.println("A.Add Client");
				System.out.println("B.Delete Client");
				System.out.println("C.Update Client");
				System.out.println("D.Display all client");
				System.out.println("E.Display all contracts");
				System.out.println("F.Display all orders");
				System.out.println("G.Add Resources");
				System.out.println("H.Go to Outer menu");
				System.out.println("Enter option");
				char l = sc.nextLine().charAt(0);
				switch(l)
				{
				case 'A' :c = new Client();
				          
				          System.out.println("Enter client id");
				          Integer id = Integer.parseInt(sc.nextLine());
				          c.setId(id);
				          System.out.println("Enter client name");
				          String name1 = sc.nextLine();
				          c.setCust_name(name1);
				          System.out.println("Enter email address");
				          String email = sc.nextLine();
				          c.setEmail(email);
				          System.out.println("Enter address");
				          String address = sc.nextLine();
				          c.setAddress(address);
				          System.out.println("Enter password");
				          String password1 = sc.nextLine();
				          c.setPassword(password1);
				          System.out.println("Enter telephone no in the form +91-****");
				          String telephone = sc.nextLine();
				          pt = Pattern.compile("\\W\\d{2}\\W\\d{10}");
				          Matcher mat = pt.matcher(telephone);
				          if(mat.matches())
				          {
				        	  c.setTelephone(telephone);
					          admin.createProf(c);
				          }
				          else
				          {
				        	  System.out.println("Pls enter in the correct form contact no");
				        	  c.setTelephone(telephone);
					          admin.createProf(c);
				          }
				        
				          break;
				          
				case 'B':System.out.println("Enter the client id you want to delete");
				         Integer id1 = Integer.parseInt(sc.nextLine());
				         Client c2=admin.deleteProf(id1);
				         System.out.println(c2);
                
				case 'C':System.out.println("Enter client id you want to change");
				         Integer id2 = Integer.parseInt(sc.nextLine());
					     b=admin.updateProf(id2);
					     if(!b)
					     {
					    	 
					     }
					     else
					     {
					    	 System.out.println("Updated Successfully");
					     }
					     break;
				case 'D':client = new ArrayList<Client>();
				         client = admin.displayAll();
				         Iterator<Client> it = client.iterator();
				         while(it.hasNext())
				         {
				        	 System.out.println(it.next());
				         }
				         break;
				case 'E':admin.displayContracts();
				         break;
					     
				case 'F':
					     List<Orders> list=admin.displayAllorders();
				         Iterator<Orders> it2 = list.iterator();
				         while(it2.hasNext())
				         {
				        	
				        		System.out.println(it2.next());
				        		 
				         }
				        break;
				case 'G':
					      Resources reso = new Resources();
					      b=res.addResources(reso);
					      if(!b)
					      {
					    	  
					      }
					      else
					      {
					    	  System.out.println("Resources are added");
					      }
					      break;
				case 'H':
					     break inner;
				}	
					     
				}
				else
				{
					System.out.println("Password Incorrect");
					break inner;
				}
				
			}
				break;
			case 'B':
				   inner: while(true)
				    {
					   System.out.println("1.Add a contract");
					   System.out.println("2.Search a contract");
					   System.out.println("3.Delete a contract");
					   System.out.println("4.Update a contract");
					   System.out.println("5.Change a password");
					   System.out.println("6.Add a Order");
					   System.out.println("7.Delete a Order");
					   System.out.println("8.Search a Order");
					   System.out.println("9.Exit");
					   System.out.println("Enter choice");
					   Integer choicec = Integer.parseInt(sc.nextLine());
					   
					   switch(choicec)
					   {
					   case 1: Contract c1 = new Contract();
					           System.out.println("Enter client id");
					           Integer id = Integer.parseInt(sc.nextLine());
					           c1.setContract_id(id);
					           System.out.println("Enter client password");
					           String Password = sc.nextLine();
					           LocalDate date =  LocalDate.now();
					           DateTimeFormatter formatt =DateTimeFormatter.ofPattern("dd/MM/YYYY");
					           String strDate = formatt.format(date);
					           c1.setPlacedondate(strDate);
					           Inventories it = new Inventories();
					           List<Product>ls = new ArrayList<Product>();
					           Product p = new Product();
				               ls.add(p);
					         
					              Product:while(true)
					              {
					            	  System.out.println("1.Add more products");
							          System.out.println("2.Push the chart");
							          Integer ch =Integer.parseInt(sc.nextLine());
					            	  switch(ch)
					            	  {
					            	  case 1:
					            		  p = new Product();
							              ls.add(p);
							               break ;
					            	  case 2:
					            		 break Product;
							                
					            	  }
			
					              }
					        		  
					          it.setLs(ls);
					          c1.setList(it);
					           Contract cont=c3.addContract(id, c1,Password);
					           System.out.println(cont);
					           System.out.println(cont.getList().getLs());
					           break;
					   
					   case 2:System.out.println("Enter your id or contract id");
					           Integer contractId = Integer.parseInt(sc.nextLine());
					           System.out.println("Enter password ");
					          String password1 = sc.nextLine();
						      Contract contractSearch=c3.searchContract(contractId, contractId, password1);
						      System.out.println(contractSearch);
						      System.out.println(contractSearch.getList().getLs());
						      break;
					   case 3:
						   System.out.println("Enter your id or contract id");
				            contractId = Integer.parseInt(sc.nextLine());
				           System.out.println("Enter password ");
				           Password = sc.nextLine();
						   Client clientdel=c3.deleteContract(contractId, contractId, Password);
						   System.out.println("Contract for client is deleted");
						   System.out.println(clientdel);
						   break;
					   case 4:
						      System.out.println("Enter id for contract update");
						      contractId = Integer.parseInt(sc.nextLine());
					           System.out.println("Enter password ");
					          Password = sc.nextLine();
					          contractSearch=c3.updateContract(contractId, Password);
					          System.out.println(contractSearch);
					          System.out.println(contractSearch.getList().getLs());
					          break;
					   case 5:
						      System.out.println("Enter id for contract update");
						       Integer clientId = Integer.parseInt(sc.nextLine());
					           System.out.println("Enter old password ");
					           Password = sc.nextLine();
					          System.out.println("Enter new password");
					          String newpassword = sc.nextLine();
						      c3.changePassword(clientId, Password, newpassword);
						      break;
					   case 6:
						       System.out.println("Enter id for order placement");
						       id = Integer.parseInt(sc.nextLine());
						       System.out.println("Enter Password for order placement");
						       password = sc.nextLine();
						       c3.addOrder(id, password);
						       
						       break;
					   case 7:
						      System.out.println("Enter id for contract deletion");
						      contractId = Integer.parseInt(sc.nextLine());
					          System.out.println("Enter password ");
					          Password = sc.nextLine();
						      c3.deleteOrder(contractId,Password);
						      break;
					   case 8:
						      System.out.println("Enter id for order search");
						      contractId = Integer.parseInt(sc.nextLine());
					          System.out.println("Enter password ");
					          Password = sc.nextLine();
						      Orders ord=c3.searchOrder(contractId,Password);
						      System.out.println(ord);
						   
						      break;
					   case 9:
						      break inner;
					   }      
				    }
			break;
					   case 'C':
						   inner:while(true)
						   {
							   System.out.println("1.Add Haulier");
							   System.out.println("2.Delete Haulier");
							   System.out.println("3.Assign Haulier to Contract");
							   System.out.println("4.Display all Hauliers");
							   System.out.println("5.Add Resources into Product Cart");
							   System.out.println("6.Exit");
							   System.out.println("Enter your choice");
							   Integer choicesc = Integer.parseInt(sc.nextLine());
							   switch(choicesc)
							   {
							   case 1:
								      Haulier haul1 = new Haulier();
								      haul.addHaulier(haul1);
								      break;
							   case 2:
								      System.out.println("Enter Haulier id");
								      Integer haulierId = Integer.parseInt(sc.nextLine());
								      haul1=haul.deleteHaulier(haulierId);
								      System.out.println(haul1);
								      break;
							   case 3:
								       System.out.println("Enter Admin id");
								       String id = sc.nextLine();
								       System.out.println("Enter Admin Password ");
								       String password1 = sc.nextLine();
								       boolean b1=admin(id,password1,a);
								       if(b1) {
								       haul1=haul.assignedHaulier();
								       System.out.println("Haulier is assigned for contract");
								       System.out.println(haul1);
								       }
								       break;
							   case 4:
								     List<Haulier>list = new ArrayList<Haulier>();
								      list=haul.displayAll();
								      System.out.println(list);
								      break;
							   case 5:
								       Resources reso = new Resources();
								       res.addResources(reso);
								       break;
							   case 6:
								     break inner;
								   
							   
								      
							   }
							   
						   }
					   break;
					   case 'D':
						  inner: while(true)
						   {
						       System.out.println("1.Add resources");
					           System.out.println("2.Update Resources");
					           System.out.println("3.Delete Resources");
					           System.out.println("4.List of all resources");
					           System.out.println("5.Exit");
					           System.out.println("Enter your choice");
					           Integer choice1 = Integer.parseInt(sc.nextLine());
					           switch(choice1)
					           {
					           case 1:
					        	       Resources resources = new Resources();
					        	       boolean dec=res.addResources(resources);
					        	       if(!dec)
					        	       {
					        	    	   System.out.println("Addition of resources operation was not completed");
					        	       }
					        	       break;
					           case 2:
					        	       System.out.println("Enter the resource id you want to update");
					        	       Integer resourceid = Integer.parseInt(sc.nextLine());
					        	       System.out.println("Enter the quantity you want to update");
					        	       Long quantity = Long.parseLong(sc.nextLine());
					        	       res.updateResources(resourceid, quantity);
					        	       break;
					           case 3:
					        	       System.out.println("Enter the resource id you want to delete");
					        	       resourceid = Integer.parseInt(sc.nextLine());
					        	       res.deleteResources(resourceid);
					        	       break;
					           case 4:
					        	      System.out.println("Resources available are :");
					        	      List<Resources>ls = new ArrayList<Resources>();
					        	      ls = res.displayAll();
					        	      Iterator it = ls.iterator();
					        	      while(it.hasNext())
					        	      {
					        	    	  System.out.println(it.next());
					        	      }
					        	       break;
					           case 5:
					        	      break inner;
					        	   
					        	       
					        	       
					           }
						   
					           
				    
			
			
						   }
			
		}
			}
		
	}
	}

