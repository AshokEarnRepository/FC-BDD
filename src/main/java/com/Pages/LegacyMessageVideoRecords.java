package com.Pages;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.javafaker.Faker;

public class LegacyMessageVideoRecords {
	
	
	
	

		private WebDriver driver;
	    private	WebDriverWait wait;

		 
			private final Faker faker = new Faker();
			private String lastGeneratedRandomTitle; // Variable to store the last generated random title
//			String randomTitle;
//			String randomDate;
		 
			    // Locators
			private By otpElement  = By.xpath("//tbody/tr[1]/td[3]");
			private By otpfield = By.xpath("(//input[@autocomplete='one-time-code'])[1]");
			    private By legacyMessagesButton = By.xpath("//span[normalize-space()='Legacy Messages']");
			   // private By otpInputs = By.xpath("(//input[contains(@id,'otp_')])[1]");
			    private By create=By.xpath("//input[@id='myFile']");
			    private By createFirstMessageButton = By.xpath("//button[contains(text(),'Create your first message')]");
			    private By NewMessageBtn = By.xpath("//button[contains(text(),'New Message')]");
			    private By recordOneHereButton = By.xpath("//button[text()='record one here.']");
			    private By recordVideoMessageButton = By.xpath("//p[normalize-space()='Record video message']");
			    private By recordNowButton = By.xpath("//button[normalize-space()='Record now']");
			    private By startRecordingButton = By.xpath("//button[normalize-space()='Start Recording']");
			    private By stopRecordingButton = By.xpath("//button[normalize-space()='Stop Recording']");
			    private By nextButton = By.xpath("//button[normalize-space()='Next']");
			    
			     
//			    private By messageTitleInput = By.xpath("//input[@id='msg_title']");
//			    private By NextBtn_MessageTitle = By.xpath("//button[@class='primary_btn']");
			    private By myFamilyButton = By.xpath("//p[normalize-space()='My Family']");
			    private By SelectAllButton = By.xpath("//input[@id='select_all']");
			    private By NextBtn_afterSelectAll = By.xpath("//button[contains(text(),'Next')]");
			    private By specificdate=By.xpath("//label[contains(text(),'Specific date')]");
			    private By specificyear= By.xpath("//select[@id='specific-year']");   
			    private By specificYearDropdown = By.xpath("//option[contains(text(),'2024')]");
			    private By specificMonth = By.xpath("//select[@id='specific-month']");
			    private By specificMonthDropdown = By.xpath("//option[contains(text(),'April')]");
			    private By specificDay= By.xpath("//select[@id='specific-days']");
			    private By specificDayDropdown = By.xpath("//select[@id='specific-days']//option[2]");
		//	    private By nextButtonAfterSpecificDate = By.xpath("//button[normalize-space()='Next']");
			    private By userUpdatedToast = By.xpath("//div[contains(text(),'Updated successfully')]");
			    private By UploadedVideoTableData = By.xpath("//tbody/tr/td");
			    private By uponpassing=By.xpath("//label[contains(text(),'Upon passing')]");
			    private By next=By.xpath("//button[text()=' Next ']");
			    private By closeButton = By.xpath("//button[normalize-space()='Close']");
		 
			    
			    private By clickon3dots=By.xpath("//button[@id='docDropDown']");
			    private By title=By.xpath("//input[@id='title']");
			    private By specificyear1= By.xpath("//select[@id='specific-year']");   
			    private By specificYearDropdown1= By.xpath("//select[@id='specific-year']//option[11]");
			    private By specificMonth1 = By.xpath("//select[@id='specific-month']");
			    private By specificMonthDropdown1 = By.xpath("//option[contains(text(),'April')]");
			    private By specificDay1= By.xpath("//select[@id='specific-days']");
			    private By specificDayDropdown1 = By.xpath("//option[contains(text(),'15')]");
			    private By specificDayDropdown2 = By.xpath("//option[contains(text(),'5')]");
			    private By Add=By.xpath("//button[contains(text(),'+  Add')]");
			    private By otherindividuals=By.xpath("//p[contains(text(),'Other individuals')]");
			    private By firstname=By.xpath("//div//input[@placeholder='First name']");
			    private By lastname=By.xpath("//div//input[@placeholder='Last name']");
			    private By emailAdd=By.xpath("//div//input[@placeholder='Email-id']");
			    private By phone=By.xpath("//input[@id='phone']");
			    private By nextbutton=By.xpath("//button[contains(text(),'Next')]");
			    private By savechanges=By.xpath("//button[contains(text(),'Save Changes')]");
			    private By delete=By.xpath("//button[contains(text(),'Delete')]");
			    private By confirm=By.xpath("//button[contains(text(),'Confirm')]");
			    
			    
			    private By YOPMAIL_LOGIN_FIELD = By.xpath("//input[@id='login']");
				private By YOPMAIL_ARROW_ICON = By.xpath("//i[@class='material-icons-outlined f36']");
		
			    private By sharedlink=By.xpath("//a[contains(text(), 'https://familycentral.com')]");
			    
			    private By otp=By.xpath("//*[@id=\"mail\"]/div/center/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[8]/td");
			    private By entercode=By.xpath("  //input[@class='otp-input ng-pristine ng-valid ng-touched']");
			    
			    private By submit=By.xpath("//button[contains(text(),'Submit')]");
			    private By refresh=By.xpath("//button[@id='refresh']");
			
			public LegacyMessageVideoRecords(WebDriver driver) {
					this.driver = driver;
					 this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				}
				public String getLegacyMessageTitle() {
					return driver.getTitle();
				}
			    // Methods to interact with elements
			    public void clickLegacyMessages() {
			    	WebElement LegacyMessagesButton=wait.until(ExpectedConditions.elementToBeClickable(legacyMessagesButton));
			    	LegacyMessagesButton.click();
					
			    }
			  //Otp extract from here

			 // Method to extract OTP
			    public String extractOtpFromSmstome() throws InterruptedException {
			        // Open a new tab
			    	((JavascriptExecutor) driver).executeScript("window.open('', '_blank');");
				    ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
				    Thread.sleep(8000);
				    driver.switchTo().window(tabs.get(1));
	                       
				  
				    driver.get("https://smstome.com/usa/phone/12232109739/sms/6418");

				   
				    
				  
				    String otpText=wait.until(ExpectedConditions.elementToBeClickable(otpElement)).getText();

				    
				     int startIndex = otpText.indexOf("is ") + "is ".length();
				     int endIndex = otpText.indexOf(". It will be valid");
				     String otpValue = otpText.substring(startIndex, endIndex);

		             driver.close();
				    driver.switchTo().window(tabs.get(0));
				  
				    wait.until(ExpectedConditions.elementToBeClickable(otpfield)).sendKeys(otpValue);
		         
		 
		 
			        return otpValue;
			    }
		 
		//Otp extract end
		 
		 
			    public void clickCreateFirstMessage(String filePath) throws InterruptedException {
			        // Wait for the element to be clickable
			    	WebElement CreateFirstMessageButton=wait.until(ExpectedConditions.elementToBeClickable(createFirstMessageButton));
			    	CreateFirstMessageButton.click();
			   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				WebElement fileInput = driver.findElement(create);
				
			        String script = "arguments[0].setAttribute('style', 'display: block; visibility: visible;');";
			        ((JavascriptExecutor) driver).executeScript(script, fileInput);
			
					fileInput.sendKeys(filePath);
			        Thread.sleep(1000);
				 
			    }
//			    public void clickRecordOneHere() {
//			    	WebElement recordOneHere=  wait.until(ExpectedConditions.elementToBeClickable(recordOneHereButton));
//			    	recordOneHere.click();
//			    }
//		 
//			    public void clickRecordVideoMessage() {
//			    	WebElement recordVideoMessageBtn = wait.until(ExpectedConditions.elementToBeClickable(recordVideoMessageButton));
//			    	recordVideoMessageBtn.click();
//			    }
//		 
//			    public void clickRecordNow() {
//			    	WebElement recordNowBtn = wait.until(ExpectedConditions.elementToBeClickable(recordNowButton));
//			    	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center', inline: 'center' });", recordNowBtn);
//			    	recordNowBtn.click();
//			    }
//		 
//				    public void clickStartRecording() throws InterruptedException {
//				        WebElement startRecordingBtn = wait.until(ExpectedConditions.elementToBeClickable(startRecordingButton));
//				        startRecordingBtn.click();
//				        Thread.sleep(15000);
//				    }
//		 
//				    public void clickStopRecording() {
//				    	WebElement stopRecordingBtn = wait.until(ExpectedConditions.elementToBeClickable(stopRecordingButton));
//				    	stopRecordingBtn.click();
//				    }
//		 
				    public void clickNext() throws InterruptedException {
				    	WebElement NextButton=wait.until(ExpectedConditions.elementToBeClickable(nextButton));
				    	NextButton.click();
						
				    
//				    	next.click();
				    }




				    public void clickMyFamily() {
				    	WebElement MyFamilyButton=wait.until(ExpectedConditions.elementToBeClickable(myFamilyButton));
				    	MyFamilyButton.click();
						
				 
				    }
		 
				    public void SelectAll_CheckBox() {
				    	WebElement selectAllButton=wait.until(ExpectedConditions.elementToBeClickable(SelectAllButton));
				    	selectAllButton.click();
						
				        
				    }
				    public void clickNextAfterSelectAll() {
				    	WebElement nextBtn_afterSelectAll=wait.until(ExpectedConditions.elementToBeClickable(NextBtn_afterSelectAll));
				    	nextBtn_afterSelectAll.click();
						
				      
				      
				    }
				    public void Specificdate() throws InterruptedException {
				    	Thread.sleep(2000);
				    	WebElement Specificdate=wait.until(ExpectedConditions.elementToBeClickable(specificdate));
				    	Specificdate.click();
				    	WebElement Specificyear=wait.until(ExpectedConditions.elementToBeClickable(specificyear));
				    	Specificyear.click();
				    	WebElement SpecificYearDropdown=wait.until(ExpectedConditions.elementToBeClickable(specificYearDropdown));
				    	SpecificYearDropdown.click();
				    	WebElement SpecificMonth=wait.until(ExpectedConditions.elementToBeClickable(specificMonth));
				    	SpecificMonth.click();
				    	WebElement SpecificMonthDropdown=wait.until(ExpectedConditions.elementToBeClickable(specificMonthDropdown));
				    	SpecificMonthDropdown.click();
				    	WebElement SpecificDay=wait.until(ExpectedConditions.elementToBeClickable(specificDay));
				    	SpecificDay.click();
//				    	 String Xpath = "//option[@class='ng-star-inserted']";
//				         LegacyMessageVideoRecord record = new LegacyMessageVideoRecord(driver);
//				         int presentDay = record.getPresentDay();
//				         List<WebElement> allDay = driver.findElements(By.xpath(Xpath));
//				         for (WebElement yearElement : allDay) {
//				             String yearText = yearElement.getText().trim();
//				             if (yearText.equals(String.valueOf(presentDay))) {
//				                 yearElement.click();
//				                
//				             
//					         System.out.println("Present Day: " + presentDay);
//				         
//				             } 
//				     
				         
				    	WebElement SpecificDayDropdown=wait.until(ExpectedConditions.elementToBeClickable(specificDayDropdown));
				    	SpecificDayDropdown.click();
						
				     	WebElement Next=wait.until(ExpectedConditions.elementToBeClickable(next));
				    	Next.click();
				         }
//						
//				    
	//private int getPresentDay() {
//		 LocalDate currentDate = LocalDate.now();
//	     // Get the day of the month
//	     int presentDay = currentDate.getDayOfMonth();
//	     // Return the present day
//	     return presentDay;
//					}
//				    public void next() {
//				    	WebElement Next=wait.until(ExpectedConditions.elementToBeClickable(next));
//				    	Next.click();
//						
//				    
//				    }
//				    public void clickSpecificDateLabel() {
//				        // Wait for the element to be clickable
////				       driver.findElement(specificDateLabel). click();
//		 
//				        // Scroll the element into view
	//
//		 
//				        // Click the element after it's in view
//				        driver.findElement(specificDateLabel). click();
//				    }
//		 
//		 
//				    
	//
	//
	//
	//
//		 
//		//Random date selection code
//				        // Method to select a random year from the dropdown
//				        public void selectRandomYear() {
//				          driver.findElement(specificYearDropdown).click();
////				            Select yearSelect = new Select(yearDropdown);
//		 
//				            // Generate a random year between 2020 and 2030 (adjust the range as needed)
////				            String randomYear = Integer.toString(faker.number().numberBetween(2024, 2030));
////		 
////				            yearSelect.selectByValue(randomYear);
////				            System.out.println(randomYear);
//				        }
	//
//		 
//		              // Method to select a random month from the dropdown
//				        public void selectRandomMonth() throws InterruptedException {
//				        driver.findElement(specificMonthDropdown).click();
////				            Select monthSelect = new Select(monthDropdown);
//		 
//				            // Get all available options from the dropdown
////				            List<WebElement> monthOptions = monthSelect.getOptions();
////				            System.out.println("Print months :"+monthOptions);
////		 
////				            // Generate a random index to select a month
////				            int randomIndex = faker.number().numberBetween(0, monthOptions.size());
////		 
////				            // Select the month at the random index
////				            monthSelect.selectByIndex(randomIndex);
////		 
////				            // Get the selected month text for logging
////				            String selectedMonth = monthOptions.get(randomIndex).getText();
////				            System.out.println(selectedMonth);
//				            Thread.sleep(2000);
//				        }
	//
	//
	//
//				        public void selectDayFromDropdown() throws InterruptedException {
//				            try {
//				                // Wait for the day dropdown to be visible
//				                WebElement dayDropdown = wait.until(ExpectedConditions.elementToBeClickable(specificDayDropdown));
//				                Thread.sleep(5000);
//		 
//				                // Use sendKeys to select the third option in the day dropdown
////				                dayDropdown.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER);
////				                dayDropdown
//		 
//				                // Get the selected day value for printing
//				                String selectedDay = dayDropdown.getAttribute("value");
//		 
//				                System.out.println("Selected day: " + selectedDay);
//				            } catch (Exception e) {
//				                e.printStackTrace(); // Handle any exceptions that may occur
//				            }
//				        }
				    
				    
				    
				    
				    
				    
				    
				    public void dots() throws InterruptedException {
				    	Thread.sleep(3000);
				    	WebElement dots=wait.until(ExpectedConditions.elementToBeClickable(clickon3dots));
				    	dots.click();
						
				    
				    }
				    public void title() throws InterruptedException {
				    	WebElement Title=wait.until(ExpectedConditions.elementToBeClickable(title));
				    	Title.clear();
			              Thread.sleep(2000);	 
			           Title.sendKeys("video");
			
						
				    
				    }
				    public void deliverydate() {
				    	
				    	WebElement Specificyear1=wait.until(ExpectedConditions.elementToBeClickable(specificyear1));
				    	Specificyear1.click();
				    	WebElement SpecificYearDropdown1=wait.until(ExpectedConditions.elementToBeClickable(specificYearDropdown1));
				    	SpecificYearDropdown1.click();
				    	WebElement SpecificMonth1=wait.until(ExpectedConditions.elementToBeClickable(specificMonth1));
				    	SpecificMonth1.click();
				    	WebElement SpecificMonthDropdown1=wait.until(ExpectedConditions.elementToBeClickable(specificMonthDropdown1));
				    	SpecificMonthDropdown1.click();
				    	WebElement SpecificDay1=wait.until(ExpectedConditions.elementToBeClickable(specificDay));
				    	SpecificDay1.click();
				    	WebElement SpecificDayDropdown1=wait.until(ExpectedConditions.elementToBeClickable(specificDayDropdown2));
				    	SpecificDayDropdown1.click();
						
				    
				    }
				    public void add() {
				    	WebElement add=wait.until(ExpectedConditions.elementToBeClickable(Add));
				    	add.click();
						
				    
				    }
				    public void otherindividuals() {
				    	WebElement Otherindividuals=wait.until(ExpectedConditions.elementToBeClickable(otherindividuals));
				    	Otherindividuals.click();
						
				    
				    }
				    public void detailsofotherindividuals() {
				    	WebElement Firstname=wait.until(ExpectedConditions.elementToBeClickable(firstname));
				    	Firstname.sendKeys("ramya");
				    	WebElement Lastname=wait.until(ExpectedConditions.elementToBeClickable(lastname));
				    	Lastname.sendKeys("rachuri");
				    }
				    	public void enterInvitePersonEmail(String email) throws InterruptedException {
					    	driver.findElement(emailAdd).sendKeys(email);
					    
				    	WebElement Phone=wait.until(ExpectedConditions.elementToBeClickable(phone));
				    	Phone.sendKeys("2015551864");
				    	WebElement Next=wait.until(ExpectedConditions.elementToBeClickable(nextbutton));
				    	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center', inline: 'center' });", Next);
				    	Thread.sleep(2000);
				    	Next.click();
						
				    
				    }
				    
				    
				    
				    
				    
				    public void savechanges() throws InterruptedException {
				    	Thread.sleep(2000);
				    	WebElement Savechanges=wait.until(ExpectedConditions.elementToBeClickable(savechanges));
				    	Savechanges.click();
				    }
				    
				    public void delete() throws InterruptedException {
				    	Thread.sleep(3000);
				    	
				    	WebElement dots=wait.until(ExpectedConditions.elementToBeClickable(clickon3dots));
				    	dots.click();
				    	WebElement Delete=wait.until(ExpectedConditions.elementToBeClickable(delete));
				    	Delete.click();
				    	Thread.sleep(2000);
				    	WebElement Confirm=wait.until(ExpectedConditions.elementToBeClickable(confirm));
				    	Confirm.click();
				    }
				    
				    
				    
				    
				    
				    
				    
				    public void navigateToYopmail() {
				        // Implement steps to navigate to Yopmail...
				    	((JavascriptExecutor) driver).executeScript("window.open('', '_blank');");
						
					    ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
				    	   driver.switchTo().window(tabs.get(1));
				    	driver.get("https://yopmail.com");
				    }
			 
				    public void checkReceivedInviteEmail(String email) throws InterruptedException {
				    	Thread.sleep(5000);
				        // Implement steps to check for the received invite email...
				    	WebElement loginyopmail=wait.until(ExpectedConditions.elementToBeClickable(YOPMAIL_LOGIN_FIELD));
				    	loginyopmail.sendKeys(email);
				    }
				    public void enter() throws InterruptedException
				    {
				    	Thread.sleep(20000);
				    	WebElement arrow=wait.until(ExpectedConditions.elementToBeClickable(YOPMAIL_ARROW_ICON));
				    	arrow.click();
				    	Thread.sleep(3000);
				    	WebElement Refresh=wait.until(ExpectedConditions.elementToBeClickable(refresh));
				    	Refresh.click();
				    }
			 
				    
				    public void sharedlink() throws InterruptedException {
				    Thread.sleep(3000);
				    	   driver.switchTo().frame(2);
				    	   WebElement sharelink=wait.until(ExpectedConditions.elementToBeClickable(sharedlink));
				    	   sharelink.click();
				    	   Thread.sleep(4000);
//				    	
				    }
				    
				    
			
				    	
				    public void authenticationcode() throws Throwable {
				    	   ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
						   driver.switchTo().window(tabs.get(1));
						   Thread.sleep(5000);
						   driver.navigate().refresh();
						   driver.switchTo().frame(2);
						   String otpText=driver.findElement(otp).getText();
						   String OtpValue=otpText.concat(otpText);			 
						   driver.switchTo().window(tabs.get(2)); 
						   WebElement Entercode=wait.until(ExpectedConditions.elementToBeClickable(entercode));
						   Entercode.sendKeys(OtpValue);
						 
						 WebElement Submit=  wait.until(ExpectedConditions.elementToBeClickable(submit));
						 Submit.click();
					
						 Thread.sleep(10000); 
				}		    	
				    		
				    
				    
				    public void navigatetofamilycentral()
				    {
				    	 ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
						   driver.switchTo().window(tabs.get(0));
				    }
				    
				    
				    
				    
				    
				    
				    
				    
				    
				    
				    

				}
		 
		 





