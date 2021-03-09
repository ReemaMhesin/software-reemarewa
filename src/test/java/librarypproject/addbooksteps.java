package librarypproject;


import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import librarypproject.mainclassbook;

public class addbooksteps {
	public mainclassbook x = new mainclassbook();
	public boolean r;
	public addbooksteps(mainclassbook o) {
		x=o;
		x.admin();
		
	}
	@Given("I am the admin and I am logged in")
	public void i_am_the_admin_and_i_am_logged_in() {
	    x.makeadminlogin();
	}

	@When("I add book with {string} and {string} and {string} and {string}")
	public void i_add_book_with_and_and_and(String string, String string2, String string3, String string4) {
	    x.adminaddbook(string, string2, string3, string4);
	}

	@Then("book will be added successfuly")
	public void book_will_be_added_successfuly() {
		r = x.testadd();
		boolean b = true;
		assertTrue(r==b);
	}
	

	@Given("the admin is not logged in")
	public void the_admin_is_not_logged_in() {
	   
	}

	@Then("book will not be added successfuly")
	public void book_will_not_be_added_successfuly() {
		r = x.testadd();
		boolean b = false;
		assertTrue(r==b);
	}


}
