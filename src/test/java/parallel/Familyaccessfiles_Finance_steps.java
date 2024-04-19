package parallel;

import com.Pages.Familyaccessfiles_finance_page;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Familyaccessfiles_Finance_steps {
	
	
	private Familyaccessfiles_finance_page Familyaccessfiles_finance_page = new Familyaccessfiles_finance_page(DriverFactory.getDriver());
	
	@When("user clicks on Finance")
	public void user_clicks_on_finance() throws InterruptedException {
		Familyaccessfiles_finance_page.Finance();
		
	}
	
	@Then("user clicks on finance subscriber")
	public void user_clicks_on_finance_subscriber() throws InterruptedException {
		Familyaccessfiles_finance_page.subscriber();
	}
	
	@Then("user clicks on the invoice")
	public void user_clicks_on_the_invoice() throws InterruptedException {
		Familyaccessfiles_finance_page.invoice();
	}
	
	@Then("user clicks on the Finance add button")
	public void user_clicks_on_the_finance_add_button() throws InterruptedException {
		Familyaccessfiles_finance_page.add();
	}
	
	@Then("user clicks on the scan document")
	public void user_clicks_on_the_scan_document() throws InterruptedException {
		Familyaccessfiles_finance_page.scandocument();
	}
	
	@Then("user scans the invoice")
	public void user__the_invoice() throws InterruptedException {
		 String filePath = "C:\\Users\\RAMYA\\Downloads\\G034034123_Invoice 1 (1).pdf";
		Familyaccessfiles_finance_page.clicktoupload(filePath);
		Thread.sleep(3000);
		Familyaccessfiles_finance_page.done();
	}



}
