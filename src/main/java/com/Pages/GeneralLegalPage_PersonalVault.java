package com.Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.Utils.MouseActionsUtility;
import com.qa.Utils.WebDriverWaits;
 
public class GeneralLegalPage_PersonalVault {
	
	
	WebDriverWaits wait;
	private WebDriver driver;
	private MouseActionsUtility action;
	
	private By Clickon_Generallegal =By.xpath("//p[contains(text(),'General Legal Information')]");
	private By Addfile=By.xpath("//span[contains(text(),'Add')]");
	private By uploadfile=By.xpath("//input[@id='file-upload']");
	private By ClickToUpload=By.xpath("//strong[@class='secondary_blue']");
   private By verifysuccess=By.xpath("//div[contains(text(),'successfully ')]");

	public GeneralLegalPage_PersonalVault(WebDriver driver) {
		this.driver=driver;
		this.wait=new WebDriverWaits(driver, Duration.ofSeconds(20));
		this.action = new MouseActionsUtility(driver);
	}
 
	public String getGenerallegalTitle() {
		return driver.getTitle();
	}

	public void clickgenerallegal() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(Clickon_Generallegal).click();
	}

	public void addfile() {
		driver.findElement(Addfile).click();
	}
 
//	public void uploadFile(String filePath) throws InterruptedException {
//		
//		
//		WebElement fileInput = wait.waitForElementToBeClickable(uploadfile);
//		
//	        String script = "arguments[0].setAttribute('style', 'display: block; visibility: visible;');";
//	        ((JavascriptExecutor) driver).executeScript(script, fileInput);
//		    Thread.sleep(3000);
////			fileInput.sendKeys(filePath);
//			fileInput.sendKeys("C:\\Users\\Ashok\\Downloads\\Untitled.png");
//	        Thread.sleep(1000);
//
//			}
	
	public void uploadFile(String filePath) throws InterruptedException {
		Thread.sleep(3000);
		WebElement fileInput =driver.findElement(uploadfile);
		
	        String script = "arguments[0].setAttribute('style', 'display: block; visibility: visible;');";
	        ((JavascriptExecutor) driver).executeScript(script, fileInput);
	
			fileInput.sendKeys(filePath);
	        Thread.sleep(1000);
		
		
			}

	

	
	
	
	
	public void verify() throws InterruptedException {
		WebElement successMessage = wait.waitForElementToBeClickable(verifysuccess);
		Thread.sleep(2000);
	    System.out.println(">> Print: "+ successMessage.isDisplayed());
	    Thread.sleep(2000);
	}
}