package signUpAutomations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class bingCssSelector {

	public static void main(String[] args) {
		
		
		WebDriver driver = new FirefoxDriver();
		
		driver.navigate().to("https://signup.live.com/newuser.aspx?wa=wsignin1.0&rpsnv=13&ct=1498613448&rver=6.7.6631.0&wp=MBI&wreply=https%3a%2f%2fwww.bing.com%2fsecure%2fPassport.aspx%3frequrl%3dhttp%253a%252f%252fwww.bing.com%252f%253fwlexpsignin%253d1&id=264960&CSRFToken=13a13f28-be72-4fc7-87e7-468e08672903&contextid=2E3CFFB9D7F22EC8&bk=1498613448&uiflavor=web&uaid=662c0201cdf24919af28518749325849&mkt=EN-US&lc=1033&lic=1");
		
		driver.findElement(By.cssSelector("*[@id='FirstName']")).sendKeys("paul");
		
		
		
	}

}
