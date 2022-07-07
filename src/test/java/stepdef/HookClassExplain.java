package stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HookClassExplain {
	
	@Given("Whatsup audio")
	public void whatsup_audio() {
	   System.out.println("Whatsup audio");
	}
	@When("whatsup video")
	public void whatsup_video() {
	    System.out.println("whatsup video");
	}
	@Then("whatsup chat")
	public void whatsup_chat() {
	   System.out.println("whatsup chat");
	}

	@Given("Whatsup audio2")
	public void whatsup_audio2() {
	    System.out.println("Whatsup audio2");
	}
	@When("whatsup video2")
	public void whatsup_video2() {
	  System.out.println("whatsup video2");
	}
	@Then("whatsup chat2")
	public void whatsup_chat2() {
	    System.out.println("whatsup chat2");
	}
	@Given("Whatsup created")
	public void whatsup_created() {
	    System.out.println("Whatsup Created background");
	}
}
