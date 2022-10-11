package com.alvas.controller;

import com.alvas.dao.AadharDao;
import com.alvas.dao.PersonDao;

public class TestDeletePersonAadhar {

	public static void main(String[] args) {
		
		
//		AadharDao aadardao=new AadharDao();
//		aadardao.deleteAadhar(3);
		
		PersonDao persondao=new PersonDao();
		persondao.deletePerson(2);

	}

}
