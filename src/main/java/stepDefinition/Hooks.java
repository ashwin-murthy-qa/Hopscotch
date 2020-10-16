package stepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	@Before
	public void Initializetest() {
		System.out.println("opening the browser");
	}
	
	@After
	public void TearDown() {
		System.out.println("closing the browser");
	}

}
