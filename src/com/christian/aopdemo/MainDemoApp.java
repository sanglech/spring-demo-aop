package com.christian.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.christian.aopdemo.dao.AccountDAO;
import com.christian.aopdemo.dao.MembershipDAO;

public class MainDemoApp {
	public static void main(String[]args) {
		
		
		// read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		//get bean from spring container
		AccountDAO theAccountDAO= context.getBean("accountDAO",AccountDAO.class);
		MembershipDAO theMembershipDAO=  context.getBean("membershipDAO",MembershipDAO.class);
		
		
		//point cut expression matches on ALL add account methods
		
		
		//call the buisness method
		System.out.println("Adding another account");
		theAccountDAO.addAccount();

		
		System.out.println("Adding membership DAO");
		theMembershipDAO.addPerson();
		
		
		
		
		//close the context
		context.close();
	}
}
