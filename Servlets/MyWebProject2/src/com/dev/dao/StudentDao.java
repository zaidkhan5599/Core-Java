package com.dev.dao;
import java.util.List;

import com.dev.beans.*;
public interface StudentDao {
//createInfo
	//searchStudent
	//updateStudent
	//deleteStudent
	//displayAll
	public boolean createProfile(Student stn);
	public Student search_student(Integer id);
	public Boolean update_student(Integer id,String name, String password);
	public Boolean deleteStudent(Integer id,String name);
	public List<Student> display_all();
	//public Student login(int id, String password);
}
