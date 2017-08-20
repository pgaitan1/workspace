package functionGenerator;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Run {
	
	@BeforeTest
	public void beforetest(){
		System.out.println("I am in the best test");
		
	}
	
	@AfterTest
	public void aftertest(){
		System.out.println("I am in the after test");
		
	}
	
	@Test(dependsOnMethods = {"atestrun"})
	public void btestrun(){
		Assert.assertEquals("Test", "Tst");
		System.out.println("I am in the test run 1");
		
	}
	
	@Test (timeOut = 50000)
	public void atestrun(){
		Assert.assertTrue(true);
		System.out.println("I am in the test run 2");
		
	}
	
	@BeforeMethod
	public void beforemethod(){
		System.out.println ("I am in the before method");
		
	}
	
	@AfterMethod
	public void aftermethod(){
		System.out.println("I am in the after method");
		
	}
	

}
