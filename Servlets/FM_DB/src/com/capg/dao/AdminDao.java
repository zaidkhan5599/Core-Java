package com.capg.dao;

import java.util.List;

import com.capg.beans.Client;
import com.capg.beans.Contract;
import com.capg.beans.Haulier;
import com.capg.beans.Orders;

public interface AdminDao {
	public boolean createProf(Client client);
	public Client deleteProf(Integer client_id);
	public boolean updateProf(String password,Integer id,Client client);
	public Client searchClient(Integer clientid);
	public void displayContracts();
	public void displayAllorders();
	public List<Client> displayAll();

}
