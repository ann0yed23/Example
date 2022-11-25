package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private By myAccountButton = By.xpath("//*[text()='My account']");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public MyAccountPage goToMyAccountPage(){
        click(myAccountButton);
        return new MyAccountPage(driver);
    }

}
