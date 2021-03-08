package librarypproject;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import librarypproject.mainclassbook;
public class Adminlogoutsteps {

	 public mainclassbook x = new mainclassbook();
public boolean v;
	public Adminlogoutsteps(mainclassbook o)
	{ x=o;
	x.admin();
	}
	@Given("I logged in")
	public void i_logged_in() {
	   x.makeadminlogin();
	}

	@When("I press logout")
	public void i_press_logout() {
	 v=  x.logout();
	}

	@Then("I will be outside the website successfuly")
	public void i_will_be_outside_the_website_successfuly() {
	    boolean m = true;
	    assertTrue(m==v);
	}
}
