package com.dev.dao;
import com.dev.beans.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.dev.repo.*;
public class ClientImpl implements ClientDao {
ClientRepo rep = new ClientRepo();
Client cust = new Client();
Product pro;
ResourcesRepo res = new ResourcesRepo();
OrderRepo order = new OrderRepo();
Scanner sc = new Scanner(System.in);
long available;
long required;
@Override
public boolean changePassword(Integer client_id, String oldpassword, String newpassword) {
	if(rep.map.containsKey(client_id))
	{
		cust = rep.map.get(client_id);
		if(cust.getPassword().equals(oldpassword))
		{
			cust.setPassword(newpassword);
			return true;
		}
		return false;
	}
	return false;
	 
}
@Override
public Contract addContract(Integer clientId,Contract c1,String Password) {
	if(rep.map.get(clientId).getPassword().equals(Password))
	{
	Client client=rep.map.get(clientId);
	String no = client.getTelephone();
	List<Product> l1 = c1.getList().getLs();
	for(int i=0;i<l1.size();i++)
	{
		pro=l1.get(i);
		
		if(res.map.containsKey(pro.getProduct_id()))
		{
			available=res.map.get(pro.getProduct_id()).getResource_quantity();
		    required=c1.getList().getLs().get(0).getQuantity();
			if(required>available)
			{
				System.out.println("Quantity exceeds limit");
				return null;
			}
			available=available-required;
			res.map.get(pro.getProduct_id()).setResource_quantity(available);
			System.out.println(res.map.get(pro.getProduct_id()).getResource_quantity());
			available=0;
			required=0;
		}
		else
		{
			return null;
		}
	}
	
	
	cust =rep.map.get(clientId);
	cust.setCon(c1);
	cust.getCon().setContact_no(client.getTelephone());
	rep.map.put(clientId, cust);
	return cust.getCon();
	}
	return null;
	
	}
	
	

@Override
public Contract searchContract(Integer contract_id,Integer client_id,String Password) {
	 cust = rep.map.get(client_id);
	 if(cust.getPassword().equals(Password))
{
	if(cust.getCon().getContract_id().equals(contract_id))
	{
		return cust.getCon();
	}
	return  null;
}
	 return null;
}
@Override
public Contract updateContract(Integer client_id,String Password) {
	if(rep.map.containsKey(client_id))
	{
		if(rep.map.get(client_id).getPassword().equals(Password))
		{
			if(rep.map.get(client_id).getCon()!=null)
			{
			List<Product> l1=rep.map.get(client_id).getCon().getList().getLs();
			Product:while(true)
			{
			System.out.println("1.Add Product to the inventory of the contract");
			System.out.println("2.Delete Product from the inventory of the contract");
			System.out.println("3.Exit");
			System.out.println("Enter the choice you ");
			Integer choice = Integer.parseInt(sc.nextLine());
			switch(choice)
			{
			case 1:
				   Product p = new Product();
				   Long required=p.getQuantity();
				   if(res.map.containsKey(p.getProduct_id()))
				   {
					   Long available=res.map.get(p.getProduct_id()).getResource_quantity();
					   if(available<required)
					   {
						   System.out.println("Quantity out of limit");
						   break;
					   }
					   else
					   {
						   available = available-required;
						   res.map.get(p.getProduct_id()).setResource_quantity(available);
						   
					   }
				   }
				   l1.add(p);
				   Client clientup = rep.map.get(client_id);
				   clientup.getCon().getList().setLs(l1);
				   break;
			case 2:
				   System.out.println("Enter product id you want to delete");
				   Integer product_id = Integer.parseInt(sc.nextLine());
				   Long available1=res.map.get(product_id).getResource_quantity();
				   for(int i=0;i<l1.size();i++)
				   {
					   if(l1.get(i).getProduct_id().equals(product_id))
					   {
						  Long required1=l1.get(i).getQuantity();
						  available1= available1-required1;
						  res.map.get(product_id).setResource_quantity(available1);
						   l1.remove(i);
					   }
					  
				   }
				   break;
			case 3 :
				  break Product;
				
			}
			
			}
			Client clientup = rep.map.get(client_id);
			clientup.getCon().getList().setLs(l1);
			rep.map.put(client_id, clientup);
			
			
			return clientup.getCon();
		}
		return null;
	}
	return null;
	}
	return null;
}
@Override
public Client deleteContract(Integer contract_id,Integer client_id,String Password) {
	if(rep.map.get(client_id).getPassword().equals(Password))
	{
		List<Product>ls= rep.map.get(client_id).getCon().getList().getLs();
		rep.map.get(client_id).getCon().getList().getLs().removeAll(ls);
		rep.map.get(client_id).setCon(null);
	    return rep.map.get(client_id);
	}
	return null;
	
}

@Override
public boolean addOrder(Integer clientId,String Password) {
	 List<Product> ls1 = new ArrayList<Product>();
	 Inventories list = new Inventories();
	 Orders order = new Orders();
	if(rep.map.get(clientId).getPassword().equals(Password))
	{
		
		if(rep.map.get(clientId).getOrder()==null) {
	     List<Inventories>ls = new ArrayList<Inventories>();
		 Inventories it1 = new Inventories();
		
     order:while(true)
     {
  	   System.out.println("1.Add Item into order cart");
  	   System.out.println("2.Pass the Order for deployment");
  	   System.out.println("3.Exit");
  	   System.out.println("Enter option");
  	   Integer orderchoice = Integer.parseInt(sc.nextLine());
  	   switch(orderchoice)
  	   {
  	   case 1:
  		   Product product = new Product();
  		 if(res.map.containsKey(product.getProduct_id()))
		  {
			 long available= res.map.get(product.getProduct_id()).getResource_quantity();
			 long required = product.getQuantity();
			 if(available<required)
			 {
				 System.out.println("Order item"+pro.getProduct_name()+"is unavailable at the time");
				 return false;
			 }
			
		  }
		  else
		  {
			  System.out.println("Product does not match with available resources");
			  return false;
		  }
	           ls1.add(product);
	           list.setLs(ls1);
	          
	           break;
  	   case 2:
  		     ls.add(list);
  		     order.setList(ls);
  		     rep.map.get(clientId).setOrder(order);
  		     break order;
  		   
  	   }
     }
		}
		else
		{
			List l1=rep.map.get(clientId).getOrder().getList();
			 order:while(true)
		     {
		  	   System.out.println("1.Add Item into order cart");
		  	   System.out.println("2.Pass the Order for deployment");
		  	   System.out.println("3.Exit");
		  	   System.out.println("Enter option");
		  	 Integer orderchoice = Integer.parseInt(sc.nextLine());
		  	 switch(orderchoice)
		  	   {
		  	   case 1:
		  		   Product product = new Product();
		  		 if(res.map.containsKey(product.getProduct_id()))
				  {
					 long available= res.map.get(product.getProduct_id()).getResource_quantity();
					 long required = product.getQuantity();
					 if(available<required)
					 {
						 System.out.println("Order item"+pro.getProduct_name()+"is unavailable at the time");
						 return false;
					 }
					
				  }
				  else
				  {
					  System.out.println("Product does not match with available resources");
					  return false;
				  }
		  		 
			           ls1.add(product);
			           list.setLs(ls1);
			          
			           break;
		  	   case 2:
		  		      l1.add(list);
		  		      order.setList(l1);
		  		      rep.map.get(clientId).setOrder(order);
		  		      break order;
		  	   }
		     }
		}
	}
	return false;
		  	   }
	 
	
	
	  
		    
@Override
public Orders deleteOrder(Integer orderId,String Password) {
	if(rep.map.get(orderId).getPassword().equals(Password))
	{
	if(order.map.containsKey(orderId))
	{
		Orders ord = order.map.get(orderId);
		order.map.remove(orderId);
		return ord;
	}
	else
	{
		System.out.println("Order is not present");
		return null;
	}
	}
	return null;
}
@Override
public Orders searchOrder(Integer orderId,String Password) {
	if(rep.map.get(orderId).getPassword().equals(Password))
	{
	if(order.map.containsKey(orderId))
	{
	Orders ord=order.map.get(orderId);
	return ord;
	}
	else
	{
		System.out.println("Order not found");
		return null;
	}
}
	return null;
}

}