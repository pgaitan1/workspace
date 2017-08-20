package nintendo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObjectNintendo {
	
	WebDriver driver;
	
	public PageObjectNintendo (WebDriver ndriver){
		
		driver = ndriver;		
	}

	
	public WebElement clickSignIn(){
		
		WebElement signIn = driver.findElement(By.xpath(".//*[@id='authorize-register-link']/span"));
		return signIn;
		
	}
	
	public WebElement clickBirth (){
		
		WebElement confirmBirth = driver.findElement(By.xpath(".//*[@id='register-form']/div[2]/button"));
		return confirmBirth;
	}
	
	
	public WebElement getUsername (){
		
		WebElement username = driver.findElement(By.xpath(".//*[@id='register-form']/div[1]/div[2]/input"));
		return username;
		
	}
	
	public WebElement getEmail (){
		
		WebElement email = driver.findElement(By.xpath(".//*[@id='email']"));
		return email;
		
	}
	
	public WebElement newPassowrd (){
		
		WebElement password = driver.findElement(By.xpath(".//*[@id='register-form']/div[3]/div[2]/input"));
		return password;
		
	}
	
	public WebElement retypePassword (){
		
		WebElement password2 = driver.findElement(By.xpath(".//*[@id='register-form']/div[4]/div[2]/input"));
		return password2;
		
	}

}
