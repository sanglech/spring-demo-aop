package com.christian.aopdemo.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
	
	// this where we add all of our related advices for logging
	
	//@Before advice example
	
	@Before("execution(public void com.christian.aopdemo.dao.AccountDAO.addAccount())")
	public void beforeAddAccountAdvice() {
		System.out.println("\n=========>> Execution @Before advice on addAccount()");
		
	}
	
	
	@Before("execution(* add*())")
	public void beforeAddAdviceALL() {
		System.out.println("\n~~~~~~~~> Execution @Before advice on ALL adds()");
		
	}
	
	
	
}
