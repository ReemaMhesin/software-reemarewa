package librarypproject;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import librarypproject.mainclassbook;

public class Adminlogoutsteps {
	mainclassbook x = new mainclassbook();
	public boolean v;
	
	public Adminlogoutsteps(mainclassbook o) {
		 x=o;
			
	}
	@Given("I logged in")
	public void i_logged_in() {
	   
	}

	@When("I press logout")
	public void i_press_logout() {
	    x.logout();
	}

	@Then("I will be outside the website")
	public void i_will_be_outside_the_website() {
		v = x.testflagadmin();
		boolean t = false;
		assertTrue(v==t);
	    
	}
}
