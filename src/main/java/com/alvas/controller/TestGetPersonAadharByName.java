package com.alvas.controller;

import com.alvas.dao.AadharDao;
import com.alvas.dao.PersonDao;

public class TestGetPersonAadharByName {

	public static void main(String[] args) {
		
		PersonDao persondao=new PersonDao();
		persondao.getPersonByName("Bob");
		
		AadharDao aadardao=new AadharDao();
		aadardao.getAadharByFathersName("Madhusoodanan");

	}

}
