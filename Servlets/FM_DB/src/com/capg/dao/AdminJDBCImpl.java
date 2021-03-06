package com.capg.dao;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.capg.beans.Client;
import com.capg.beans.Contract;
import com.capg.beans.Orders;


public class AdminJDBCImpl implements AdminDao{
	final String URL ="jdbc:mysql://localhost:3306/FMs?user=rootpassword=root";
	Connection connection = null;
	AdminJDBCImpl() throws SQLException
	{
	   connection =	DriverManager.getConnection(URL);
	}
	@Override
	public boolean createProf(Client client) {
		String query ="Insert into client values(?,?,?,?,?,?)";
try(PreparedStatement statement = connection.prepareStatement(query);)
{
	statement.setInt(1, client.getId());
	statement.setString(2, client.getEmail());
	statement.setString(3, client.getCust_name());
	statement.setString(4, client.getAddress());
	statement.setString(5, client.getTelephone());
	statement.setString(6, client.getPassword());
	 int i=statement.executeUpdate();
	 if(i>0)
	 {
		 System.out.println("Data Inserted");
		 return true;
	 }
	 else
	 {
		 return false;
	 }
	
}catch(SQLException exception)
{
	exception.printStackTrace();
}
return false;

		
		
}
		
	
	@Override
	public Client deleteProf(Integer client_id) {
		String sql1="select *from client where id=?";
	    String sql ="delete from client where client_id=?";
	    Client client = new Client();
		try(PreparedStatement preparedStatement= connection.prepareStatement(sql1);PreparedStatement preparedStatement2= connection.prepareStatement(sql);)
		{
			preparedStatement.setInt(1, client_id);
			boolean b=preparedStatement.execute();
			if(b)
			{
				ResultSet result = preparedStatement.getResultSet();
			
			while(result.next())
			{
			client.setId(result.getInt(1));
			client.setEmail(result.getString(2));
			client.setAddress(result.getString("address"));
			client.setCust_name(result.getString("client_name"));
			client.setTelephone(Long.toString(result.getLong("telephone")));
			client.setPassword(result.getString("password"));
			}
			 int delete=preparedStatement2.executeUpdate();
			 if(delete>0) {
			 
				 System.out.println("Deletion of particular record was successful");
			 }
			 else {
			        System.out.println("Deletion couldn't takes place");
				 }
			 return client;
			}
			else
			{
				System.out.println("Couldn't find the client in the records");
				return null;
			}
		
		}catch(SQLException exception)
		{
			exception.getStackTrace();
		}
		return null;
	}
	@Override
	public boolean updateProf(String password, Integer id,Client client) {
		String query ="Update client set email=?,client_name=?,address=?,telephone=? where password=? && id=?";
		try(PreparedStatement preparedStatement= connection.prepareStatement(query);
				){
			      preparedStatement.setString(1, client.getEmail());
			      preparedStatement.setString(2, client.getCust_name());
			      preparedStatement.setString(3, client.getAddress());
			      preparedStatement.setString(4, password);
			      preparedStatement.setInt(5, id);
			      int update=preparedStatement.executeUpdate();
			      if(update>0)
			      {
			    	  System.out.println("Updated");
			    	  return true;
			      }
			      else
			      {
			    	  System.out.println("Not Updated");
			    	  return false;
			      }
			
			
			
		}catch(SQLException exception)
		{
			exception.getStackTrace();
		}
		return false;
		
	}
	@Override
	public Client searchClient(Integer clientid) {
		Client client = new Client();
		String query ="select *from client where id=?";
		try(PreparedStatement preparedStatement= connection.prepareStatement(query);
				){
			 preparedStatement.setInt(1, clientid);
			 boolean search=preparedStatement.execute();
			 if(search)
			 {
				 ResultSet resultSet=preparedStatement.getResultSet();
				 client.setEmail(resultSet.getString("email"));
				 client.setAddress(resultSet.getString("address"));
				 client.setCust_name(resultSet.getString("client_name"));
				 client.setTelephone(Long.toString(resultSet.getLong("telephone")));
				 client.setPassword(resultSet.getString("password"));
				 client.setId(resultSet.getInt("id"));
				 return client;
			 }
				 
			 else {
				 System.out.println("Not available record for particular client id");
				 return null;
			 }
		}catch(SQLException exception)
		{
			exception.getStackTrace();
		}
		return null;
	}
	@Override
	public void displayContracts() {
		String query ="select *from client c1 inner join contract c2 where c1.id=c2.id";
		String query1 ="select *from product p1 inner join contract c1 where p1.contract_id=c1.contract_id";
		try(Statement statement= connection.createStatement();
				Statement statement2 = connection.createStatement()){
			ResultSet resultSet = statement.executeQuery(query);
			ResultSet resultSet2 = statement2.executeQuery(query1);
			while(resultSet.next())
			{
				Integer contract_id=resultSet.getInt("contract_id");
				System.out.println("Client_id"+resultSet.getInt("id"));
				System.out.println("Client_name"+resultSet.getString("client_name"));
				System.out.println("Client_email"+resultSet.getString("email"));
				System.out.println("Client_address"+resultSet.getString("address"));
				System.out.println("Client_telephone"+resultSet.getLong("telephone"));
				System.out.println("Contract_id"+resultSet.getInt("contract_id"));
				System.out.println("Contract_deliveryDate"+resultSet.getDate("delivery_date"));
				System.out.println("Contract_placedondate"+resultSet.getDate("placedondate"));
				System.out.println("**********Products in Contract**************");
				while(resultSet2.next())
				{
					if(resultSet2.getInt("contract_id")==contract_id) {
					
				System.out.println("Product_id"+resultSet.getInt("product_id"));
				System.out.println("Product_name"+resultSet.getString("name"));
				System.out.println("Product_quantity"+resultSet.getInt("quantity"));
				System.out.println("***********************************************");
					}
					else {
						break;
					}
			}
			}
			
		}catch(SQLException exception)
		{
			exception.getStackTrace();
		}
		
		
	}
	@Override
	public void displayAllorders() {
		String query ="select *from client c1 inner join orders c2 where c1.id=c2.id"; 
		String query1 ="select *from orders o1 inner join orderInventory o2 where o1.orderid=o2.orderid";
		try(Statement statement= connection.createStatement();
				Statement statement2 = connection.createStatement()){
			ResultSet resultSet = statement.executeQuery(query);
			ResultSet resultSet2 = statement2.executeQuery(query1);
			while(resultSet.next())
			{
				Integer orderid=resultSet.getInt("contract_id");
				System.out.println("Client_id"+resultSet.getInt("id"));
				System.out.println("Client_name"+resultSet.getString("client_name"));
				System.out.println("Client_email"+resultSet.getString("email"));
				System.out.println("Client_address"+resultSet.getString("address"));
				System.out.println("Client_telephone"+resultSet.getLong("telephone"));
				System.out.println("orderid"+resultSet.getInt("orderid"));
				System.out.println("deliveryDate"+resultSet.getDate("date"));
				System.out.println("**********Products in Contract**************");
				while(resultSet2.next())
				{
					if(resultSet2.getInt("orderid")==orderid) {
					
				System.out.println("Product_id"+resultSet.getInt("product_id"));
				System.out.println("Product_name"+resultSet.getString("name"));
				System.out.println("Product_quantity"+resultSet.getInt("quantity"));
				System.out.println("***********************************************");
					}
					else {
						break;
					}
			}
			}
			
		}catch(SQLException exception)
		{
			exception.getStackTrace();
		}
		
	}
	@Override
	public List<Client> displayAll() {
		String query ="select *from client";
		try(Statement statement = connection.createStatement();){
			ResultSet resultSet = statement.executeQuery(query);
			List<Client>list = new ArrayList<Client>();
			Client client = new Client();
			while(resultSet.next())
			{
				client.setId(resultSet.getInt("id"));
				client.setCust_name(resultSet.getString("client_name"));
				client.setEmail(resultSet.getString("email"));
				client.setAddress(resultSet.getString("address"));
				client.setTelephone(Long.toString(resultSet.getLong("telephone")));
				client.setPassword(resultSet.getString("password"));
				list.add(client);
				
			}
			return list;
		}catch(SQLException exception)
		{
			exception.getStackTrace();
		}
		return null;
				
	}
	
}
	