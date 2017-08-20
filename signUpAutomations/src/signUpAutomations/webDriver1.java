package signUpAutomations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class webDriver1 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.navigate().to("https://www.facebook.com/");
		
		driver.findElement(By.xpath(".//*[@id='u_0_2']")).sendKeys("Paul");
		
		driver.findElement(By.xpath(".//*[@id='u_0_4']")).sendKeys("Gaitan");
		
		driver.findElement(By.xpath(".//*[@id='u_0_7']")).sendKeys("paulg123@yahoo.com");
		
		driver.findElement(By.xpath(".//*[@id='u_0_a']")).sendKeys("paulg123@yahoo.com");
		
		driver.findElement(By.xpath(".//*[@id='u_0_e']")).sendKeys("abc123");
		
		Select mo_dropdown = new Select(driver.findElement(By.xpath(".//*[@id='month']")));
		mo_dropdown.selectByVisibleText("Mar");
		
		Select dy_dropdown = new Select(driver.findElement(By.xpath(".//*[@id='day']")));
		dy_dropdown.selectByVisibleText("16");
		
		Select yr_dropdown = new Select(driver.findElement(By.xpath(".//*[@id='year']")));
		yr_dropdown.selectByVisibleText("1989");
		
		driver.findElement(By.xpath(".//*[@id='u_0_k']/span[2]")).click();
		
		String buttontext = driver.findElement(By.xpath(".//*[@id='u_0_m']")).getText();
		System.out.println (buttontext);
		
		driver.quit();
		
		
		
	}

}
