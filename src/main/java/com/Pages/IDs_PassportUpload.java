package com.Pages;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.MoveTargetOutOfBoundsException;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.Utils.MouseActionsUtility;
import com.qa.Utils.ScrollUtils;
import com.qa.Utils.WebDriverWaits;
import com.qa.factory2.DriverFactory;

public class IDs_PassportUpload {
	
	private WebDriver driver;
	private WebDriverWait waits;
	private WebDriverWaits wait;
	private ScrollUtils scroll;
	 private MouseActionsUtility mouseActionsUtility;
	
	private By familyAccessFilesLink = By.xpath("//a[@class='nav-link']//span[contains(text(),'Family Access Files')]");
	private By clickIDs = By.xpath("//div[@class='box_icon_name']/p[text()='IDs']");
	private By ClickOnSubscriber = By.xpath("(//p[@class='text-capitalize'])[1]");
	private By ClickOnPassPort = By.xpath("//div[@class='box_icon_name']/p[text()='Passport']");
	private By ClickOnMilitaryID = By.xpath("//div[@class='box_icon_name']/p[text()='Military ID']");
	
	private By ClickOnTravelersID = By.xpath("//div[@class='box_icon_name']/p[text()='Travelers ID']");
	private By ClickOnPetWalleID = By.xpath("//div[@class='box_icon_name']/p[text()='Pet wallet ID']");
	private By ClickOnSocialSecurityCard = By.xpath("//div[@class='box_icon_name']/p[text()='Social security card']");
	
	private By ClickON_AddBtn  = By.xpath("//button[@class='primary_btn add_btn dropdown-toggle']");
	private By ClickOnScan = By.xpath("//label[@class='d-flex align-items-center gap-2 mb-0']");
	private By ClickToScan_PopUpUpload = By.xpath("//input[@class='file_upload']");
	private By ClickOnDone_popUp = By.xpath("//button[@class='primary_btn']");
	private By VerifySuccessToast = By.xpath("//div[@aria-label='Uploaded successfully']");
	private By ClickOnSave_popUp  = By.xpath("//button[@class='primary_btn' and text()='Save']");
	private By ClickOnView_UploadedPassport = By.xpath("(//span[@class='options-icon'])[1]");
	private By ClickOnThreeDots  = By.xpath("(//button[@id='docDropDown'])[1]");
	private By ClickOnClose = By.xpath("//button[@class='btn-close']");
	
	private By BirthCert_Folder = By.xpath("//p[@class='mb-0' and text()='Birth certificate']");
	
	
//	private By  = By.xpath("");
	
	// Constructor of the page class:
		public IDs_PassportUpload(WebDriver driver) {
			this.driver = driver;
			this.waits = new WebDriverWait(driver, Duration.ofSeconds(20));
			this.wait = new WebDriverWaits(driver, Duration.ofSeconds(20));
			this.scroll = new ScrollUtils(driver);
			this.mouseActionsUtility = new MouseActionsUtility(driver);
		}
		
		public void clickOnFiles() {
			
			wait.waitForElementToBeClickable(familyAccessFilesLink).click();
		}
	
	public void clickOnIDs() throws InterruptedException {
			
			WebElement IDsFolder = wait.waitForElementToBeClickable(clickIDs);

			try {
				IDsFolder.click();
			} catch (ElementClickInterceptedException e) {
				// If the element is not clickable, scroll into view and click again
				scroll.scrollIntoView(IDsFolder);
				IDsFolder.click();
			}

			Thread.sleep(3000);
		}
	
	public void clickOnBirthDay() throws InterruptedException {
		
		WebElement BirthFolder = wait.waitForElementToBeClickable(By.xpath("//p[@class='mb-0' and text()='Birth certificate']"));

		try {
			BirthFolder.click();
		} catch (ElementClickInterceptedException e) {
			// If the element is not clickable, scroll into view and click again
			scroll.scrollIntoView(BirthFolder);
			
			BirthFolder.click();
		}
		}
	

		
		public void clickOnDrivingLicense() throws InterruptedException {
			
			WebElement drivingLicenseFolder = wait.waitForElementToBeClickable(By.xpath("//p[@class='mb-0' and text()='Drivers license']"));

			try {
				drivingLicenseFolder.click();
			} catch (ElementClickInterceptedException e) {
				// If the element is not clickable, scroll into view and click again
				scroll.scrollIntoView(drivingLicenseFolder);
				drivingLicenseFolder.click();
			}

		Thread.sleep(3000);
	}
		public void clickOnFinance() throws InterruptedException {
		    WebElement FinanceFolder = wait.waitForVisibilityOfElement(By.xpath("//p[@class='mb-0 file_length' and text()='Finance']"));
		    scroll.scrollToElement(FinanceFolder);
		    FinanceFolder.isDisplayed();
		    
		    mouseActionsUtility.hoverAndClick(FinanceFolder, FinanceFolder);
		    Thread.sleep(3000);
		}
		


	public void clickOnSubscriber() {
		
		wait.waitForElementToBeClickable(ClickOnSubscriber).click();
	}
	
	  public void clickOnPassportFolder() {
		
			wait.waitForElementToBeClickable(ClickOnPassPort).click();
		}
	  public void clickOnMilitaryIDFolder() throws InterruptedException {
			    WebElement MilitaryFolder = wait.waitForVisibilityOfElement(ClickOnMilitaryID);
			    scroll.scrollToElement(MilitaryFolder);
			    MilitaryFolder.isDisplayed();
			    
			    mouseActionsUtility.hoverAndClick(MilitaryFolder, MilitaryFolder);
			    Thread.sleep(3000);
		}
	  public void clickOnPetWalletID() throws InterruptedException {
		    WebElement petWalletIDFolder = wait.waitForVisibilityOfElement(ClickOnPetWalleID);
		    scroll.scrollToElement(petWalletIDFolder);
		    petWalletIDFolder.isDisplayed();
		    
		    try {
		        // Hover over the element and then click
		    	mouseActionsUtility.moveByOffset(1280, 587);
		    	mouseActionsUtility.hoverAndClick(petWalletIDFolder, petWalletIDFolder);
		    	
		    } catch (ElementNotInteractableException e) {
		        // If clicking directly fails, try scrolling into view and clicking again
		        scroll.scrollIntoView(petWalletIDFolder);
		        petWalletIDFolder.click();
		    }

		    Thread.sleep(3000);
		}


	  public void clickOnSocialSecurityCard() throws InterruptedException {
		    WebElement SocialSecurityCardFolder = wait.waitForVisibilityOfElement(ClickOnSocialSecurityCard);
		    scroll.scrollToElement(SocialSecurityCardFolder);
		    SocialSecurityCardFolder.isDisplayed();
		    
		    mouseActionsUtility.hoverAndClick(SocialSecurityCardFolder, SocialSecurityCardFolder);
		    Thread.sleep(3000);
	}
	  public void clickOnTravelersID() throws InterruptedException {
		    WebElement TravelersIDFolder = wait.waitForVisibilityOfElement(ClickOnTravelersID);
		    scroll.scrollToElement(TravelersIDFolder);
		    TravelersIDFolder.isDisplayed();
		    
		    mouseActionsUtility.moveByOffset(1280, 587);
		    mouseActionsUtility.hoverAndClick(TravelersIDFolder, TravelersIDFolder);
		    Thread.sleep(3000);
	}

     public void clickOnAddButton() throws InterruptedException {
		WebElement addBtn = wait.waitForVisibilityOfElement(ClickON_AddBtn);
		addBtn.isEnabled();
		addBtn.isDisplayed();
		scroll.scrollIntoView(addBtn);
		// Click the button
	    Actions actions = new Actions(driver);
	    Thread.sleep(2000);
	    actions.moveToElement(addBtn).click().perform();
//	    driver.findElement(By.xpath("//a[text()='Passport']")).click();
	}
     
     public void clickOnScanOption() {
    	    try {
    	        WebElement scanElement = wait.waitForElementToBeClickable(ClickOnScan);
    	        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scanElement);
    	        scanElement.click();
    	    } catch (TimeoutException e) {
    	        System.out.println("TimeoutException occurred while waiting for Scan option to be clickable.");
    	        // Add retry logic, refresh the page, or handle the exception according to your requirement
    	    }
    	}


  public void clickOnScanPopUp_upload() throws InterruptedException {
 		
	    Thread.sleep(2000);
 		WebElement fileInput = driver.findElement(ClickToScan_PopUpUpload);
 		
	    // Upload the file using FileUploadHelper
	   fileInput.sendKeys("C:\\Users\\Ashok\\Documents\\Passport.jpg");
 	}
  
  
  public void clickOnScanPopUp_upload2() throws InterruptedException {
		
	    Thread.sleep(2000);
		WebElement fileInput = driver.findElement(ClickToScan_PopUpUpload);
		Thread.sleep(2000);
	    
	    // Upload the file using FileUploadHelper
	   fileInput.sendKeys("C:\\Users\\Ashok\\Documents\\Passport2.jpg");
	}
  public void clickOnScanPopUp_upload3() throws InterruptedException {
	  Thread.sleep(2000);
		WebElement fileInput = driver.findElement(ClickToScan_PopUpUpload);
		Thread.sleep(2000);
	    
	    // Upload the file using FileUploadHelper
	   fileInput.sendKeys("C:\\Users\\Ashok\\Documents\\Passport3.jpg");
	}
  public void clickOnScanPopUp_upload4() throws InterruptedException {
	  Thread.sleep(2000);
		WebElement fileInput = driver.findElement(ClickToScan_PopUpUpload);
		Thread.sleep(2000);
	    
	    // Upload the file using FileUploadHelper
	   fileInput.sendKeys("C:\\Users\\Ashok\\Documents\\Passport5.jpg");
	}
  public void clickOnScanPopUp_upload5() throws InterruptedException {
	  Thread.sleep(2000);
		WebElement fileInput = driver.findElement(ClickToScan_PopUpUpload);
		Thread.sleep(2000);
	    
	    // Upload the file using FileUploadHelper
	   fileInput.sendKeys("C:\\Users\\Ashok\\Documents\\Passport6.jpg");
	}

  
  
  
  public void verifySuccessToast() throws InterruptedException {
		
	  WebElement msg = wait.waitForElementToBeVisible(VerifySuccessToast);
			  Thread.sleep(2000);
	       System.out.println(msg.isDisplayed());
  }
  
  public void clickOnDonePopUp() {
 		
 		WebElement done = driver.findElement(ClickOnDone_popUp);
 		scroll.scrollToElement(done);
 		done.click();
 	}
  public void clickOnSavePopUp() throws InterruptedException {
	  Thread.sleep(2000);
	    WebElement save = driver.findElement(ClickOnSave_popUp);
	    
	    if (save.isEnabled()) {
	        // Scroll to the element using JavaScript Executor
	        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", save);
	        
	        // Click on the element
	        save.click();
	    } else {
	        // Handle the case where the element is not enabled
	        // You can add your logic here
	    	System.out.println("Element is not scroll into view");
	    }
	}

  public void ClickOnThreeDots() throws InterruptedException {
		
	    Thread.sleep(3000);
		WebElement ThreeDots = wait.waitForElementToBeClickable(ClickOnThreeDots);
 		scroll.scrollIntoView(ThreeDots);
 		ThreeDots.click();
	}
 public void ClickOnViewPassport() {
		
		wait.waitForElementToBeClickable(ClickOnView_UploadedPassport).click();
	}
 
 public void CloseThePassportWindow() {
		
		wait.waitForElementToBeClickable(ClickOnClose).click();
	}
 
 public void ClickOnTheUser() throws InterruptedException {
		
		wait.waitForElementToBeClickable(By.xpath("//li[@class='breadcrumb-item'][5]")).click();
		Thread.sleep(3000);
	}


}
