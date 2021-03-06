package com.capg.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import javax.annotation.Resource;

import com.capg.SchedulerDao.ResourseDao;
import com.capg.SchedulerDao.ResourseImpl;
import com.capg.beans.Client;
import com.capg.beans.Contract;
import com.capg.beans.Orders;
import com.capg.beans.Product;

public class ClientJDBCImpl implements ClientDao {

	String url ="jdbc:mysql://localhost:3306/FMs?user=root&password=root";
	Connection connection;
	Scanner scanner;
	ResourseDao resourse = new ResourseImpl();
	ClientJDBCImpl() throws SQLException
	{
	connection = DriverManager.getConnection(url);
	scanner = new Scanner(System.in);
	}
	@Override
	public boolean changePassword(Integer client_id, String oldpassword, String newpassword) {
		String query="select password from client where id =?";
		String password ="Update client set password=? where id=?";
		try(PreparedStatement statement = connection.prepareStatement(query);PreparedStatement statement2= connection.prepareStatement(password)){
			statement.setInt(1, client_id);
			ResultSet resultSet=statement.executeQuery();
			Integer password1=resultSet.getInt("password");
			if(password1.equals(oldpassword))
			{
				statement2.setString(1, newpassword);
				statement2.setInt(2, client_id);
				return true;
				
			}
			else
			{
				return false;
			}
		
			
		}catch(SQLException exception)
		{
			exception.getStackTrace();
		}
		return false;
	}

	@Override
	public Contract addContract(Integer clientId, Contract c1, String Password) {
		
		String query="insert into contract(id,delivery_date,placedondate) values(?,?,?)";
		String search="select password from client where id=?";
		String contractid ="select count(contract_id) from contract ";
		String addcart ="insert into product values(?,?,?,?)";
		try(PreparedStatement preparedStatement = connection.prepareStatement(query);PreparedStatement statement = connection.prepareStatement(search);Statement statement1 =connection.prepareCall(contractid);PreparedStatement statement2 = connection.prepareStatement(addcart) ){
			//String query="select password from contract where password=?";
			//preparedStatement.setInt(1, c1.getContract_id());
		     statement.setInt(1, clientId);
			 ResultSet password=statement.executeQuery();
			 if(password.equals(Password))
			 {
			  List<Product>ls=c1.getList().getLs();
			  for(int i=0;i<ls.size();i++)
			  {
				  boolean stock=resourse.stockManagement(ls.get(i).getProduct_id(), ls.get(i).getQuantity());
				  boolean found = resourse.find(ls.get(i).getProduct_id()); 
				  if(!stock)
				  {
					 System.out.println("Contract was not able to get placed due insufficient quantity");
					 return null;
				  }
				 
				  else if(!found)
				  {
					  System.out.println("Resourse id you are inserting is not available");
					  return null;
				  }
			
			  }
				 
			preparedStatement.setInt(1, clientId);
			java.util.Date myDate = new Date();
			SimpleDateFormat format = new SimpleDateFormat("YYYY/MM/dd");
			String dateTime=format.format(myDate);
			javaDate date = new java.sql.Date(Long.parseLong(dateTime));
			preparedStatement.setDate(3,date);
			System.out.println("Enter delivery date");
			String deliverydate = scanner.nextLine();
			myDate = new Date(deliverydate);
			date = new java.sql.Date(Long.parseLong(dateTime));
			preparedStatement.setDate(2, date);
			int status=preparedStatement.executeUpdate();
			ResultSet result =statement1.executeQuery(contractid);
			Integer id = result.getInt("count(contract_id)");
			for(int i=0;i<ls.size();i++)
			{
				statement2.setInt(1, ls.get(i).getProduct_id());
				statement2.setString(2, ls.get(i).getProduct_name());
				statement2.setLong(3, ls.get(i).getQuantity());
				statement2.setInt(4,id);
				statement2.addBatch();
			}
			int []k=statement2.executeBatch();
			
			
			if(status>0)
			{
				System.out.println("Contract is successfully placed");
				return c1;
			}
			else {
				return null;
			}
			 }
			 else {
				 System.out.println("Password is wrongly entered");
				 return null;
			 }
		}catch(SQLException exception)
		{
			exception.getStackTrace();
		}
		return null;
		
		
	}

	@Override
	public Contract searchContract(Integer contract_id, Integer client_id, String Password) {
		String search="select password from client where id=?";
		String query="select *from contract c1 inner join client c2 where c1.id=c2.id && c2.id=?";
		try(PreparedStatement preparedStatement = connection.prepareStatement(search);PreparedStatement preparedStatement2 = connection.prepareStatement(query);){
         ResultSet 	result = preparedStatement.executeQuery();
         String password = null;
         while(result.next())
         {
        	  password=result.getString("password");
         }
       if(password.equals(Password))
       {
    	   Contract contract = new Contract();
    	   result = preparedStatement2.executeQuery();
    	   while(result.next())
    	   {
    		   System.out.println("Client id is"+client_id);
    		   Date deliverydate=result.getDate("delivery_date");
    		   SimpleDateFormat format = new SimpleDateFormat("YYYY/MM/dd");
    		   String date = format.format(deliverydate);
    		   contract.setDelivery_date(date);
    		   Date placedondate =result.getDate("placedondate");
    		   SimpleDateFormat format1 = new SimpleDateFormat("YYYY/MM/dd");
    		   String placed = format.format(placedondate);
    		   contract.setPlacedondate(placed);
    		   contract.setContact_no(Long.toString(result.getLong("telephone")));
    		   System.out.println("Client name :"+result.getString("client_name"));
    		   System.out.println("Client email :"+result.getString("email"));
    	   }
       }
		}catch(SQLException exception) {
			exception.getStackTrace();
		}
		return null;
	}

	@Override
	public Contract updateContract(Integer cust_id, String Password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Client deleteContract(Integer contract_id, Integer client_id, String Password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addOrder(Integer clientId, Orders ord) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Orders deleteOrder(Integer orderId, String Password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Orders searchOrder(Integer orderId, String Password) {
		// TODO Auto-generated method stub
		return null;
	}

}
