package com.ty.jpaapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.jpaapp.dto.Movie;

public class UpdateDemo {
public static void main(String[] args) {
	Movie movie = new Movie();
	EntityManagerFactory efactory = null; 
	EntityManager manager = null;
	EntityTransaction entity = null;
	try {
		efactory = Persistence.createEntityManagerFactory("persistance");
		manager = efactory.createEntityManager();
		entity = manager.getTransaction();
		entity.begin();
		movie=manager.find(Movie.class, 2);
		movie.setName("Run");
		manager.persist(movie);
		System.out.println("Updated");
		entity.commit();
	} catch (Exception e) {
      
		e.printStackTrace();
	}
	manager.close();
		
	}
	
	
}

