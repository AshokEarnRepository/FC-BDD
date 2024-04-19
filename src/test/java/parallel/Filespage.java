package parallel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Filespage {
	private WebDriver driver;
	  private WebDriverWait wait;
	  
   private By  files=By.xpath("//span[contains(text(),'Family Access Files')]");
   private By contact=By.xpath("//p[contains(text(),'Important Contacts')]");
   private By add=By.xpath(" //span[contains(text(),'Add Contact')]");
   private By  fstname=By.xpath("//input[@placeholder='Enter Your First Name']");private By lstname=By.xpath("//input[@placeholder='Enter Your Last Name']");
   private By  phone=By.xpath("//input[@id='phone']");
   private By save=By.xpath("//button[contains(text(),'Save')]");
   
   
   
   private By clickonfiles=By.xpath("//a[contains(text(),'Files')]");
   private By medical=By.xpath("//p[contains(text(),'Medical')]");
   private By subscriber=By.xpath("//body/app-root[1]/div[1]/app-user[1]/div[1]/div[2]/div[3]/app-files[1]/div[2]/div[1]/app-select-user[1]/div[1]/div[1]/a[1]/div[1]/p[1]");
   private By vaccinecards=By.xpath("//p[contains(text(),'Vaccine Cards')]");
   
   private By Healthinsurance=By.xpath("//p[contains(text(),'Health Insurance')]");
   private By Immunization=By.xpath("//p[contains(text(),'Immunizations')]");
   
   
   
 
        
   public  Filespage(WebDriver driver) {
		this.driver = driver;
		 this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	public String getFilesTitle() {
		return driver.getTitle();
		
	}
	
	
	
	public void clickonfiles() throws InterruptedException {
		Thread.sleep(3000);
		WebElement Files=wait.until(ExpectedConditions.elementToBeClickable(files));
		Files.click();
		
	}

	public void clickoncontact() {
		WebElement Contact=wait.until(ExpectedConditions.elementToBeClickable(contact));
		Contact.click();
		
	}
	public void add() {
		WebElement Add=wait.until(ExpectedConditions.elementToBeClickable(add));
		Add.click();
		
	}
	public void firstname() {
		WebElement Fstname=wait.until(ExpectedConditions.elementToBeClickable(fstname));
		Fstname.sendKeys("family");
		
	}
	public void lastname() {
		WebElement Lstname=wait.until(ExpectedConditions.elementToBeClickable(lstname));
		Lstname.sendKeys("family");
		
	}

	public void phonenumber() {
		WebElement Phone=wait.until(ExpectedConditions.elementToBeClickable(phone));
		Phone.sendKeys("2015554878");
		
	}

	public void save() {
		WebElement Save=wait.until(ExpectedConditions.elementToBeClickable(save));
		Save.click();
		
	}
	
	
	
	
	
	
	public void files() throws InterruptedException {
		Thread.sleep(5000);
		WebElement Clickonfiles=wait.until(ExpectedConditions.elementToBeClickable(clickonfiles));
		Clickonfiles.click();
		
		
	}

	public void medical() {
		WebElement Medical=wait.until(ExpectedConditions.elementToBeClickable(medical));
		Medical.click();
		
	}

	public void subscriber() {
		WebElement Subscriber=wait.until(ExpectedConditions.elementToBeClickable(subscriber));
		Subscriber.click();
		
	}

	public void vaccinecards() {
		WebElement Vaccinecards=wait.until(ExpectedConditions.elementToBeClickable(vaccinecards));
		Vaccinecards.click();
		
	}

	public void Healthinsurance() {
		WebElement healthinsurance=wait.until(ExpectedConditions.elementToBeClickable(Healthinsurance));
		healthinsurance.click();
		
	}

	public void Immunization() {
		WebElement immunization=wait.until(ExpectedConditions.elementToBeClickable(Immunization));
		immunization.click();
		
	}

	



}
