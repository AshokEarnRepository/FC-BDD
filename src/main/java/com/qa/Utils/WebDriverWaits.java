package com.qa.Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebDriverWaits {

    private WebDriver driver;
    private WebDriverWait wait;

    public WebDriverWaits(WebDriver driver, Duration duration) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, duration);
    }

    public WebElement waitForVisibilityOfElement(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    
    public boolean isElementVisible(By locator) {
        try {
            WebElement element = waitForVisibilityOfElement(locator);
            return element != null && element.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public WebElement waitForElementToBeClickable(By locator) {
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public WebElement waitForPresenceOfElement(By locator) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public boolean waitForInvisibilityOfElement(By locator) {
        return wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

//    public WebElement waitForElementToBeSelected(By locator) {
//        return wait.until(ExpectedConditions.elementToBeSelected(locator));
//    }

    public boolean waitForInvisibilityOfElementWithText(By locator, String text) {
        return wait.until(ExpectedConditions.invisibilityOfElementWithText(locator, text));
    }

    public void waitForAlert() {
        wait.until(ExpectedConditions.alertIsPresent());
    }

//    public WebElement waitForFrameToBeAvailableAndSwitchToIt(By frameLocator) {
//        return wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator));
//    }

    // You can add more methods based on your needs
}

