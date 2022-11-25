package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

    protected WebDriver driver;

    protected BasePage(WebDriver driver) {
        this.driver = driver;
    }

    protected WebElement getElement(By elementBy) { return driver.findElement(elementBy);}

    protected WebElement click(By elementBy) {
        getElement(elementBy).click();
        return getElement(elementBy);
    }

    protected WebElement click(WebElement element) {
        element.click();
        return element;
    }

    protected void sendKeys(By elementBy, String value){
        getElement(elementBy).sendKeys(value);
    }
}
