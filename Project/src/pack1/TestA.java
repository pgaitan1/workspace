package pack1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestA {
	
	@BeforeTest
	public void beforetest (){
		System.out.println("I am in the before test");
		
	}
	@Test
	public void mytestone (){

		System.out.println("I am in the test one");
		
	}
	
	
	@Test
	public void mytesttwo (){

		System.out.println("I am in the test two");
		
		
		
	}
	@AfterTest
	public void aftertest(){

		System.out.println("I am in the after test");
		
	}

}
