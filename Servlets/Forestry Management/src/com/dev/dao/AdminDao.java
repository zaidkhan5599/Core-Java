package com.dev.dao;

import java.util.List;

import com.dev.beans.Client;
import com.dev.beans.Contract;
import com.dev.beans.Haulier;
import com.dev.beans.Orders;

public interface AdminDao {
	public Client createProf(Client client);
	public Client deleteProf(Integer client_id);
	public boolean updateProf(Integer clientId);
	public Client searchClient(Integer clientid);
	public void displayContracts();
	public List<Orders> displayAllorders();
	public List<Client> displayAll();

}
