package stepDefinition;

import com.utility.ParentClass_OR_BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DellLogin extends ParentClass_OR_BaseClass { // extend korsi from parent class

	
	
	@Given("^Launch Dell \"([^\"]*)\"$")
	public void launch_Dell(String URL) throws Throwable {
		
		launchURL(URL);
		
	}

	@When("^clcik sign in & click sign in button$")
	public void clcik_sign_in_click_sign_in_button() throws Throwable {
	   
	}

	@Then("^enter email address & enter Password & click login$")
	public void enter_email_address_enter_Password_click_login() throws Throwable {
	   
	}

	@Then("^Verify User in the profile page$")
	public void verify_User_in_the_profile_page() throws Throwable {
	  
		
	}
}
