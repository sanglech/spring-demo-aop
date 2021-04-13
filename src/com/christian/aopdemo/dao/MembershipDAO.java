package com.christian.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {
	public void addAccount() {
		System.out.println(getClass()+ ": doing DB work adding an account");	
		}
	public void addPerson() {
		System.out.println(getClass()+ ": Adding person");	
		}
}
