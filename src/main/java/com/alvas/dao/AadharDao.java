package com.alvas.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.alvas.dto.Aadhar;
import com.alvas.dto.Person;

public class AadharDao {
	
	EntityManagerFactory emManagerFactory=Persistence.createEntityManagerFactory("adwaith");
	
	public void saveAdhar(Aadhar adar)
	{
		
		EntityManager entityManager=emManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(adar);
		entityTransaction.commit();
		
		
	}
	
	public void getAadharById(int id)
	{
		EntityManager entityManager=emManagerFactory.createEntityManager();
		
		Aadhar aadar=entityManager.find(Aadhar.class, id);
		
		if(aadar!=null)
		{
			System.out.println("Aadhar id :" +aadar.getId());
			System.out.println("Father name :" +aadar.getFatherName());
			System.out.println("Number is :" +aadar.getNumber());
		}
	}
	
	public void getAadharByFathersName(String fname)
	{
		EntityManager entityManager=emManagerFactory.createEntityManager();
		
		Query query=entityManager.createQuery("select a from Aadhar a where a.fatherName=?1");
		query.setParameter(1,fname);
		List<Aadhar> list=query.getResultList();
		
		for(Aadhar a:list)
	
		
		{
			System.out.println("Aadhar id :" +a.getId());
			System.out.println("Father name :" +a.getFatherName());
			System.out.println("Number is :" +a.getNumber());
		}
			
	}
	
	public void updateAdhar(Aadhar adar)
	{
		EntityManager entityManager=emManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.merge(adar);
		entityTransaction.commit();
		
	}
	
	public void deleteAadhar(int id)
	{
		EntityManager entityManager=emManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Aadhar adar=entityManager.find(Aadhar.class, 2);
		
		entityTransaction.begin();
		entityManager.remove(adar);
		entityTransaction.commit();
	}
}

