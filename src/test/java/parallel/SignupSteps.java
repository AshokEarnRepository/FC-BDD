package parallel;

import com.Pages.signuppage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class SignupSteps {
	private signuppage signuppage = new signuppage(DriverFactory.getDriver());
	
	@Given("user is on familycentral page")
	public void user_is_on_familycentral_page() throws InterruptedException {
		signuppage.random1();
	}
	
	
	@When("user clicks on LandingPagesignup")
	public void user_clicks_on_landing_pagesignup() {
		System.out.println("user is on landing page");
	}
	
	
	
	@When("user clicks on signup option of families")
	public void user_clicks_on_signup_option_of_families() {
		System.out.println("user is going to singn up");
	   
	}
	
	
	
	@When("user enters the appropriate details")
	public void user_enters_the_appropriate_details() throws Throwable {
		signuppage.signup();
	}
	
	
	
	@When("user clicks on continue button")
	public void user_clicks_on_continue_button() throws InterruptedException {
		signuppage.skip();
		Thread.sleep(2000);
	
	
	}

}
