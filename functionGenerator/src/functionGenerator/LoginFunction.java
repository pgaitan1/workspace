package functionGenerator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginFunction {

	WebDriver driver;
	
	public LoginFunction (WebDriver fdriver){
		driver = fdriver;
		
	}
	
	public void login (){
	
		driver.findElement(By.xpath(".//*[@id='u_0_2']")).sendKeys("Bill");
		driver.findElement(By.xpath(".//*[@id='u_0_4']")).sendKeys("Kenya");
		driver.findElement(By.xpath(".//*[@id='u_0_7']")).sendKeys("BillK@gmail.com");
		driver.findElement(By.xpath(".//*[@id='u_0_e']")).sendKeys("asdasdsa213123");
		
	}

}
