package com.dev.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.dev.beans.Client;
import com.dev.beans.Contract;
import com.dev.beans.Haulier;
import com.dev.beans.Orders;
import com.dev.dao.AdminDao;
import com.dev.dao.AdminImpl;
import com.dev.repo.*;
public class AdminImpl1 implements AdminService {
 AdminDao admin = new AdminImpl();
	@Override
	public Client createProf(Client client) {
		return admin.createProf(client);
	}

	@Override
	public Client deleteProf(Integer client_id) {
		return admin.deleteProf(client_id);
	}

	@Override
	public boolean updateProf(Integer clientId) {
		return admin.updateProf(clientId);
	}

	@Override
	public Client searchClient(Integer clientid) {
		return admin.searchClient(clientid);
	}

	@Override
	public void displayContracts() {
		admin.displayContracts();
		
	}

	@Override
	public List<Orders> displayAllorders() {
		return admin.displayAllorders();
	}

	@Override
	public List<Client> displayAll() {
		return admin.displayAll();
	}
   
	

}
