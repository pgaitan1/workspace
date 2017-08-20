package pageObjectModlePractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObjectGoogle {
	
	WebDriver driver;
	
	public PageObjectGoogle (WebDriver gdriver){
		
		driver = gdriver;
	}
	
	public WebElement getFirstName (){
		WebElement firstname = driver.findElement(By.xpath(".//*[@id='FirstName']"));
		return firstname;
		
	}
	
	public WebElement getLastName (){
		WebElement lastname = driver.findElement(By.xpath(".//*[@id='LastName']"));
		return lastname;
		
	}
	
	public WebElement getUserName (){
		WebElement username = driver.findElement(By.xpath(".//*[@id='GmailAddress']"));
		return username;
		
	}
	
	public WebElement getPassword (){
		WebElement password = driver.findElement(By.xpath(".//*[@id='Passwd']"));
		return password;
		
	}
	
	public WebElement confirmPassword(){
		WebElement confirmpass = driver.findElement(By.xpath(".//*[@id='PasswdAgain']"));
		return confirmpass;
		
	}

}
