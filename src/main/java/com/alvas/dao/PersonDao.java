package com.alvas.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.alvas.dto.Person;

public class PersonDao {
	
	EntityManagerFactory emManagerFactory=Persistence.createEntityManagerFactory("adwaith");

	public void savePerson(Person person)
	{
		
		EntityManager entityManager=emManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityTransaction.commit();
		
		
	}
	
	public void getPersonById(int id)
	{
		EntityManager entityManager=emManagerFactory.createEntityManager();
		
		Person p=entityManager.find(Person.class, id);
		if(p!=null)
		{
			System.out.println("Person id :" +p.getId());
			System.out.println("Person name :" +p.getName());
			System.out.println("Person age :" +p.getAge());
		}
		
		
	}
	
	public void getPersonByName(String name)
	{
		EntityManager entityManager=emManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("select p from Person p where p.name=?1");
		query.setParameter(1, name);
		List<Person> list=query.getResultList();
	
		for(Person p:list)
		{
			System.out.println("Person id :" +p.getId());
			System.out.println("Person name :" +p.getName());
			System.out.println("Person age :" +p.getAge());
		}
	}
	
	public void updatePerson(Person person)
	{
		EntityManager entityManager=emManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.merge(person);
		entityTransaction.commit();
		
	}
	
	public void deletePerson(int id)
	{
		EntityManager entityManager=emManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Person p=entityManager.find(Person.class, 2);
		
		entityTransaction.begin();
		entityManager.remove(p);
		entityTransaction.commit();
	}
}
