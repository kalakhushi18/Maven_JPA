package com.capg.MyMavenProject;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class App 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		//Employee e = new Employee();
		
		//insert query 
//		e.setId(101);
//		e.setName("Khushi");
//		em.persist(e);
		
		//find --select query 
//		Employee e = em.find(Employee.class, 90);
//		System.out.println(e.getId());
//		System.out.println(e.getName());
//		
	
		
		//update query 
//		Employee e = em.find(Employee.class, 90);
//		e.setName("abc");
		
		//delete query 
//		Employee e = em.find(Employee.class, 90);
//		em.remove(e);
		
		
		//collection 
		Employee e = new Employee();
		
		Address a = new Address();
		a.setCity("Indore");
		a.setState("MP");
		a.setCountry("India");
		
		Address a1 = new Address();
		a1.setCity("bhopal");
		a1.setState("MP");
		a1.setCountry("India");
		
		e.setId(101);
		e.setName("Khushi");
		e.getAddress().add(a);
		
		Employee e1 = new Employee();
		e1.setId(102);
		e1.setName("kala");
		e1.getAddress().add(a1);
		
		em.persist(e);
		em.persist(e1);
		
		em.getTransaction().commit();
		emf.close();
		em.close();
    }
}
