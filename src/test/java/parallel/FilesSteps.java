package parallel;

import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FilesSteps {
	
	private Filespage Filespage = new Filespage(DriverFactory.getDriver());
	
	
	@Given("user should able to Click on files")
	public void user_should_able_to_click_on_files() throws InterruptedException {
		Filespage.clickonfiles();
	}
	@Then("user should click on important contacts")
	public void user_should_click_on_important_contacts() {
		Filespage.clickoncontact();
	}
	@Then("user should click on add contact")
	public void user_should_click_on_add_contact() {
		Filespage.add();
	}
	@Then("user should enter the first name, last name, phone number")
	public void user_should_enter_the_first_name_last_name_phone_number() {
		Filespage.firstname();
		Filespage.lastname();
		Filespage.phonenumber();
	}
	@Then("user should click on save button")
	public void user_should_click_on_save_button() {
		Filespage.save();
	}
	
	

	

	@When("user clicks on files")
	public void user_clicks_on_files() throws InterruptedException {
		Filespage.files();
	}
	@Then("user clicks on medical")
	public void user_clicks_on_medical() {
		Filespage.medical();
	}
	@Then("user clicks on subscriber")
	public void user_clicks_on_subscriber() {
		Filespage.subscriber();
	}
	@Then("user clicks on vaccine cards")
	public void user_clicks_on_vaccine_cards() {
		Filespage.vaccinecards();
	}


	

	@Then("user clicks on Health insurance")
	public void user_clicks_on_health_insurance() throws InterruptedException {
		Thread.sleep(2000);
		Filespage.Healthinsurance();
	}
	@Then("user clicks on Immunizations")
	public void user_clicks_on_immunizations() throws InterruptedException {
		Thread.sleep(2000);
		Filespage.Immunization();
	}








}
