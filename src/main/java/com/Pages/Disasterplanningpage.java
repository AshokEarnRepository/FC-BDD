package com.Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Disasterplanningpage {
	

	private WebDriver driver;
	WebDriverWait wait;
	    private By emergencyprep=By.xpath("(//span[contains(text(),'Emergency Prep')])[1]");
	    private By disasterplanning=By.xpath("//p[contains(text(),'Disaster Planning')]");
	    private By disasterplanningBack =By.xpath("//a[@class='home_btn' and text()='Disaster Planning']");
	    private By supplykit=By.xpath("//p[contains(text(),'Supply Kit')]");
	    private By homeevacuation=By.xpath("//p[contains(text(),'Home Evacuation')]");
	    private By MeetingPlaces=By.xpath("//p[contains(text(),'Meeting Places')]");
	    private By Commuterplan=By.xpath("//p[contains(text(),'Commuter Plan')]");
	    private By Emergencyprepback=By.xpath("//a[contains(text(),'Emergency Prep')]");
	
	    public Disasterplanningpage(WebDriver driver) {
		this.driver=driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	}

	
	    public String getSharedwithmeTitle() {
		return driver.getTitle();
		
	}
	
	
	
	    public void emergencyprep() {
	    	WebElement Emergencyprep=wait.until(ExpectedConditions.elementToBeClickable(emergencyprep));
	    	Emergencyprep.click();
		
	}
	
	    public void disasterplanning() {
	    	WebElement Disasterplanning=wait.until(ExpectedConditions.elementToBeClickable(disasterplanning));
	    	Disasterplanning.click();
		
	}
	    public void disasterplanningBack() throws InterruptedException {
	    	WebElement Disasterplanning=wait.until(ExpectedConditions.elementToBeClickable(disasterplanningBack));
	    	Disasterplanning.click();
		Thread.sleep(4000);
	}
	    
	
	    public void supplykit() {
	    	WebElement Supplykit=wait.until(ExpectedConditions.elementToBeClickable(supplykit));
	    	Supplykit.click();
		
		
	}
	
	    public void homeevacuation() {
	    	WebElement Homeevacuation=wait.until(ExpectedConditions.elementToBeClickable(homeevacuation));
	    	Homeevacuation.click();
		
	}
	
	
	    public void Meetingplace() {
	    	WebElement meetingPlaces=wait.until(ExpectedConditions.elementToBeClickable(MeetingPlaces));
	    	meetingPlaces.click();
		
	}
	
	
	    public void Commuterplan() {
	    	WebElement commuterplan=wait.until(ExpectedConditions.elementToBeClickable(Commuterplan));
	    	commuterplan.click();
		
	}
	
	    
	    public void Emergencyprepback() {
	    	WebElement emergencyprepback=wait.until(ExpectedConditions.elementToBeClickable(Emergencyprepback));
	    	emergencyprepback.click();
		
			
		}
		
	

}
