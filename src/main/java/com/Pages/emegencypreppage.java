package com.Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.Utils.ScrollUtils;
import com.qa.Utils.WebDriverWaits;

public class emegencypreppage {
	
	private WebDriver driver;
	 private WebDriverWaits waitUtil;
	 ScrollUtils scroll;
	 private WebDriverWait wait;
	 
	private By emergencyprep =By.xpath("//span[text()='Emergency Prep']");
	private By familyhealthcards=By.xpath("//p[contains(text(),'Family Health Cards')]");
	private By adddetails= By.xpath("//a[contains(text(),'Add Details')]");
	private By height=By.xpath("//select[@id='heightUnit']");
	private By cms=By.xpath("//option[contains(text(),'Feet and Inches')]");                       
	private By heightin=By.xpath("//select[@id='heightUnits']");
	private By heightinunit = By.xpath("//select//option[contains(text(),'7’ 6’’')]");
	private By weight=By.xpath("//select[@id='weightUnits']");
	private By kg=By.xpath("//option[contains(text(),'Kg')]");
	private By weightin=By.xpath("//input[@id='weight']");
	private By bloodgroup=By.xpath("//select[@id='searchTerm']");
	private By group=By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/family-card-details[1]/div[1]/div[1]/div[1]/form[1]/div[3]/select[1]/option[3]");
	private By medical=By.xpath("//input[@id='medical-conditions']");
	private By allergies=By.xpath("//input[@id='allergies']");
	private By medications=By.xpath("//input[@id='medications']");
	private By save=By.xpath("//button[contains(text(),'Save')]");
	
/*	private By view=By.xpath(" //a[contains(text(),'View Health Card')]");
	private By edit=By.xpath("//button[@id='profileEdit']");*/
	
	
	
	private By emergencyphonenumber=By.xpath("//p[contains(text(),'Emergency Phone Numbers')]");
	private By addcontact = By.xpath("//span[contains(text(),'Add Contact')]");
	private By firstname=By.xpath("//input[@placeholder='Enter Your First Name']");
	private By lastname=By.xpath("//input[@placeholder='Enter Your Last Name']");
	private By flag=By.xpath("//div[@class='iti__flag iti__us']");
//	private By searchcountry=By.xpath("//div[@class='search-container']");
	private By US=By.xpath("//div/following-sibling::span[text()='United States']");
	private By phone=By.xpath("//input[@id='phone']");
	private By email=By.xpath("//input[@placeholder='Enter Your Email']");
	private By savecontact = By.xpath("//button[contains(text(),'Save')]");
	private By home = By.xpath("//a[text()='Home']");
	private By Emergencyprep = By.xpath("//a[contains(text(),'Emergency Prep')]");

	private By Emergencynumbers = By.xpath("//p[contains(text(),'Worldwide Emergency Numbers')]");
	private By search = By.xpath("//input[@id='state']");
	
	
	
	public  emegencypreppage(WebDriver driver) {
		this.driver = driver;   
		 this.waitUtil = new WebDriverWaits(driver, Duration.ofSeconds(20));
		 this.scroll = new ScrollUtils(driver);
		 this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		 
	}

	public String getEmergencyprepTitle() {
		return driver.getTitle();
		
	}
	
	
	
	public void clickemergency() throws InterruptedException {
    Thread.sleep(5000);
    waitUtil.waitForElementToBeClickable(emergencyprep).click();
		
	}
	
	
	public void familyhealthcards() throws InterruptedException {

		Thread.sleep(2000);
		waitUtil.waitForElementToBeClickable(familyhealthcards).click();
	}
		
		
	public void adddetails() {
		waitUtil.waitForElementToBeClickable(adddetails).click();
	}
	
	public void height() {
		waitUtil.waitForElementToBeClickable(height).click();
	}
	
	public void cms() {
		waitUtil.waitForElementToBeClickable(cms).click();
	}
	
	public void heightin() {
		waitUtil.waitForElementToBeClickable(heightin).click();
		waitUtil.waitForElementToBeClickable(heightinunit).click();
	
	}
	
	public void weight() {
		waitUtil.waitForElementToBeClickable(weight).click();
	}
	
	public void kg() throws Throwable  {
       Thread.sleep(2000);
       waitUtil.waitForElementToBeClickable(kg).click();
		
		
	}
	
	public void weightin() {
		waitUtil.waitForElementToBeClickable(weightin).sendKeys("45");
	}
	public void bloodgroup() {
		waitUtil.waitForElementToBeClickable(bloodgroup).click();
	}
	public void group() {
		waitUtil.waitForElementToBeClickable(group).click();
	}
	public void medicalconditions() {
		waitUtil.waitForElementToBeClickable(medical).sendKeys("allgood");
	}
	public void allergies() {
		waitUtil.waitForElementToBeClickable(allergies).sendKeys("nollergies");;
	}
	public void medication() {
		waitUtil.waitForElementToBeClickable(medications).sendKeys("good");;
	}
		
	public void save() throws InterruptedException {
		Thread.sleep(1000);
		
		waitUtil.waitForElementToBeClickable(save).click();
	}
	
	
	public void editfamilyhealthcards() throws Throwable {
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		/*driver.findElement(view).click();
		driver.findElement(edit).click();
		driver.findElement(allergies).sendKeys("noallergirs");
		driver.findElement(save).click();*/
		
		}
	
	
	public void emergencyphonenumber() {
		waitUtil.waitForElementToBeClickable(home).click();
		waitUtil.waitForElementToBeClickable(emergencyprep).click();
		waitUtil.waitForElementToBeClickable(emergencyphonenumber).click();
	}
	
	public void addcontact() {
		
		waitUtil.waitForElementToBeClickable(addcontact).click();
	}
	
	public void firstname() {
		
		waitUtil.waitForElementToBeClickable(firstname).sendKeys("Ramya");
	}
	
	public void lastname() {
		
		waitUtil.waitForElementToBeClickable(lastname).sendKeys("reddy");
	}
	
	public void flag() {
		
		waitUtil.waitForElementToBeClickable(flag).click();
	}
	
	public void searchcountry() {
		
		//driver.findElement(searchcountry).sendKeys("United States");
	}
	
	public void US() {
		
		waitUtil.waitForElementToBeClickable(US).click();
	}
	
	public void phone() {
		
		waitUtil.waitForElementToBeClickable(phone).sendKeys("+12015551864");
	}
	
	public void email() {
		
		waitUtil.waitForElementToBeClickable(email).sendKeys("ramya@yopmail.com");
	}
	
	public void savecontact() {
		
		waitUtil.waitForElementToBeClickable(savecontact).click();
		
	}
	

	public void Emergencyprep() throws InterruptedException {
		Thread.sleep(1000);
		waitUtil.waitForElementToBeClickable(Emergencyprep).click();
		
	}
	
	public void Worldwidenumber() throws InterruptedException {
		Thread.sleep(2000);
		WebElement worldwidenumber=wait.until(ExpectedConditions.elementToBeClickable(Emergencynumbers));
		 scroll.scrollIntoView(worldwidenumber);
		 Thread.sleep(2000);
		worldwidenumber.click();
		                          
	}
	
	public void search() {
		
		waitUtil.waitForElementToBeClickable(search).sendKeys("India");
		
	}
	
	
}
