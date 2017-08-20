package signUpAutomations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SignUpDD {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://accounts.google.com/SignUp?continue=https%3A%2F%2Fwww.google.com%2F%3Fgws_rd%3Dssl&hl=en");
		
		driver.findElement(By.xpath(".//*[@id='BirthMonth']/div")).click();
		driver.findElement(By.xpath(".//*[@id=':3']/div")).click();
		

	}

}
