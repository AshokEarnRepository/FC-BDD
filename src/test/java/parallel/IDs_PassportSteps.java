package parallel;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.TimeoutException;

import com.Pages.IDs_PassportUpload;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class IDs_PassportSteps {

	
	private IDs_PassportUpload passport = new IDs_PassportUpload(DriverFactory.getDriver());
	
	 @Given("User navigates to the Family Access Files section")
	    public void user_is_on_the_family_access_files_section() {
	        passport.clickOnFiles();
	    }

	    @When("User clicks on IDs")
	    public void user_clicks_on_ids() throws InterruptedException {
	        passport.clickOnIDs();
	    }
	    
	    @When("clicks on the Birth certificate")
	    public void user_clicks_on_Birth() throws InterruptedException {
	        passport.clickOnBirthDay();
	    }

	    @When("User selects the subscriber")
	    public void user_selects_the_subscriber() {
	        passport.clickOnSubscriber();
	    }
	    @When("user clicks on the Driving license")
	    public void user_selects_the_Driving() throws InterruptedException {
	        passport.clickOnDrivingLicense();
	    }

	    @When("user clicks on the Finance")
	    public void user_selects_the_Finance() throws InterruptedException {
	        passport.clickOnFinance();
	    }
	    
	    @When("User selects the passport folder")
	    public void user_selects_the_passport_folder() {
	        passport.clickOnPassportFolder();
	    }
	    
	    
	    @When("clicks on the MilitaryID certificate")
	    public void user_clicks_on_the_MilitaryID() throws InterruptedException {
	        passport.clickOnMilitaryIDFolder();
	    }
	    
	    @When("user clicks on the SocialsecuirityCard")
	    public void user_clicks_on_the_SocialsecuirityCard() throws InterruptedException {
	        passport.clickOnSocialSecurityCard();
	    }
	    @When("user clicks on the TravelersID")
	    public void user_clicks_on_the_TravelersID() throws InterruptedException {
	        passport.clickOnTravelersID();
	    }
	    
	    @When("user clicks on the PetWalletID")
	    public void user_clicks_on_the_PetWalletID() throws InterruptedException {
	        passport.clickOnPetWalletID();
	    }

	    @When("User clicks on the Add button")
	    public void user_clicks_on_the_add_button() throws InterruptedException {
	        passport.clickOnAddButton();
	    }

	    @When("User selects the Scan option")
	    public void user_selects_the_scan_option() throws InterruptedException {
	        passport.clickOnScanOption();
	    }

	    @When("User uploads the Passport file into the Passport folder")
	    public void user_uploads_the_file_into_the_specific_folder() throws InterruptedException {
	    	
	    		   passport.clickOnScanPopUp_upload();
	    }
	    
	    @When("User uploads the Birth Certificate file into the Birth folder")
	    public void user_uploads_the_file_into_the_Birth_folder() throws InterruptedException {
	    	
	    		   passport.clickOnScanPopUp_upload();
	    }
	    
	    @When("User uploads the Invoice file into the Invoice folder")
	    public void user_uploads_the_file_into_the_Invoice_folder() throws InterruptedException {
	    	
	    		   passport.clickOnScanPopUp_upload();
	    }
	    
	    @When("User should see the success toast message")
	    public void UserShouldSeeTheSuccuss() throws InterruptedException {
	        passport.verifySuccessToast();
	    }
	    
	    @Then("User Clicks on Done Option")
	    public void user_clicks_on_done_option() {
	    	passport.clickOnDonePopUp();
	    }

	    @Then("User Clicks On the Save Option On PopUp")
	    public void user_clicks_on_the_save_option_on_pop_up() throws InterruptedException {
	    	passport.clickOnSavePopUp();
	    }

	    @Then("User Click On the Three Dots Option of File Uploaded")
	    public void user_click_on_the_three_dots_option_of_file_uploaded() throws InterruptedException {
	    	
	    	
	    	passport.ClickOnThreeDots();
	    }

	    @Then("User Click on the View File")
	    public void user_click_on_the_view_file() {
	    	passport.ClickOnViewPassport();
	    }

	    @Then("User Close the PopUp Window")
	    public void user_close_the_pop_up_window() {
	    	passport.CloseThePassportWindow();
	    }
	    
	    @When("User uploads the Passport2 file into the Passport folder")
	    public void user_uploads_the_file_into_the_specific_folder2() throws InterruptedException {
	    	
	    		   passport.clickOnScanPopUp_upload2();
	    }
	    @When("User uploads the Passport3 file into the Passport folder")
	    public void user_uploads_the_file_into_the_specific_folder3() throws InterruptedException {
	    	
	    		   passport.clickOnScanPopUp_upload3();
	    }
	    
	    @When("User uploads the Passport5 file into the Passport folder")
	    public void user_uploads_the_file_into_the_specific_folder4() throws InterruptedException {
	    	
	    		   passport.clickOnScanPopUp_upload4();
	    }
	    @When("User uploads the Passport6 file into the Passport folder")
	    public void user_uploads_the_file_into_the_specific_folder5() throws InterruptedException {
	    	
	    		   passport.clickOnScanPopUp_upload5();
	    }
	    @When("Click on User breadCrum Option")
	    public void ClickOnUserBreadCrumOption() throws InterruptedException {
	    	
	    		   passport.ClickOnTheUser();
	    }

	    
}
