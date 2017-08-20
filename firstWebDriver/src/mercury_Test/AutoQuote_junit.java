package mercury_Test;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoQuote_junit {
	
	WebDriver driver;
	
	@Before
	public void beforetest(){
		
		driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.mercuryinsurance.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void maintest(){
		
		WebElement zipcode = driver.findElement(By.xpath(".//*[@id='gaq-zip-code']"));
		WebElement getQuoteButton = driver.findElement(By.xpath(".//*[@id='submit-gaq']"));
		
		zipcode.sendKeys("22031");
		getQuoteButton.click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement firstName = driver.findElement(By.xpath(".//*[@id='firstName']"));
		firstName.sendKeys("Jim");
		WebElement lastName = driver.findElement(By.xpath(".//*[@id='lastName']"));
		lastName.sendKeys("Williams");
		WebElement dateOfBirth = driver.findElement(By.xpath(".//*[@id='dateOfBirth']"));
		dateOfBirth.sendKeys("02191978");
		WebElement phoneNumber = driver.findElement(By.xpath(".//*[@id='phoneNumber']"));
		phoneNumber.sendKeys("2402402400");
		WebElement email = driver.findElement(By.xpath(".//*[@id='email']"));
		email.sendKeys("JimW1982@gmail.com");
	}

	@After
	public void aftertest(){
		System.out.println("I am at after");
		
		
	}
}
