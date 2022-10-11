package com.alvas.controller;

import com.alvas.dao.AadharDao;
import com.alvas.dao.PersonDao;
import com.alvas.dto.Aadhar;
import com.alvas.dto.Person;

public class TestSavePersonAashar {

	public static void main(String[] args) {
		
		Aadhar adar=new Aadhar();
		//adar.setId(1);
		adar.setFatherName("Mahesh");
		adar.setNumber(123542713);
		
		AadharDao adarDao=new AadharDao();
		adarDao.saveAdhar(adar);
		
		Person person=new Person();
		//person.setId(1);
		person.setName("Rakesh");
		person.setAge(19);
		person.setAadhar(adar);
		
		PersonDao personDao=new PersonDao();
		personDao.savePerson(person);

	}

}
