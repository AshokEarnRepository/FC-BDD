package com.Pages;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.Utils.ScrollUtils;

public class Insurancepage {
	
	
	private WebDriver driver;
	 private WebDriverWait wait;
	 private ScrollUtils scroll;
	 
	private By gobackfiles=By.xpath("//a[contains(text(),'Files')]");
	private By clickoninsurance=By.xpath("//p[contains(text(),'Insurance')]");
	private By subscriber=By.xpath("//body/app-root[1]/div[1]/app-user[1]/div[1]/div[2]/div[3]/app-files[1]/div[2]/div[1]/app-select-user[1]/div[1]/div[1]/a[1]/div[1]/p[1]");
    private By addfolder=By.xpath("//span[contains(text(),'Add Folder')]");
	
	private By foldername=By.xpath("//input[@id='folder']");
	private By add=By.xpath("//button[contains(text(),'Add')]");
	private By close=By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-activity-completion-popup[1]/div[1]/div[1]/button[1]");
	private By clickonnewfolder=By.xpath("//p[@class='mb-0' and text()='"+foldername+"']");
	
	
	private By carinsurance=By.xpath("//p[contains(text(),'Car Insurance')]");
	private By lifeinsurance=By.xpath("//p[contains(text(),'Life Insurance')]");
	private By homeinsurance=By.xpath("//p[contains(text(),'Home Insurance')]");
	private By petinsurance=By.xpath("//p[contains(text(),'Pet Insurance')]");
	private By umbrellapolicy=By.xpath("//p[contains(text(),'Umbrella Policy')]");
	
	
	
	
	
	
	public Insurancepage(WebDriver driver) {
		this.driver = driver;
		 this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 this.scroll = new ScrollUtils(driver);
	}

	public String getInsurancepageTitle() {
		return driver.getCurrentUrl();
	}
	
	
	public void clickoninsurance() throws InterruptedException {
		Thread.sleep(4000);
		WebElement Gobackfiles=wait.until(ExpectedConditions.elementToBeClickable(gobackfiles));
		Gobackfiles.click();
		Thread.sleep(3000);
		WebElement Clickoninsurance=wait.until(ExpectedConditions.elementToBeClickable(clickoninsurance));
		Clickoninsurance.click();
	}
	public void subscriber()  {
		WebElement Subscriber=wait.until(ExpectedConditions.elementToBeClickable(subscriber));
		Subscriber.click();
	}
	public void  addfolder() {
		WebElement Addfolder=wait.until(ExpectedConditions.elementToBeClickable(addfolder));
		Addfolder.click();
		WebElement Add=wait.until(ExpectedConditions.elementToBeClickable(add));
		Add.click();
		
	}
	
	public void clickonnewfolder() {
		WebElement foldername=wait.until(ExpectedConditions.elementToBeClickable(clickonnewfolder));
		foldername.click();
	}
	
	public void carinsurance() {
		WebElement Carinsurance=wait.until(ExpectedConditions.elementToBeClickable(carinsurance));
		Carinsurance.click();
	}
	public void lifeinsurance() {
		WebElement Lifeinsurance=wait.until(ExpectedConditions.elementToBeClickable(lifeinsurance));
		Lifeinsurance.click();
	}
	public void homeinsurance() {
		WebElement Homeinsurance=wait.until(ExpectedConditions.elementToBeClickable(homeinsurance));
		Homeinsurance.click();
	}
	public void petinsurance() {
		WebElement Petinsurance=wait.until(ExpectedConditions.elementToBeClickable(petinsurance));
		Petinsurance.click();
	}
	public void umbrellapolicy() {
		WebElement Umbrellapolicy=wait.until(ExpectedConditions.elementToBeClickable(umbrellapolicy));
		scroll.scrollIntoView(Umbrellapolicy);
		Umbrellapolicy.click();
	}
	
	

	
	
}
