package signUpAutomations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class facebookSignUp {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		String url = "https://www.facebook.com/";
		String firstName = "Paul";
		String lastName = "Gaitan";
		String phoneNumber = "2406201561";
		String password = "abc123";
		String month = "Mar";
		
		
		driver.navigate().to(url);
		
		driver.findElement(By.xpath(".//*[@id='u_0_2']")).sendKeys(firstName);
		driver.findElement(By.xpath(".//*[@id='u_0_4']")).sendKeys(lastName);
		driver.findElement(By.xpath(".//*[@id='u_0_7']")).sendKeys(phoneNumber);
		driver.findElement(By.xpath(".//*[@id='u_0_e']")).sendKeys(password);
		driver.findElement(By.xpath(".//*[@id='month']")).sendKeys(month);
		
		

	}

}
