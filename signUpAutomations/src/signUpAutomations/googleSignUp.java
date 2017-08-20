package signUpAutomations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class googleSignUp {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		String url = "https://accounts.google.com/SignUp?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fe-11-14c86d1a0f55dc1d492dbc6ebcb2ed2d-118352756630f0ad1c881e25199f425883ad3683";
		String firstName = "Paul";
		String lastName = "Gaitan";
		String userName = "Paulg123";
		String password = "abc123";
		String month = "March";
		int day = 16;
		int year = 1989;
		String gender = "male";
		int phoneNumber = 2046201561;
		String email = "paulG123@hotmail.com";
		
		
		driver.navigate().to(url);
		
		driver.findElement(By.xpath(".//*[@id='FirstName']")).sendKeys(firstName);
		driver.findElement(By.xpath(".//*[@id='LastName']")).sendKeys(lastName);
		driver.findElement(By.xpath(".//*[@id='GmailAddress']")).sendKeys(userName);
		driver.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys(password);
		driver.findElement(By.xpath(".//*[@id='PasswdAgain']")).sendKeys(password);
		driver.findElement(By.xpath(".//*[@id='BirthMonth']/div[1]")).sendKeys(month);
		driver.findElement(By.xpath(".//*[@id='BirthDay']")).sendKeys(String.valueOf(day));
		driver.findElement(By.xpath(".//*[@id='BirthYear']")).sendKeys(String.valueOf(year));
		driver.findElement(By.xpath(".//*[@id='Gender']/div[1]")).sendKeys(gender);
		driver.findElement(By.xpath(".//*[@id='RecoveryPhoneNumber']")).sendKeys(String.valueOf(phoneNumber));
		driver.findElement(By.xpath(".//*[@id='RecoveryEmailAddress']")).sendKeys(email);
		String submit_button = driver.findElement(By.xpath(".//*[@id='submitbutton']")).getText();
		System.out.println (submit_button);
		
		driver.quit();
		
	

	}

}
