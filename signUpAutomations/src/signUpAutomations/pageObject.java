package signUpAutomations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pageObject {
	
	WebDriver driver;
	
	
	public pageObject (WebDriver tdriver){
		
		driver = tdriver;
	}
	
	
	public WebElement getFirstName (){
		
		WebElement firstName = driver.findElement(By.xpath(".//*[@id='fname']"));
		return firstName;
		
	}
	
	public WebElement getLastName(){
		
		WebElement lastName = driver.findElement(By.xpath(".//*[@id='lname']"));
		return lastName;
		
	}
	
	public WebElement getPhoneNumber(){
		
		WebElement phoneNumber = driver.findElement(By.xpath(".//*[@id='mobile']"));
		return phoneNumber;
		
	}
	
	public WebElement getEmail(){
		WebElement userEmail = driver.findElement(By.xpath(".//*[@id='email']"));
		return userEmail;
		
	}
	
	public WebElement getPassword(){
		WebElement password = driver.findElement(By.xpath(".//*[@id='password']"));
		return password;
		
	}

}
