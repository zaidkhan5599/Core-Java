package com.dev.services;
import com.dev.dao.*;
import java.util.List;

import com.dev.beans.Student;
import com.dev.dao.*;
public class StudentServiceImpl implements StudentService {
    StudentDao stu = new RepoImpl();
	@Override
	public boolean createProfile(Student stn) {
		return stu.createProfile(stn);
	}

	@Override
	public Student search_student(Integer id) {
		return stu.search_student(id);
		
	}

	@Override
	public Boolean update_student(Integer id, String name, String password) {
		return stu.update_student(id, name, password);
	}

	@Override
	public Boolean deleteStudent(Integer id, String name) {
		return stu.deleteStudent(id, name);
	}

	@Override
	public List<Student> display_all() {
		return stu.display_all();
	}

}
