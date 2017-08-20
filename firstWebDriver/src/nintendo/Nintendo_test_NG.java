package nintendo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Nintendo_test_NG {
	
	WebDriver driver;
	PageObjectNintendo pon = new PageObjectNintendo(driver);
	String userName = "PingALing";
	String email = "Paulg123@yahoo.com";
	String password = "abcd1234";
	
	@BeforeTest 
	public void beforetest(){
		
		driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.navigate().to("https://accounts.nintendo.com/authorize_guide?redirect_uri=https%3A%2F%2Faccounts.nintendo.com%2Fconnect%2F1.0.0%2Fauthorize%3Fclient_id%3De56201e414c97a10%26state%3D6e0df0ebc6636d38a2f7cef136f3fd32%26response_type%3Dcode%2520id_token%2520token%26scope%3DeshopDemo%2520eshopPrice%2520missionStatus%253Aprogress%2520openid%2520pointWallet%2520userNotification%253AanyClients%2520userNotification%253AanyClients%253Awrite%2520userinfo.birthday%2520userinfo.linkedIds%2520userinfo.mii%2520userinfo.profile%26redirect_uri%3Dhttp%253A%252F%252Fwww.nintendo.com%26web_message_uri%3Dhttps%253A%252F%252Faccounts.nintendo.com%26web_message_target%3Dop-frame%26response_mode%3Dweb_message%26prompt%3Dconsent%26display%3Dtouch&type=mixed");
		System.out.println ("I am in the before test");
		
	}
	@Test 
	public void atest(){
		
		pon.clickSignIn().click();
		System.out.println ("I am in the a Test");
	}
	
	@Test
	public void btest(){
		
		Select month = new Select (driver.findElement(By.xpath(".//*[@id='birth-month-field']")));
		month.selectByIndex(2);
		
		Select day = new Select (driver.findElement(By.xpath(".//*[@id='birth-day-field']")));
		day.selectByIndex(11);
		
		Select year = new Select (driver.findElement(By.xpath(".//*[@id='birth-year-field']")));
		year.selectByVisibleText("1977");
		
		pon.clickBirth().click();
		
		System.out.println ("I am in the B Test");
		
	}
	
	@Test 
	public void ctest(){
		pon.getUsername().sendKeys(userName);
		
		pon.getEmail().sendKeys(email);
		
		pon.newPassowrd().sendKeys(password);
		
		pon.retypePassword().sendKeys(password);
		
		Select gender = new Select (driver.findElement(By.xpath(".//*[@id='register-form']/div[6]/div[2]/div/select")));
		gender.selectByIndex(1);
		
		driver.findElement(By.xpath(".//*[@id='register-form']/div[10]/div[1]/input")).click();
		
		driver.findElement(By.xpath(".//*[@id='form-terms_consented']")).click();
		
		System.out.println ("I am in the C Test");
		
		
	}
	
	@BeforeMethod
	public void beforemethod(){
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println ("I am in the before method");
		
	}
	
	@AfterTest
	public void aftertest (){
		System.out.println ("I am in the after test");
		driver.quit();
		
	}

}
