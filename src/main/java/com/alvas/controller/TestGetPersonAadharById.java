package com.alvas.controller;

import com.alvas.dao.AadharDao;
import com.alvas.dao.PersonDao;

public class TestGetPersonAadharById {

	public static void main(String[] args) {
		
		PersonDao persondao=new PersonDao();
		persondao.getPersonById(4);
		
		AadharDao aadardao=new AadharDao();
		aadardao.getAadharById(3);

	}

}
