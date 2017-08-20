package signUpAutomations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class emiratesSignUp {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.navigate().to("https://www.emirates.com/account/us/english/light-registration/");
		
		Select title = new Select (driver.findElement(By.xpath(".//*[@id='ddlTitle']")));
		title.selectByVisibleText("Mr");
		
		driver.findElement(By.xpath(".//*[@id='txtFirstName']")).sendKeys("Tim");
		driver.findElement(By.xpath(".//*[@id='txtFamilyName']")).sendKeys("Welber");
		
		Select d_birth = new Select (driver.findElement(By.xpath(".//*[@id='ddlDates']")));
		d_birth.selectByVisibleText("16");
		
		Select m_birth = new Select (driver.findElement(By.xpath(".//*[@id='ddlMonth']")));
		m_birth.selectByVisibleText("March");
		
		Select y_birth = new Select (driver.findElement(By.xpath(".//*[@id='ddlYear']")));
		y_birth.selectByVisibleText("1989");
		
		driver.findElement(By.xpath(".//*[@id='ddlResidence-suggest']")).sendKeys("United States of America");
		
		
		
		
		
	}

}
