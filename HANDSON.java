package bdcstepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import jayapackage.Drivers;


public class HANDSON {
	WebDriver driver;
	@Given("The website is launched")
	public void the_website_is_launched() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver = Drivers.configureDriver("chrome");
		  driver.manage().window().maximize();
		  driver.get("http://demowebshop.tricentis.com/");
	}
	@Given("User Logins with valid creds in Dem Webshop")
	public void user_Logins_with_valid_creds_in_Dem_Webshop() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
driver.findElement(By.xpath("//a[@href='/login']")).click();
driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("jayashree.bd98@gmail.com");
driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Daya@1997");
	}

	@Then("Clicks on login button")
	public void clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}

	@Given("User searches for the item")
	public void user_searches_for_the_item() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//a[@href='/books']")).click();
//For every new run give different item because the previous item would be inside the cart
driver.findElement(By.xpath("//a[@href='/fiction']")).click();
	}

	@Given("Clicks on add to cart")
	public void clicks_on_add_to_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
	}

	@Then("user can logout")
	public void user_can_logout() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//a[@href='/logout']")).click();
	}

	@Given("User again searches for the item")
	public void user_again_searches_for_the_item() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//a[@href='/computers']")).click();
driver.findElement(By.xpath("//img[@title='Show products in category Desktops']")).click();
//For every new run give different item because the previous item would be inside the cart
driver.findElement(By.xpath("//a[@href='/build-your-own-computer']")).click();


	}

	@Given("clicks on the add to cart")
	public void clicks_on_the_add_to_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
	}

	@Then("user will again logout")
	public void user_will_again_logout() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//a[@href='/logout']")).click();
	}

}
