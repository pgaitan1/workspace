package nintendo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class NintendoSignUp {

	public static void main(String[] args) {
		
		
		String userName = "PingALing";
		String email = "Paulg123@yahoo.com";
		String password = "abcd1234";
		
		WebDriver driver = new FirefoxDriver();
				
		PageObjectNintendo pon = new PageObjectNintendo (driver);
	
		driver.navigate().to("https://accounts.nintendo.com/authorize_guide?redirect_uri=https%3A%2F%2Faccounts.nintendo.com%2Fconnect%2F1.0.0%2Fauthorize%3Fclient_id%3De56201e414c97a10%26state%3D6e0df0ebc6636d38a2f7cef136f3fd32%26response_type%3Dcode%2520id_token%2520token%26scope%3DeshopDemo%2520eshopPrice%2520missionStatus%253Aprogress%2520openid%2520pointWallet%2520userNotification%253AanyClients%2520userNotification%253AanyClients%253Awrite%2520userinfo.birthday%2520userinfo.linkedIds%2520userinfo.mii%2520userinfo.profile%26redirect_uri%3Dhttp%253A%252F%252Fwww.nintendo.com%26web_message_uri%3Dhttps%253A%252F%252Faccounts.nintendo.com%26web_message_target%3Dop-frame%26response_mode%3Dweb_message%26prompt%3Dconsent%26display%3Dtouch&type=mixed");
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		pon.clickSignIn().click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Select month = new Select (driver.findElement(By.xpath(".//*[@id='birth-month-field']")));
		month.selectByIndex(2);
		
		Select day = new Select (driver.findElement(By.xpath(".//*[@id='birth-day-field']")));
		day.selectByIndex(11);
		
		Select year = new Select (driver.findElement(By.xpath(".//*[@id='birth-year-field']")));
		year.selectByVisibleText("1977");
		
		pon.clickBirth().click();
		
		pon.getUsername().sendKeys(userName);
		
		pon.getEmail().sendKeys(email);
		
		pon.newPassowrd().sendKeys(password);
		
		pon.retypePassword().sendKeys(password);
		
		Select gender = new Select (driver.findElement(By.xpath(".//*[@id='register-form']/div[6]/div[2]/div/select")));
		gender.selectByIndex(1);
		
		driver.findElement(By.xpath(".//*[@id='register-form']/div[10]/div[1]/input")).click();
		
		driver.findElement(By.xpath(".//*[@id='form-terms_consented']")).click();
		
		String getSubmit = driver.findElement(By.xpath(".//*[@id='register-form']/div[11]/button")).getText();
		System.out.println (getSubmit);
		
		driver.quit();

	}

}
