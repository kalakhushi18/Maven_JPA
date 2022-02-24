package com.capg.MyMavenProject;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ExecutingFile {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Student s1 = new Student();
		s1.setFees(2000);
		s1.setId(101);
		s1.setName("abc");
		
		Student s2 = new Student();
		s2.setFees(24000);
		s2.setId(102);
		s2.setName("c");
		
		em.persist(s1);
	    em.persist(s2);
	    
	    Library l1 = new Library();
	    l1.setBookId(01);
	    l1.setBookName("harry Potter");
	    l1.setStud(s1);
	    
	    Library l2 = new Library();
	    l2.setBookId(02);
	    l2.setBookName("Chronicles of Narnia");
	    l2.setStud(s2);
	    
	    em.persist(l1);
	    em.persist(l2);
	    
	    em.getTransaction().commit();
	    em.close();
	    emf.close();
		
		
	}
}
