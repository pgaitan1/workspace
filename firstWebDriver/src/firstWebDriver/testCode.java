package firstWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testCode {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		String url = "https://login.yahoo.com/account/create?specId=yidReg";
		
		
		Thread.sleep(3000);
		driver.navigate().to(url);
		
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='usernamereg-firstName']")).sendKeys("Paul");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='usernamereg-lastName']")).sendKeys("Gaitan");

		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='usernamereg-yid']")).sendKeys("Paulg123");
		//
	}

}
