package librarypproject;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import librarypproject.mainclassbook;
import librarypproject.Book;
public class searchBookSteps {
	mainclassbook b = new mainclassbook();

	public searchBookSteps(mainclassbook o)
	{ b=o;
	  b.bookbook();
	  b.admin();
	  
	  
	}
	
	public boolean f = false;
	
	public String testsearch ;
	
	//search title
	@Given("I want to searches for book by providing a {string} of the title")
	public void i_want_to_searches_for_book_by_providing_a_of_the_title(String string) {
		testsearch =string;
	}

	@When("I enter a the substring of that book title then press enter")
	public void i_enter_a_the_substring_of_that_book_title_then_press_enter() {
		   b.searchtitle(testsearch);
			f=b.testflagsearch();
	}
	@Given("administrator is logged in")
	public void administrator_is_logged_in() {
	    b.makeadminlogin();
	}

		@When("I enter string to search for book by providing a {string} of the {string}")
		public void i_enter_string_to_search_for_book_by_providing_a_of_the(String string, String string2) {
			
			b.adminsearch(string, string2);
			f=b.testflagsearch();
		}


	@Then("I will see the full title,author,signature,and the ISBN of that book")
	public void i_will_see_the_full_title_author_signature_and_the_isbn_of_that_book() {
		 boolean t = true;
		 assertTrue(t==f);
	}
//search author
	@Given("I want to searches for book by providing a {string} of the author")
	public void i_want_to_searches_for_book_by_providing_a_of_the_author(String string) {
		testsearch =string;
	}

	@When("I enter a the substring of that book author then press enter")
	public void i_enter_a_the_substring_of_that_book_author_then_press_enter() {
		   b.searchauther(testsearch);
			f=b.testflagsearch();
	}
	//search isbn
	@Given("I want to searches for book by providing a {string} of the ISBN")
	public void i_want_to_searches_for_book_by_providing_a_of_the_isbn(String string) {
		testsearch =string;
	}

	@When("I enter a substring of that book ISBN then press enter")
	public void i_enter_a_substring_of_that_book_isbn_then_press_enter() {
		   b.searchisbn(testsearch);
			f=b.testflagsearch();
	}
	


	
	
	//search for a book doesn't exist
	@Given("I want to searches for book by providing a {string} of the title for examble")
	public void i_want_to_searches_for_book_by_providing_a_of_the_title_for_examble(String string) {
		testsearch =string;
	}

	@When("I enter a substring of that book title then press enter")
	public void i_enter_a_substring_of_that_book_title_then_press_enter() {
		   b.searchtitle(testsearch);
			f=b.testflagsearch();
	}
	
	

	

	@Then("I cant see any book in the list and a message of this library doesnt have this book will appear")
	public void i_cant_see_any_book_in_the_list_and_a_message_of_this_library_doesnt_have_this_book_will_appear() {
		 boolean t = false;
		 assertTrue(t==f);
	}

}
