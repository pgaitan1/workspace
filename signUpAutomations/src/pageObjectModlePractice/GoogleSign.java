package pageObjectModlePractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class GoogleSign {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.navigate().to("https://accounts.google.com/signUp?service=mail");

		PageObjectGoogle pog = new PageObjectGoogle (driver);
		
		pog.getFirstName().sendKeys("Tom");
		pog.getLastName().sendKeys("Henry");
		pog.getUserName().sendKeys("TomasHen");
		pog.getPassword().sendKeys("abcd1234");
		pog.confirmPassword().sendKeys("abcd1234");
		
		Select selectmonth = new Select (driver.findElement(By.xpath(".//*[@id='BirthMonth']/div[1]")));
		selectmonth.selectByVisibleText("March");
		
		Select selectday = new Select (driver.findElement(By.xpath(".//*[@id='BirthDay']")));
		selectday.selectByVisibleText("16");
		
		

	}

}
