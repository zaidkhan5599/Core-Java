package com.dev.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.dev.beans.Client;
import com.dev.beans.Contract;
import com.dev.beans.Haulier;
import com.dev.beans.Orders;
import com.dev.repo.*;
public class AdminImpl implements AdminDao {
   static ClientRepo db = new ClientRepo();
   Client c = new Client();
   OrderRepo order = new OrderRepo();
   HaulierRepo haul = new HaulierRepo();
   Scanner sc = new Scanner(System.in);
	@Override
	public Client createProf(Client client) {
		db.map.put(client.getId(), client);
		return db.map.get(client.getId());
		
	}

	@Override
	public Client deleteProf(Integer client_id) {
		 c=db.map.get(client_id);
		 db.map.remove(client_id);
		 return c;
		
	}

	@Override
	public boolean updateProf(Integer clientId) {
		if(db.map.containsKey(clientId))
		{
		Client client = db.map.get(clientId);
		System.out.println("Enter name you want to change");
		String name = sc.nextLine();
		System.out.println("Enter email you want to chane");
		String email = sc.nextLine();
		System.out.println("Enter telephone you want to change");
		String telephone = sc.nextLine();
		System.out.println("Enter adddres");
		String address = sc.nextLine();
		client.setCust_name(name);
		client.setEmail(email);
		client.setTelephone(telephone);
		client.setAddress(address);
		return true;
		}
		else
		{
			return false;
		}
	}

	@Override
	public List<Client> displayAll() {
		Iterator<Client> it = db.map.values().iterator();
		ArrayList<Client>ls = new ArrayList<Client>();
		while(it.hasNext())
		{
			ls.add(it.next());
		}
		return ls;
	}
	public void displayContracts()
	{
		List<Client> ls=new ArrayList<Client>();
		Iterator<Client> it = db.map.values().iterator();
		while(it.hasNext())
		{
			ls.add(it.next());
		}
		System.out.println(ls);
		System.out.println("Contract assigned is");
		for(Client c :ls)
		{
			System.out.println(c.getCon());
		}
		System.out.println("Inventory in the contract is");
		for(Client c:ls)
		{
			System.out.println(c.getCon().getList().getLs());
		}
		
	}
	public List<Orders> displayAllorders()
	{ 
		List<Client> list = new ArrayList<Client>();
		List<Orders>order = new ArrayList<Orders>();
		Iterator<Client> iterator = db.map.values().iterator();
		while(iterator.hasNext())
		{
		list.add(iterator.next());
		}
		for(int i=0;i<list.size();i++)
		{
		if(list.get(i).getOrder()!=null)
		{
			System.out.println(list);
			order.add(list.get(i).getOrder());
		}
		}
		return order;
		
	}

	
	
	@Override
	public Client searchClient(Integer clientid) {
		Client client=db.map.get(clientid);
		return client;
	}

	

}
