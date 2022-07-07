package stepdef;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.BaseClass;

public class StepDefination extends BaseClass {

	@Given("user is opening the chrome browser")
	public void user_is_opening_the_chrome_browser() {
		StepDefination.loadbrowser();
	}
	@Given("user is entering google.com")
	public void user_is_entering_google_com() {
		StepDefination.loadurl("https://www.google.com/");
	}
	@When("user is searching for the mobile")
	public void user_is_searching_for_the_mobile() {
		StepDefination.typeData(driver.findElement(By.name("q")), "Mobile");
	}
	@Then("the user should see the search result")
	public void the_user_should_see_the_search_result() {
		StepDefination.enterbtn(driver.findElement(By.name("q")));
	    
	}
	
	@When("user is searching for the {string}")
	public void user_is_searching_for_the(String string) {
		StepDefination.typeData(driver.findElement(By.name("q")), string);
	}
}
