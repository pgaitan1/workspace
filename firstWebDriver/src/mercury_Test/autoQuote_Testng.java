package mercury_Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class autoQuote_Testng {

	WebDriver driver;
	
	@BeforeTest
	public void beforetest(){
		
		driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.mercuryinsurance.com/");
		System.out.println ("I am in the before test");
	
	}
	
	@Test
	public void atest(){
	
		WebElement zipcode = driver.findElement(By.xpath(".//*[@id='gaq-zip-code']"));
		WebElement getQuoteButton = driver.findElement(By.xpath(".//*[@id='submit-gaq']"));
		
		zipcode.sendKeys("22031");
		String actualtest = getQuoteButton.getText();
		getQuoteButton.click();
		
		
		Assert.assertEquals(actualtest, "Get a quote");
	}
	
	@Test
	public void btest(){
		
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
		System.out.println ("I am in the b test");
		
	}
	
	@BeforeMethod
	public void beforemethod(){
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		System.out.println ("I am in the beforemethod");
		
	}
	
	
	@AfterTest
	public void aftertest(){
		driver.quit();
		System.out.println ("I am in the after test");
		
	}
}
