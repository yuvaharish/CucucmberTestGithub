package stepdef;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import utility.BaseClass;

public class OrngHRMLogin extends BaseClass{
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    loadbrowser();
	    loadurl("https://opensource-demo.orangehrmlive.com/");
	}
	@When("the user enters the vailed {string} and {string}")
	public void the_user_enters_the_vailed_and(String string, String string2) {
		typeData(driver.findElement(By.id("txtUsername")), string);
	    typeData(driver.findElement(By.id("txtPassword")), string2);
	}
	@When("click the login button")
	public void click_the_login_button() {
	  clickelement(driver.findElement(By.id("btnLogin")));
	}
	@Then("the user should be navigated to homepage")
	public void the_user_should_be_navigated_to_homepage() {
	   String title = driver.getTitle();
	   System.out.println(title);
	}

	@When("the user enters the below vailed userName and passWord")
	public void the_user_enters_the_below_vailed_user_name_and_pass_word(io.cucumber.datatable.DataTable dataTable) {
		//List<String> asList = dataTable.asList();
		List<Map<String, String>> asMaps = dataTable.asMaps();
		Map<String, String> map = asMaps.get(0);
		typeData(driver.findElement(By.id("txtUsername")), map.get("username"));
	    typeData(driver.findElement(By.id("txtPassword")), map.get("password"));
	}
	
	@When("the user enters the below vailed {string} and {string}")
	public void the_user_enters_the_below_vailed_and(String string, String string2) {
		typeData(driver.findElement(By.id("txtUsername")), string);
	    typeData(driver.findElement(By.id("txtPassword")), string2);
	}
}
