package librarypproject;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import librarypproject.mainclassbook;

public class addbooksteps {

	mainclassbook t = new mainclassbook();
	public String s;
	public String s1;
	public String s2;
	public String s3;
	public String s4;
	public String s5;
	public boolean v,y;
	
	public addbooksteps(mainclassbook o) {
		t=o;
		t.admin();
	}
	
	
	@Given("my account {string} and {string} I will add a book with {string} and {string} and {string} and {string}")
	public void my_account_and_i_will_add_a_book_with_and_and_and(String string, String string2, String string3, String string4, String string5, String string6) {
	  s=string;
	  s1=string2;
	  s2=string3;
	  s3=string4;
	  s4=string5;
	  s5=string3;
	 
	}

	@When("I add a book")
	public void i_add_a_book() {
	   t.adminaddbook(s,s1,s2,s3,s4,s5);
	}

	@Then("book well be added to the library")
	public void book_well_be_added_to_the_library() {
		boolean b = true;
		v = t.testadd();
		assertTrue(v==b);
	   
	}

	@Then("book will not be added to the library")
	public void book_will_not_be_added_to_the_library() {
		boolean b = false;
		y = t.testadd();
		assertTrue(v==b);
	}

	
	
	
}