package librarypproject;


import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import librarypproject.mainclassbook;


public class adminloginSteps{
	mainclassbook x = new mainclassbook();

	public adminloginSteps(mainclassbook o)
	{ x=o;
	x.admin();
	}
	
public boolean v = false;
public String n ;
public String p ;
@Given("I have an account with {string} and {string}")
public void i_have_an_account_with_and(String string, String string2) {
  n=string;
  p=string2;
}

@When("I enter the user name and password in correct way then press enter")
public void i_enter_the_user_name_and_password_in_correct_way_then_press_enter() {
	
  x.main_login_userpassword(n,p);
  v = x.testflagadmin();
}

@Then("I will be inside the website successfuly")
public void i_will_be_inside_the_website_successfuly() {
    boolean t = true;
    assertTrue(t==v);
}

@When("I enter the user name and a wrong password then press enter")
public void i_enter_the_user_name_and_a_wrong_password_then_press_enter() {
	x.main_login_userpassword(n,p);
	  v = x.testflagadmin();
}

@Then("An error message appear beacause of the failed login process")
public void an_error_message_appear_beacause_of_the_failed_login_process() {
	boolean t = false;
    assertTrue(t==v);
}}