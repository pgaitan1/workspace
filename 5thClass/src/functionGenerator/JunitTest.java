package functionGenerator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JunitTest {
	
	String firstname = "Paul";
	String lastname = "McConnel";
	String phonenumber = "2402402400";
	String url = "https://www.facebook.com/";
	
	WebDriver driver = new FirefoxDriver();
	
	
	@Before
	public void beforetest(){
		driver.navigate().to(url);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		System.out.println ("I am in the before test");
		
	}
	
	@Test
	public void maintest(){
		
		driver.findElement(By.xpath(".//*[@id='u_0_2']")).sendKeys(firstname);
		driver.findElement(By.xpath(".//*[@id='u_0_4']")).sendKeys(lastname);
		driver.findElement(By.xpath(".//*[@id='u_0_7']")).sendKeys(phonenumber);
		System.out.println ("I am in the main test");
		
	}
	
	@After
	public void aftertest(){
		driver.quit();
		System.out.println ("I am in the after test");
		
	}

}
