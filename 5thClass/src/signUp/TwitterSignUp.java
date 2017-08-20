package signUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TwitterSignUp {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new FirefoxDriver();
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.navigate().to("https://twitter.com/signup");
		driver.findElement(By.id("full-name")).sendKeys("Bob McGill");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("user[email]")).sendKeys("2402402400");
		Thread.sleep(2000);
		
		driver.findElement(By.name("user[user_password]")).sendKeys("abc123");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(".//*[@id='phx-signup-form']/div[1]/div[4]/label/input[1]")).click();
		
		Thread.sleep(2000);
		
		driver.quit();
		
		
	}

}
