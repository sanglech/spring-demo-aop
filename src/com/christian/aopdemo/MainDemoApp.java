package com.christian.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.christian.aopdemo.dao.AccountDAO;

public class MainDemoApp {
	public static void main(String[]args) {
		
		
		// read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		//get bean from spring container
		AccountDAO theAccountDAO= context.getBean("accountDAO",AccountDAO.class);
		
		//call the buisness method
		
		theAccountDAO.addAccount();
		
		System.out.println("Adding another account");
		theAccountDAO.addAccount();
		
		//close the context
		context.close();
	}
}
