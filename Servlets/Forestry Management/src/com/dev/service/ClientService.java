package com.dev.service;

import java.util.List;
import com.dev.beans.Client;
import com.dev.beans.Contract;
import com.dev.beans.Orders;

public interface ClientService {
	public boolean changePassword(Integer client_id,String oldpassword,String newpassword);
	public Contract addContract(Integer clientId,Contract c1,String Password);
	public Contract searchContract(Integer contract_id,Integer client_id,String Password);
	public Contract updateContract(Integer cust_id,String Password);
	public Client deleteContract(Integer contract_id,Integer client_id,String Password);
	public boolean addOrder(Integer clientId,String Password);
	public Orders deleteOrder(Integer orderId,String Password);
	public Orders searchOrder(Integer orderId,String Password);
	
	
	

}
