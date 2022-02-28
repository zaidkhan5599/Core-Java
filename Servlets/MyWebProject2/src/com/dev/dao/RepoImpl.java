package com.dev.dao;
//import com.dev.beans.*;
//import java.util.List;
import java.util.*;

import com.dev.beans.*;
import com.dev.exceptions.*;

import java.sql.*;
public class RepoImpl implements StudentDao {
	public static final String DBURL = "jdbc:mysql://localhost:3306/caps_buggers?user=root&password=root";
    Scanner sc = new Scanner(System.in);
	Student s=null;
	public RepoImpl()
	{
	s = new Student();
    }
    @Override
	public boolean createProfile(Student stn) {
		String query = "Insert into Student values(?,?,?,?)";
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try(Connection conn = DriverManager.getConnection(DBURL);
				PreparedStatement pstmt = conn.prepareStatement(query);
				
				){
			
			    //System.out.println("Enter use id");
			    int id = stn.getId();
			    pstmt.setInt(1, id);
			    //System.out.println("Enter the user name");
			    String name = stn.getName();
			    pstmt.setString(2, name);
			    //System.out.println("Enter the email id");
			    String email = stn.getEmail();
			    pstmt.setString(3, email);
			   // System.out.println("Enter the password");
			    String password = stn.getPassword();
			    pstmt.setString(4, password);
			    pstmt.executeUpdate();
			    //System.out.println();
			   return true;
			   
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		return false;
		}
	
	@Override
	public Student search_student(Integer id) {
		String query ="select *from student where id=?";
		try(Connection con = DriverManager.getConnection(DBURL);PreparedStatement pstmt=con.prepareStatement(query);){
			pstmt.setInt(1, id);
			boolean b=pstmt.execute();
			if(b==true)
			{
				ResultSet rs = pstmt.getResultSet();
				//System.out.println(rs);
				if(rs==null)
				{
					System.out.println("nopes");
					
				}
				while(rs.next())
				{
					s.setId(rs.getInt(1));
					s.setName(rs.getString(2));
					s.setEmail(rs.getString(3));
					s.setPassword(rs.getString(4));
				}
				return s;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return null;
		
	}
		
	

	@Override
	public Boolean update_student(Integer id, String name, String password) {
	String query ="Update Student set name=? where id=? and password=?"	; 
	try(Connection con = DriverManager.getConnection(DBURL);PreparedStatement pstmt=con.prepareStatement(query);){
		pstmt.setString(1, name);
		pstmt.setInt(2, id);
		pstmt.setString(3, password);
		int b = pstmt.executeUpdate();
		if(b>0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	return false;
		   
		   
		}

	@Override
	public Boolean deleteStudent(Integer id, String name) {
	String query ="Delete from Student where id=? && name=?";
	String query1 ="select *from Student";
	try(Connection con = DriverManager.getConnection(DBURL);PreparedStatement pstmt=con.prepareStatement(query);){
		pstmt.setInt(1, id);
		pstmt.setString(2, name);
		int i=pstmt.executeUpdate();
		if(i==1)
		{
			System.out.println("Deleted successfully");
			display_all();
			return true;
		}
		else {
			return false;
		}
		
			
			
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	return null;
	
		
	}
		
	

	@Override
	public List<Student> display_all() {
		ArrayList<Student> l = new ArrayList<Student>();
//		Iterator<Student> i1 = map.db.values().iterator();
//		while(i1.hasNext())
//		{
//			l.add(i1.next());
//		}
//		return l;
		String query ="select *from Student";
		try(Connection conn= DriverManager.getConnection(DBURL);
				Statement stmt =   conn.createStatement();
				){
			     ResultSet rs = stmt.executeQuery(query);
			    rs = stmt.executeQuery(query);
			    while(rs.next())
			    {
			    	s = new Student();
			    	s.setId(rs.getInt(1));
			    	s.setName(rs.getString(2));
			    	s.setEmail(rs.getString(3));
			    	s.setPassword(rs.getString(4));
			    	l.add(s);
			    }
		return l;
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return l;
		
		
		
	}

	
	
}