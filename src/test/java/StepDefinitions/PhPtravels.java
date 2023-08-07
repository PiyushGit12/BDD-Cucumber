package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PhPtravels {
	public WebDriver d1;
	
	
	@Given("The user is on the Home page")
	public void the_user_is_on_the_home_page() {

		WebDriverManager.chromedriver().setup();

		d1 = new ChromeDriver();
		d1.get("https://phptravels.com/demo/");
		d1.manage().window().maximize();
	}

	@When("The user navigates to the Login page")
	public void the_user_navigates_to_the_login_page() {
		
		d1.get("https://www.phptravels.net/login");
	}

	@Then("The user enters username and password")
	public void the_user_enters_username_and_password() {
		d1.findElement(By.name("email")).sendKeys("user@phptravels.com");
		d1.findElement(By.name("password")).sendKeys("demouser");
	}

	@And("The user is able to click on the Login button")
	public void the_user_is_able_to_click_on_the_login_button() {
		WebElement loginButtn = d1.findElement(
				By.xpath("//button[@id='submitBTN']"));
		JavascriptExecutor js = (JavascriptExecutor) d1;
		js.executeScript("arguments[0].click();", loginButtn);
		System.out.println("Login Success");
	}

	@Then("The user is logged in successfully")
	public void the_user_is_logged_in_successfully() {
		System.out.println("After Login CurrentURL:" + d1.getCurrentUrl());
	}

	@And("The successful login message is displayed")
	public void the_successful_login_message_is_displayed() {
		System.out.println("Login Success");
	}

	@And("The Browser should be closed")
	public void the_browser_should_be_closed() {
		d1.close();
		System.out.println("Browser Closed");
	}


}
