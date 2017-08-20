package mercury_Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MercuryAutoQuote {

	public static void main(String[] args) throws Exception {
		
		//test application in Mozila Firefox browser
		
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		// navigate to the browser
		
		driver.navigate().to("https://www.mercuryinsurance.com/");
		
		WebElement zipcode = driver.findElement(By.xpath(".//*[@id='gaq-zip-code']"));
		WebElement getQuoteButton = driver.findElement(By.xpath(".//*[@id='submit-gaq']"));
		
		zipcode.sendKeys("22031");
		getQuoteButton.click();
		
		
		// information page
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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

}
