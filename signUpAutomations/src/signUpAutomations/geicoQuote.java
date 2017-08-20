package signUpAutomations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class geicoQuote {

	public static void main(String[] args) throws InterruptedException  {
		
		
		String zip_code = "20874";
		String first_name = "Bob";
		String last_name = "Yelts";
		String address = "12234 highway way";
		String b_month = "03";
		String b_day = "19";
		String b_year = "1988";
		
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		


		driver.navigate().to("https://www.geico.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath(".//*[@id='zip']")).sendKeys(zip_code);
		
		driver.findElement(By.xpath(".//*[@id='submitButton']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath(".//*[@id='modal-dialog-intro-overlay']/div[3]/div/div[1]/button")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='firstName']")).sendKeys(first_name);
		driver.findElement(By.xpath(".//*[@id='lastName']")).sendKeys(last_name);
		driver.findElement(By.xpath(".//*[@id='street']")).sendKeys(address);
		driver.findElement(By.xpath(".//*[@id='date-monthdob']")).sendKeys(b_month);
		driver.findElement(By.xpath(".//*[@id='date-daydob']")).sendKeys(b_day);
		driver.findElement(By.xpath(".//*[@id='date-yeardob']")).sendKeys(b_year);
		driver.findElement(By.xpath(".//*[@id='btnSubmit']")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Select car_year = new Select (driver.findElement(By.xpath(".//*[@id='vehicleYear']")));
		car_year.selectByVisibleText("2006");
		
		Select car_make = new Select (driver.findElement(By.xpath(".//*[@id='vehicleMake']")));
		car_make.selectByVisibleText("Toyota");
		
		Select car_model = new Select (driver.findElement(By.xpath(".//*[@id='vehicleModel']")));
		car_model.selectByVisibleText("Camry");
		
		driver.findElement(By.xpath(".//*[@id='vehicleForm']/div[1]/div[16]/div[2]/div/div/div/label[1]")).click();
		
		driver.findElement(By.xpath(".//*[@id='vehicleForm']/div[1]/div[17]/div[3]/div[2]/div/div/div/label[1]")).click();
		
		//days driven
		
		Thread.sleep(3000);
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='daysDriven']")));	
		
		Select day_drive = new Select (driver.findElement(By.xpath(".//*[@id='daysDriven']")));
		day_drive.selectByVisibleText("6");
		
		driver.findElement(By.xpath(".//*[@id='milesDriven']")).sendKeys("20");
		
		
		WebDriverWait wait1 = new WebDriverWait(driver, 20);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='annualMileage']")));
		
		Select year_drive = new Select (driver.findElement(By.xpath(".//*[@id='annualMileage']")));
		year_drive.selectByIndex(3);
		
		driver.quit();
		
		
	}

}
