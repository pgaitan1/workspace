package junit_testNG;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {
	
	@BeforeTest
	public void beforetest() {
		System.out.println ("I am in the before test");
		
	}
	
	@Test
	public void atest(){
		Assert.assertEquals("Test", "Pest");
		System.out.println ("I am in the a test");
		
	}
	
	@Test(dependsOnMethods = {"atest"})
	public void btest(){
		Assert.assertTrue(true);
		System.out.println ("I am in the b test");
		
	}
	
	@AfterTest
	public void aftertest (){
		System.out.println ("I am in the after test");
		
	}
	
	@BeforeMethod
	public void beforemethod(){
		System.out.println ("I am in the before method");
		
	}
	
	@AfterMethod
	public void aftermethod(){
		System.out.println ("I am in the after method");
		
	}

}
