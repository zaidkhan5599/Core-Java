package com.capg.StudentJPA.dto;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="students")
public class Student{
	
	@Id
	@Column(name="id")
	private Integer id;
	@Column(name="name")
	private String name;
	@Column(name="contact")
	private long contact;
	@Column(name="email")
	private String email;
	
}
