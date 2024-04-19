package com.Pages;

import java.time.Duration;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeoutException;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Calendar_Addmilestonepage {
	
	private WebDriver driver;
	  private WebDriverWait wait;
	// Calendar page locators
	private By CALENDAR_BUTTON = By.xpath("(//span[normalize-space()='Calendar'])[1]");
	
	private By ADD_MILESTONE=By.xpath("//button[contains(text(),'Add Milestone')]");
	private By EVENT=By.xpath("//label[contains(text(),'Birthday')]");
    private By NEXT=By.xpath("//button[contains(text(),'Next')]");
	private By NAME=By.xpath("//input[@id='enterName']");
	private By Select_date=By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/button[1]/img[1]");
	private By Select_day=By.xpath("//div[contains(text(),'29')]");
    private By REMINDER=By.xpath("//select[@id='reminder']");
	private By TIME=By.xpath("//option[contains(text(),'15 min before')]");
	private By DESCRIPTION=By.xpath("//input[@id='description']");
	private By save=By.xpath("//button[contains(text(),'Save')]");
	private By close=By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-activity-completion-popup[1]/div[1]/div[1]/button[1]");
	
	public Calendar_Addmilestonepage(WebDriver driver) {
		this.driver = driver;  
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	public String getphotosandvideosTitle() {
		return driver.getTitle();
		
	}
	
	
	
	public void clickcalendar() throws InterruptedException {
		Thread.sleep(3000);
		WebElement CALENDARBUTTON=	wait.until(ExpectedConditions.elementToBeClickable(CALENDAR_BUTTON));
		CALENDARBUTTON.click();
		
	}
	
	
	public void ADD_MILESTONE() {
		WebElement ADDMILESTONE=	wait.until(ExpectedConditions.elementToBeClickable(ADD_MILESTONE));
		ADDMILESTONE.click();
		
	}
	
	public void EVENT() {
		WebElement Event=	wait.until(ExpectedConditions.elementToBeClickable(EVENT));
		Event.click();
		
	}
	
	public void NEXT() {
		WebElement next=	wait.until(ExpectedConditions.elementToBeClickable(NEXT));
		next.click();
		
	}
	
	public void NAME() {
		WebElement name=	wait.until(ExpectedConditions.elementToBeClickable(NAME));
		name.sendKeys("Ramya");
		
	}
	
	public void Select_date() {
		
		System.out.println("Hii");
	}
	
	public void Select_day() {
		//WebElement select_day=	wait.until(ExpectedConditions.elementToBeClickable(Select_day));
		//select_day.click();
		
		WebElement select_date=	wait.until(ExpectedConditions.elementToBeClickable(Select_date));
		select_date.click();
        // XPath for finding all elements representing days in the calendar
        String dayXPath = "//div[@class='btn-light ng-star-inserted']";

        // Find all elements matching the XPath
        List<WebElement> allDays = driver.findElements(By.xpath(dayXPath));

        // Iterate through the elements to find an enabled day
        WebElement selectedDay = null;
        for (WebElement day : allDays) {
            if (day.isEnabled()) {
                selectedDay = day;
                break; // Stop iterating once an enabled day is found
            }
        }

        // Check if an enabled day is found
        if (selectedDay != null) {
            // Store the selected day text or any other information you need
            String selectedDayText = selectedDay.getText();

            // Perform any verification or action with the selected day
            System.out.println("Selected Day: " + selectedDayText);

            // Example: Click on the selected day (You can modify this based on your requirements)
            selectedDay.click();

            // Add additional verification steps as needed
            // For example, verify that the selected day is now highlighted or displayed differently

        } else {
            System.out.println("No enabled day found in the calendar.");
        }
    }
	
	public void REMINDER() {
		 // Select a reminder (example: 5 min before)
		WebElement reminderDropdown =wait.until(ExpectedConditions.elementToBeClickable(REMINDER));
		Select reminderDropdownOptions = new Select(reminderDropdown);

		// Get the list of available reminder options
		List<WebElement> reminderOptions = reminderDropdownOptions.getOptions();

		// Check if there are any reminder options available
		if (!reminderOptions.isEmpty()) {
		    // Generate a random index to select a reminder option
		    Random random = new Random();
		    int randomIndex = random.nextInt(reminderOptions.size());

		    // Select the reminder option at the random index
		    reminderDropdownOptions.selectByIndex(randomIndex);

		    // Optional: Perform actions after selecting the reminder option if needed

		    // Get the text of the selected reminder option
		    WebElement selectedReminderOption = reminderOptions.get(randomIndex);
		    String selectedReminder = selectedReminderOption.getText().trim();
		    System.out.println("Selected Reminder: " + selectedReminder);

		    // Optional: Print the selected reminder option for verification
		    System.out.println("Test Passed: Selected Reminder is " + selectedReminder + ".");
		} else {
		    System.out.println("No reminder options available in the dropdown.");
		}
	}
	
//	public void TIME() {
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.findElement(TIME).click();
//		
//	}
	
	  private String generateRandomText() {
	        // You can adjust the length and other parameters as needed
	        return RandomStringUtils.randomAlphanumeric(20); // Generating random alphanumeric text of length 20
	    }

	    public void enterDescription() throws TimeoutException {
	        // Enter a random description
			WebElement descriptionInput =wait.until(ExpectedConditions.elementToBeClickable(DESCRIPTION));
			String randomText = generateRandomText();
			descriptionInput.sendKeys(randomText);

			// Print the entered random text
			System.out.println("Entered Description: " + randomText);
	    }
	
	    public void save()

	    {
	    	WebElement Save=	wait.until(ExpectedConditions.elementToBeClickable(save));
	    	Save.click();
	    }

      public void close() throws InterruptedException {
    	  WebElement Close=	wait.until(ExpectedConditions.elementToBeClickable(close));
    	  Close.click();
}

}
