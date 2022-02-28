package com.dev.service;
import com.dev.beans.*;
import com.dev.dao.ClientDao;
import com.dev.dao.ClientImpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.dev.repo.*;
public class ClientImpl1 implements ClientService {
   ClientDao client = new ClientImpl();
	@Override
	public boolean changePassword(Integer client_id, String oldpassword, String newpassword) {
		return client.changePassword(client_id, oldpassword, newpassword);
	}

	@Override
	public Contract addContract(Integer clientId, Contract c1,String Password) {
		return client.addContract(clientId, c1,Password);
	}

	@Override
	public Contract searchContract(Integer contract_id, Integer client_id, String Password) {
		return client.searchContract(contract_id, client_id, Password);
	}

	@Override
	public Contract updateContract(Integer cust_id, String Password) {
		return client.updateContract(cust_id, Password);
	}

	@Override
	public Client deleteContract(Integer contract_id, Integer client_id, String Password) {
		return client.deleteContract(contract_id, client_id, Password);
	}

	@Override
	public boolean addOrder(Integer clientId, String password) {
		return client.addOrder(clientId, password);
	}

	@Override
	public Orders deleteOrder(Integer orderId, String Password) {
		return client.deleteOrder(orderId, Password);
	}

	@Override
	public Orders searchOrder(Integer orderId, String Password) {
		return client.searchOrder(orderId, Password);
	}


}