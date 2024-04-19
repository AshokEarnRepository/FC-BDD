package parallel;

import com.Pages.emegencypreppage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmergencyprepSteps {
	
	private emegencypreppage emegencypreppage = new emegencypreppage(DriverFactory.getDriver());

	
	@When("user click on emergency prep and add the folder")
	public void user_click_on_emergency_prep_and_add_the_folder() throws InterruptedException {
		emegencypreppage.clickemergency();
	   
	}
	
	
	
	@Then("user clicks on family health cards")
	public void user_clicks_on_family_health_cards() throws InterruptedException {
		emegencypreppage.familyhealthcards();

	}
	
	
	
	@Then("user clicks on add details")
	public void user_clicks_on_add_details() {
		emegencypreppage.adddetails();
	}
	
	
	
	@Then("user enters the height")
	public void user_enters_the_height() {
		emegencypreppage.height();
		emegencypreppage.cms();
		emegencypreppage.heightin();
	}
	
	
	
	@Then("user enters the weight")
	public void user_enters_the_weight() throws Throwable {
		emegencypreppage.weight();
		emegencypreppage.kg();
		emegencypreppage.weightin();
	}
	
	
	
	@Then("user enters the blood group")
	public void user_enters_the_blood_group() {
		emegencypreppage.bloodgroup();
		emegencypreppage.group();
	}
	
	
	@Then("user enters the medical conditions")
	public void user_enters_the_medical_conditions() {
		emegencypreppage.medicalconditions();
	}
	
	
	@Then("user enters the allergies")
	public void user_enters_the_allergies() {
		emegencypreppage.allergies();
	}
	
	
	
	@Then("user enters the medications")
	public void user_enters_the_medications() {
		emegencypreppage.medication();
	}
	
	
	
	@Then("user clicks on save")
	public void user_clicks_on_save() throws InterruptedException {
		emegencypreppage.save();
	}
	
	
	
	@Then("user edits the familyhealthcard details")
	public void user_edits_the_familyhealthcard_details() throws Throwable {
		emegencypreppage.editfamilyhealthcards();
	}

	
	
	
	// emaergency phone numbers
	
	
	
	
	@When("user clicks on emergency phone numbers")
	public void user_clicks_on_emergency_phone_numbers() {
		emegencypreppage.emergencyphonenumber();
		
	}
	@Then("user clicks on add contact")
	public void user_clicks_on_add_contact() {
		emegencypreppage.addcontact();
		
		
	}
	@Then("user enters the first name")
	public void user_enters_the_first_name() {
		emegencypreppage.firstname();
		
		
	}
	@Then("user enters the last name")
	public void user_enters_the_last_name() {
		emegencypreppage.lastname();
		
		
	}
	@Then("user enters the phone number")
	public void user_enters_the_phone_number() {
		emegencypreppage.flag();
		emegencypreppage.searchcountry();
		emegencypreppage.US();
		emegencypreppage.phone();
		
	}
	@Then("user enters the email")
	public void user_enters_the_email() {
		emegencypreppage.email();
		
		
	}
	@Then("user clicks on save option")
	public void user_clicks_on_save_option() {	
		emegencypreppage.savecontact();
	}




	@When("user clicks on the Emergency Prep")
	public void user_clicks_on_the_emergency_prep() throws InterruptedException {
		emegencypreppage.Emergencyprep();
		
		
	  
	}
	@Then("user clicks on the Worldwide Emergency phone numbers")
	public void user_clicks_on_the_worldwide_emergency_phone_numbers() throws InterruptedException {
		emegencypreppage.Worldwidenumber();
		
		
	    
	}
	@Then("user clicks on the Search option")
	public void user_clicks_on_the_search_option() {
		emegencypreppage.search();
		
	    
	}
	



	
	
	
	
	
	
	
	

}
