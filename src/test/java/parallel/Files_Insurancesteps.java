package parallel;

import com.Pages.Insurancepage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Files_Insurancesteps {
	
	private Insurancepage Insurancepage = new Insurancepage(DriverFactory.getDriver());


	@When("user clicks on Insurance")
	public void user_clicks_on_insurance() throws InterruptedException {
		
		Insurancepage.clickoninsurance();
		
	}
	@Then("user clicks on the Insurance new folder")
	public void user_clicks_on_the_insurance_new_folder() throws InterruptedException {
		Insurancepage.clickonnewfolder();
	}
	
	
	@Then("click on the Carinsurance")
	public void click_on_the_carinsurance() {
		Insurancepage.carinsurance();
	}
	@Then("click on the home insurance")
	public void click_on_the_home_insurance() {
		Insurancepage.homeinsurance();
	}
	
	
	@Then("click on the life insurance")
	public void click_on_the_life_insurance() {
		Insurancepage.lifeinsurance();
	}
	
	
	@Then("click on the pet insurance")
	public void click_on_the_pet_insurance() {
		Insurancepage.petinsurance();
	}
	
	
	@Then("click on the umbrella policy")
	public void click_on_the_umbrella_policy() {
		Insurancepage.umbrellapolicy();
	}






}
