package com.alvas.controller;

import com.alvas.dao.AadharDao;
import com.alvas.dao.PersonDao;
import com.alvas.dto.Aadhar;
import com.alvas.dto.Person;

public class TestUpdatePersonAadhar {

	public static void main(String[] args) {
		
		Aadhar adar=new Aadhar();
		adar.setId(1);
		adar.setFatherName("hogi");
		adar.setNumber(122222);
		
		System.out.println("After updating aadhar");
		AadharDao aadardao=new AadharDao();
		aadardao.updateAdhar(adar);
		
		
		Person person=new Person();
		person.setId(1);
		person.setName("Ramu");
		person.setAge(33);
		person.setAadhar(adar);
		
		System.out.println("After updating person");
		PersonDao persondao=new PersonDao();
		persondao.updatePerson(person);
		
		

	}

}
