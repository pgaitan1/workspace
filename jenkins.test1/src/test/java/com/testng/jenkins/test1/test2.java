package com.testng.jenkins.test1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test2 {
	
	@BeforeTest
	public void beforetest (){
		System.out.println("I am in the before test");
		
	}
	@Test (priority = 2)
	public void mytestone (){

		System.out.println("I am in the test two");
		
	}
	
	
	@Test (priority = 1)
	public void mytesttwo (){

		System.out.println("I am in the test two");
		
		
		
	}
	@AfterTest
	public void aftertest(){

		System.out.println("I am in the after test");
		
	}


}
