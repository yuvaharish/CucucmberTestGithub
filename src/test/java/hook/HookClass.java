package hook;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HookClass {
	
	@Before("@tag1")
	public void whatsupCreate() {
		System.out.println("whatsupcreated");
	}
	@After("@tag1")
	public void whatsuppublish() {
		System.out.println("whatsuppublish");
	}
	
}
