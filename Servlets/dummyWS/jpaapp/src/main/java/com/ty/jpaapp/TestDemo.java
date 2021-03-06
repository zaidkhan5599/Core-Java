package com.ty.jpaapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.jpaapp.dto.Movie;

public class TestDemo {
	public static void main(String[] args) {
		Movie movie = new Movie();
		movie.setId(2);
		movie.setName("Abc");
		movie.setRating("Average");
		EntityManagerFactory eFactory = null;
		EntityManager manager = null;
		EntityTransaction transaction = null;
		try {
			eFactory = Persistence.createEntityManagerFactory("persistance");
			manager = eFactory.createEntityManager();
		    transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(movie);
			System.out.println("saved");
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
		finally {
			
			manager.close();
		}
	}

}
