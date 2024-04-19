package parallel;

import java.util.concurrent.TimeoutException;

import com.Pages.Calendar_Addmilestonepage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Calendar_AddmilestoneSteps {
	
	 private Calendar_Addmilestonepage Calendarpage = new Calendar_Addmilestonepage(DriverFactory.getDriver());
	

	@When("user chooses the appropriate event")
	public void user_chooses_the_appropriate_event() throws InterruptedException {
		Calendarpage.clickcalendar();
		Calendarpage.ADD_MILESTONE();
		Calendarpage.EVENT();
	}
	@Then("user clicks on next")
	public void user_clicks_on_next() {
		Calendarpage.NEXT();
	}
	@Then("user enters the name")
	public void user_enters_the_name() {
		Calendarpage.NAME();
	}
	@Then("user selects the date")
	public void user_selects_the_date() throws InterruptedException {
		Calendarpage.Select_date();
		Calendarpage.Select_day();
	}
	@Then("user sets the reminder")
	public void user_sets_the_reminder() {
		Calendarpage.REMINDER();
	}
	@Then("user entersthe description")
	public void user_entersthe_description() throws TimeoutException {
		Calendarpage.enterDescription();
	}
	@Then("user clicks on save milestone")
	public void user_clicks_on_save_milestone() throws InterruptedException {
		Calendarpage.save();
		Calendarpage.close();
	}




}
