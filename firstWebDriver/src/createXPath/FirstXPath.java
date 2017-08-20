package createXPath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstXPath {


	public static void main(String[] args) {
	
		
		WebDriver driver = new FirefoxDriver();
		
		driver.navigate().to("https://www.mercuryinsurance.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.cssSelector("[id='gaq-zip-code']")).sendKeys("20814");
		
		
		
		
		
	}

}
