package com.Pages;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.Utils.FolderNameGenerator;
import com.qa.Utils.PersonNameGenerator;


public class Familyaccessfilespage {
	
	
	private WebDriver driver;
	 private WebDriverWait wait;

	
	private By Familyfiles=By.xpath("//span[contains(text(),'Family Access Files')]");
	private By addfolder=By.xpath("//span[contains(text(),'Add Folder')]");
	
	private By foldername=By.xpath("//input[@id='folder']");
	private By add=By.xpath("//button[contains(text(),'Add')]");
	private By close=By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-activity-completion-popup[1]/div[1]/div[1]/button[1]");
	private By newfoldername=By.xpath("/html/body/app-root/div/app-user/div/div[2]/div[3]/app-files/div[2]/div[1]/app-filesinfo/div/div/div[2]/div[6]/a");
	 private By enterFolderNameField = By.xpath("//input[@id='folder']");
	private By clickonfolder=By.xpath("/html/body/app-root/div/app-user/div/div[2]/div[3]/app-files/div[2]/div[1]/app-folder/div/div/div/div[2]/div/div[5]/a");
	
	 public Familyaccessfilespage(WebDriver driver) {
			this.driver = driver;
			 this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		}

		public String getFamilyaccessfilesPageTitle() {
			return driver.getCurrentUrl();
		}
		
		public void Familyfiles() throws InterruptedException {
			Thread.sleep(5000);
			WebElement familyfiles=wait.until(ExpectedConditions.elementToBeClickable(Familyfiles));
			familyfiles.click();
			driver.findElement(Familyfiles).click();
		}
	
		public void addfolder() {
			WebElement Addfolder=wait.until(ExpectedConditions.elementToBeClickable(addfolder));
			Addfolder.click();
			
		}
	
		public void foldername(String personName)  {
			WebElement Foldername=wait.until(ExpectedConditions.elementToBeClickable(foldername));
			 String invitePersonName = PersonNameGenerator.generateRandomPersonName();
			Foldername.sendKeys(invitePersonName);
		
		}
		
		   public void enterFolderName() {
		    	
		        WebElement folderNameField = driver.findElement(enterFolderNameField);
		        folderNameField.clear();
		        folderNameField.sendKeys(folderName);
		    }
	
		public void add()  {
			WebElement Add=wait.until(ExpectedConditions.elementToBeClickable(add));
			Add.click();
			
		}
	
		public void close() throws InterruptedException {
			Thread.sleep(3000);
			WebElement Close=wait.until(ExpectedConditions.elementToBeClickable(close));
			Close.click();
			
		}
		
		  private String folderName = FolderNameGenerator.generateRandomFolderName();
		  
		  public void clickOnAddedFolderFiles() throws InterruptedException {
		        By folderXpath = By.xpath("//p[@class='mb-0' and text()='"+ folderName +"']");

		        Thread.sleep(3000);
		        // Wait for the element to be clickable
		        WebElement addedFolder = driver.findElement(folderXpath);

		        try {
		            // Scroll the element into view
		            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", addedFolder);

		            // Attempt to click on the element
		            addedFolder.click();
		        } catch (ElementClickInterceptedException e) {
		            // If the element is still not clickable after scrolling, handle the exception
		            e.printStackTrace(); // Print the exception for debugging purposes
		            // You can add additional handling steps here, such as waiting and retrying, or logging the error
		        } catch (Exception e) {
		            // Handle any other exceptions
		            e.printStackTrace();
		        }
		    }
		
		public void newfoldername() throws InterruptedException {
			Thread.sleep(2000);
			WebElement Newfoldername=wait.until(ExpectedConditions.elementToBeClickable(newfoldername));
			Newfoldername.click();
			
		}
		public void clickonfolder()
		{
			WebElement Clickonfolder=wait.until(ExpectedConditions.elementToBeClickable(clickonfolder));
			Clickonfolder.click();
		}
}