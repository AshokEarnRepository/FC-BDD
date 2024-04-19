package com.Pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.Utils.ScrollUtils;

public class signuppage {
	
		private WebDriver driver;
		  private WebDriverWait wait;
		  ScrollUtils scroll;
		
		private By random = By.xpath("//h3[contains(text(),'Random Email generator')]");
		private By frame1=By.xpath("//*[@id=\"ad_iframe\"]");
		private By close=By.xpath("//div[@id='dismiss-button']");
		private By checkbox = By.xpath("//span[text()='Check Inbox']");
		
		private By landPageLogin = By.xpath("//a[text()='Log In']");
		private By FamilyLogin = By.xpath("//button[@class='primary_btn mb-3']");
		//private By Families = By.xpath("//a[text()='For Families']");
		private By signup =By.xpath("//a[text()='Sign up']");
		private By email = By.xpath("//input[@name='email']");
		private By continue1 = By.xpath("//div/button[@type='submit']");
		private By newpassword = By.xpath("//input[@id='password']");
		private By confirmpassword = By.xpath("//input[@id='confirmPassword']");
		private By continue2=By.xpath("//button[contains(text(),'Continue')]");
		private By flag=By.xpath("/html/body/app-root/div/app-questionnaires/div/div/div[2]/div/div[2]/div/form/container-element/quest-phone/div[1]/app-phone-input/form/ngx-intl-tel-input/div/div/div");
		private By searchcountry=By.xpath("//div//input[@placeholder='Search Country']");
		private By US=By.xpath("//div/following-sibling::span[text()='United States']");
		
		private By phone=By.xpath("//input[@id='phone']");
		private By checkbox1=By.xpath("//input[@id='termsCheckbox']");
		private By continue3=By.xpath("//div//button[text()=' Send Code ']");
		private By otpElement  = By.xpath("//tbody/tr[1]/td[3]");
		private By otpfield = By.xpath("(//input[@autocomplete='one-time-code'])[1]");
		private By continue4 = By.xpath("//button[contains(text(),'Continue')]");
		private By firstname = By.xpath("//input[@formcontrolname='firstName']");
		private By lastname = By.xpath("//input[@formcontrolname='lastName']");
		private By month = By.xpath("//select[@name='Month']");
		private By monthname = By.xpath("//option[text()=' January ']");
		private By day = By.xpath("//input[@name='day']");
		private By year = By.xpath("//input[@name='year']");
		private By zipcode = By.xpath("//input[@name='zipCode']");
		//private By otp =By.xpath("/html/body/main/section/div[1]/table/tbody/tr[1]/td[3]/text()[2]");
		private By continue5 = By.xpath("//button[contains(text(),'Continue')]");
	    private By skip =By.xpath("//a[text()='Skip']");



	    public signuppage(WebDriver driver) {
			this.driver = driver;  
			this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			this.scroll = new ScrollUtils(driver);
		}

		public String getphotosandvideosTitle() {
			return driver.getTitle();
			
		}
		

		   public void random1() throws InterruptedException {
			driver.get("https://yopmail.com/en/");
			driver.findElement(random).click();
		     driver.navigate().refresh();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			 if (driver.findElements(random).size() > 0) {
		            driver.findElement(random).click();
		        } else {
		            System.out.println("The 'random' element is not present.");
		        }

		        // Click on the 'checkbox' element if it exists
		        if (driver.findElements(checkbox).size() > 0) {
		            driver.findElement(checkbox).click();
		        } else {
		            System.out.println("The 'checkbox' element is not present.");
		        }

			
			List<WebElement> elements = driver.findElements(By.xpath("//*[contains(text(), '@yopmail.com')]"));
			String textToCopy = "";
			if (!elements.isEmpty()) {
				textToCopy = elements.get(0).getText().trim();
			}
			// Assuming 'driver' is your WebDriver instance

			if (driver instanceof JavascriptExecutor) {
			    JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			    
			    String script = "window.open()";
			    jsExecutor.executeScript(script);
			} else {
			    System.out.println("JavaScript execution is not supported in this browser.");
			}

			String newTab = driver.getWindowHandles().toArray()[1].toString();
			driver.close();
			driver.switchTo().window(newTab);
			driver.get("https://familycentral.com/");
			WebElement LandPageLogin=	wait.until(ExpectedConditions.elementToBeClickable(landPageLogin));
			LandPageLogin.click();
			WebElement familyLogin=	wait.until(ExpectedConditions.elementToBeClickable(FamilyLogin));
			familyLogin.click();
			WebElement Signup=	wait.until(ExpectedConditions.elementToBeClickable(signup));
			Signup.click();
			WebElement Email=	wait.until(ExpectedConditions.elementToBeClickable(email));
			Email.sendKeys(textToCopy);
			WebElement Continue1=	wait.until(ExpectedConditions.elementToBeClickable(continue1));
			Continue1.click();
			
		}
		   
		   public void signup() throws Throwable {
			   
			   WebElement Newpassword=	wait.until(ExpectedConditions.elementToBeClickable(newpassword));
			   Newpassword.sendKeys("Password@123");
				WebElement Confirmpassword=	wait.until(ExpectedConditions.elementToBeClickable(confirmpassword));
				Confirmpassword.sendKeys("Password@123");
				Thread.sleep(2000);
				WebElement Continue2=	wait.until(ExpectedConditions.elementToBeClickable(continue2));
				
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center', inline: 'center' });", Continue2);
				
				Thread.sleep(2000);
				Continue2.click();
				WebElement Flag=	wait.until(ExpectedConditions.elementToBeClickable(flag));
				Flag.click();
				WebElement Searchcountry=	wait.until(ExpectedConditions.elementToBeClickable(searchcountry));
				Searchcountry.sendKeys("United States");
				WebElement us=	wait.until(ExpectedConditions.elementToBeClickable(US));
				us.click();
				WebElement Phone=	wait.until(ExpectedConditions.elementToBeClickable(phone));
				Phone.sendKeys("+13155037380");
				WebElement Checkbox1=	wait.until(ExpectedConditions.elementToBeClickable(checkbox1));
				Checkbox1.click();
				WebElement Continue3=	wait.until(ExpectedConditions.elementToBeClickable(continue3));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center', inline: 'center' });", Continue3);
				Continue3.click();
			   
			
			((JavascriptExecutor) driver).executeScript("window.open('', '_blank');");
		    ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		    driver.switchTo().window(tabs.get(1));
		    Thread.sleep(7000);
		    driver.get("https://smstome.com/usa/phone/13155037380/sms/6443");

		    String otpText=driver.findElement(otpElement).getText();

		    
		     int startIndex = otpText.indexOf("is ") + "is ".length();
		     int endIndex = otpText.indexOf(". It will be valid");
		     String otpValue = otpText.substring(startIndex, endIndex);
		     driver.close();
		     driver.switchTo().window(tabs.get(0));
			    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			    WebElement Otpfield=	wait.until(ExpectedConditions.elementToBeClickable(otpfield));
			    Otpfield.sendKeys(otpValue);
				WebElement Continue4=	wait.until(ExpectedConditions.elementToBeClickable(continue4));
				Continue4.click();
				WebElement Firstname=	wait.until(ExpectedConditions.elementToBeClickable(firstname));
				Firstname.sendKeys("Ramya");
				WebElement Lastname=	wait.until(ExpectedConditions.elementToBeClickable(lastname));
				Lastname.sendKeys("reddy");
				WebElement Month=	wait.until(ExpectedConditions.elementToBeClickable(month));
				Month.click();
				WebElement Monthname=	wait.until(ExpectedConditions.elementToBeClickable(monthname));
				Monthname.click();
				WebElement Day=	wait.until(ExpectedConditions.elementToBeClickable(day));
				Day.sendKeys("3");
				WebElement Year=	wait.until(ExpectedConditions.elementToBeClickable(year));
				Year.sendKeys("2001");
				WebElement Zipcode=	wait.until(ExpectedConditions.elementToBeClickable(zipcode));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center', inline: 'center' });", Zipcode);
				Zipcode.sendKeys("5000");
				Thread.sleep(2000);
				Zipcode.sendKeys("8");
				   Thread.sleep(4000);
				WebElement Continue5=	wait.until(ExpectedConditions.elementToBeClickable(continue5));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center', inline: 'center' });", Continue5);
				Continue5.click();
	        
		
			
		}

			
		public void skip() {
			WebElement Skip=wait.until(ExpectedConditions.elementToBeClickable(skip));
			Skip.click();

		}
		
	}




