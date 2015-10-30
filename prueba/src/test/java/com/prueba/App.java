package com.prueba;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class App {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("testunit2");
		EntityManager em = emf.createEntityManager();

		EntityTransaction tx = em.getTransaction();
		tx.begin();

		
	/*	Usuario a = new Usuario();
		a.setId(10L);
		a.setNombreCompleto("royner mejia");
		em.persist(a);
		Correo b = new Correo();
		b.setCliente(a);
		b.setDireccion("roy@hotmail.com");
		holaaaaaaaaaaaaaaaaaaaaa!!
		em.persist(b);
		
		Correo c = new Correo();
		c.setCliente(a);
		c.setDireccion("roy22@hotmail.com");
		
		em.persist(c);
		tx.commit(); 
		*/

	/*	Usuario a = new Usuario();
		Correo c = em.find(Correo.class, 4L);
		System.out.println(c.getId());
		c.setDireccion("actua6lizand5o@hotmail.com");
		c.setCliente(a);
		em.merge(c);
		tx.commit();*/
	
	//	Query query = em.createQuery("select c from Correo c where c.prove.empresa='gmail' ");
		
		Query query = em.createNamedQuery("Correo.buscar");
		
		List<Correo> resultList = query.getResultList();
		 
		 System.out.println(resultList);
		int i =0;
		 for (Correo x : resultList){
			 
			 /*System.out.println(x.getDireccion());
			 System.out.println(x.getCliente().getNombreCompleto());
			 System.out.println(x.getProve().getEmpresa());
			 System.out.println(x.getProve().getLocal().getLugar());*/
			 
			System.out.println(++i); 
			 
		 }
		 
		 
		 
		/*
		Correo resul = em.find(Correo.class, 2L);
		
		System.out.println(resul.getCliente().getNombreCompleto());
		System.out.println(resul.getDireccion());
		*/
	}

}
