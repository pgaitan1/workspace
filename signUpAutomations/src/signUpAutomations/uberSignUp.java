package signUpAutomations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class uberSignUp {

	public static void main(String[] args) {
		
		//web element practice
		//pageObjectModelPractice
		
		WebDriver driver = new FirefoxDriver ();
		
		driver.navigate().to("https://get.uber.com/new-signup/");
		
		pageObject po = new pageObject(driver);
	
		po.getFirstName().sendKeys("Paul");
		po.getLastName().sendKeys("Gaitan");
		po.getPhoneNumber().sendKeys("2406201561");
		po.getEmail().sendKeys("paulg123@yahoo.com");
		po.getPassword().sendKeys("abc123");
		

	}

}
