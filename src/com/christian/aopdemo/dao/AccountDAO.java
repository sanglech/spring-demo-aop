package com.christian.aopdemo.dao;

import org.springframework.stereotype.Component;

import com.christian.aopdemo.Account;

@Component
public class AccountDAO {
	public void addAccount(Account theAccount) {
		System.out.println(getClass()+ ": doing DB work adding an account");	
		}
}
