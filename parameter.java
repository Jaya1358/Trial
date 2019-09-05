package bdcstepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import jayapackage.Drivers;

public class parameter {
	WebDriver driver;
	@Given("I am launching the webshop url")
	public void i_am_launching_the_webshop_url() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver = Drivers.configureDriver("chrome");
		  driver.manage().window().maximize();
		  driver.get("http://demowebshop.tricentis.com/");
		
	}

	@Then("I will check on Login")
	public void i_will_check_on_Login() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//a[@href='/login']")).click();
	}

	@When("I enter username {string} and password {string}")
	public void i_enter_username_and_password(String email, String password) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(email);
		  driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(password); 

	}

	@When("click on submit button")
	public void click_on_submit_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}

	@Then("verify for user account status")
	public void verify_for_user_account_status() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("status");
	}

}
