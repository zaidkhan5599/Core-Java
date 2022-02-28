package com.capg.dao;

import java.util.List;
import com.capg.beans.Client;
import com.capg.beans.Contract;
import com.capg.beans.Orders;

public interface ClientDao {
	public boolean changePassword(Integer client_id,String oldpassword,String newpassword);
	public Contract addContract(Integer clientId,Contract c1,String Password);
	public Contract searchContract(Integer contract_id,Integer client_id,String Password);
	public Contract updateContract(Integer cust_id,String Password);
	public Client deleteContract(Integer contract_id,Integer client_id,String Password);
	public boolean addOrder(Integer clientId,Orders ord);
	public Orders deleteOrder(Integer orderId,String Password);
	public Orders searchOrder(Integer orderId,String Password);
	
	
	

}
