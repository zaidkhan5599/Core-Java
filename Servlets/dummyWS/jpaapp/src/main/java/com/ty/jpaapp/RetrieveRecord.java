package com.ty.jpaapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.jpaapp.dto.Movie;

public class RetrieveRecord {
	public static void main(String[] args) {
		Movie movie = new Movie();
		EntityManagerFactory eFactory = null;
		EntityManager manager = null;
		EntityTransaction transaction = null;
		try {
			eFactory = Persistence.createEntityManagerFactory("persistance");
			manager = eFactory.createEntityManager();
		    transaction = manager.getTransaction();
			transaction.begin();
			movie=manager.find(Movie.class,2);
			//movie = manager.getReference(Movie.class, 10);
			manager.detach(movie);
			System.out.println(movie.getClass());
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


