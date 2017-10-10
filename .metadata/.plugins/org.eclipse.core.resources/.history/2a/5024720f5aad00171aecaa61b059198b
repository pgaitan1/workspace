package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class login {
	
	WebDriver driver = new FirefoxDriver();
	

@Given("^user is on the homepage$")
public void user_is_on_the_homepage() throws Throwable {
	driver.navigate().to("https://www.facebook.com/");
   
}


@When("^user enters valid firstname$")
public void user_enters_valid_firstname() throws Throwable {
	driver.findElement(By.xpath(".//*[@id='u_0_4']")).sendKeys("Paul");
}

@When("^user enters valid lastname$")
public void user_enters_valid_lastname() throws Throwable {
	driver.findElement(By.xpath(".//*[@id='u_0_6']")).sendKeys("Gaitan");
}

@When("^user enters valid phone number$")
public void user_enters_valid_phone_number() throws Throwable {
	driver.findElement(By.xpath(".//*[@id='u_0_9']")).sendKeys("2406206200");
}



@When("^user enters valid password$")
public void user_enters_valid_password() throws Throwable {
	driver.findElement(By.xpath(".//*[@id='u_0_g']")).sendKeys("abc12345");
   
}

@Then("^user should be able to login$")
public void user_should_be_able_to_login() throws Throwable {
	
	String Submit = driver.findElement(By.xpath(".//*[@id='u_0_m']")).getText();
	System.out.println (Submit);
    
}



}
