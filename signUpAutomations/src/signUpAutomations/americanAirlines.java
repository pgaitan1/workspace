package signUpAutomations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class americanAirlines {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver(); 
		
		driver.navigate().to("https://www.aa.com/loyalty/enrollment/enroll");
		
		Select title = new Select(driver.findElement(By.xpath(".//*[@id='personalInformationForm.title']")));
		title.selectByIndex(1);
		
		driver.findElement(By.xpath(".//*[@id='personalInformationForm.firstName']")).sendKeys("Bob");
		driver.findElement(By.xpath(".//*[@id='personalInformationForm.lastName']")).sendKeys("Yarnel");
		
		Select month = new Select (driver.findElement(By.xpath(".//*[@id='personalInformationForm.dateOfBirth.month']")));
		month.selectByIndex(3);
		
		Select day = new Select (driver.findElement(By.xpath(".//*[@id='personalInformationForm.dateOfBirth.day']")));
		day.selectByIndex(16);
		
		Select year = new Select (driver.findElement(By.xpath(".//*[@id='personalInformationForm.dateOfBirth.year']")));
		year.selectByValue("1989");
		
		Select gender = new Select (driver.findElement(By.xpath(".//*[@id='personalInformationForm.gender']")));
		gender.selectByIndex(1);
		
		Select country = new Select (driver.findElement(By.xpath(".//*[@id='addressInformationForm.country']")));
		country.selectByIndex(1);
		
		driver.findElement(By.xpath(".//*[@id='addressInformationForm.address1']")).sendKeys("123 smartville way");
		
		driver.findElement(By.xpath(".//*[@id='addressInformationForm.city']")).sendKeys("Happytown");
		
		Select state = new Select (driver.findElement(By.xpath(".//*[@id='addressInformationForm.usState']")));
		state.selectByVisibleText("Maryland");
		
		driver.findElement(By.xpath(".//*[@id='addressInformationForm.postalCode']")).sendKeys("20875");
		
		
		driver.findElement(By.xpath(".//*[@id='emailPhoneForm.email']")).sendKeys("paulg123@yahoo.com3");
		
		
		driver.findElement(By.xpath(".//*[@id='emailPhoneForm.confirmEmail']")).sendKeys("paulg123@yahoo.com");
		
		
		Select phone = new Select (driver.findElement(By.xpath(".//*[@id='emailPhoneForm.phones0.type']")));
		phone.selectByIndex(1);
		
		
		Select phone_country = new Select (driver.findElement(By.cssSelector("*[@class='selectbox-overlay']")));
		phone_country.selectByVisibleText("United States Of America");
		
		
		driver.findElement(By.xpath(".//*[@id='emailPhoneForm.phones0.number']")).sendKeys("2402402400");
		
		
		
	}

}
