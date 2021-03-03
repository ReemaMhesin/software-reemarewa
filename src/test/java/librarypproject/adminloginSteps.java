package librarypproject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class adminloginSteps {
	
	public mainclassbook ob;
	
	adminloginSteps (mainclassbook ob1){
		ob=ob1;
	}
	
	public static String s1;
	public static String s2;
	
	
@Given("I have an account with user name and password")
public void i_have_an_account_with_user_name_and_password(String userr,String passwoardd) {
	 s1=userr;
	 s2=passwoardd;
}

@When("I enter the user name and password in correct way")
public void i_enter_the_user_name_and_password_in_correct_way() {
	ob.main_add_userpassword(s1,s2);
}

@When("Press enter")
public void press_enter() {

}

@Then("I will be inside the website successfuly")
public void i_will_be_inside_the_website_successfuly() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("I enter the user name and wrong password")
public void i_enter_the_user_name_and_wrong_password() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("An error message appear beacause of the failed login process")
public void an_error_message_appear_beacause_of_the_failed_login_process() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
	
	
}
