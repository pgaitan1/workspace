package functionGenerator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LogInPractice {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		
		LoginFunction lif = new LoginFunction(driver);
		
		driver.navigate().to("https://www.facebook.com/");
		
		lif.login();
		

	}

}
