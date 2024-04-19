package com.qa.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsUtility {

    private WebDriver driver;
    private Actions actions;

    public MouseActionsUtility(WebDriver driver) {
        this.driver = driver;
        this.actions = new Actions(driver);
    }

    public void hoverAndClick(WebElement elementToHover, WebElement elementToClick) {
        // Hover over the element
        actions.moveToElement(elementToHover).perform();
        
        // Click on the element after hovering
        actions.click(elementToClick).perform();
    }

    // Method to perform a double click on an element
    public void doubleClick(WebElement element) {
        actions.doubleClick(element).perform();
    }

    // Method to perform a right-click (context click) on an element
    public void rightClick(WebElement element) {
        actions.contextClick(element).perform();
    }

    // Method to drag and drop an element to another element
    public void dragAndDrop(WebElement source, WebElement target) {
        actions.dragAndDrop(source, target).perform();
    }

    // Method to move the mouse to the specified offset from the current mouse position
    public void moveByOffset(int xOffset, int yOffset) {
        actions.moveByOffset(xOffset, yOffset).perform();
    }
}
