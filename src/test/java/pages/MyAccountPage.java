package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage extends BasePage{

    private By registerEmailInput = By.id("reg_email");
    private By registerPasswordInput = By.id("reg_password");
    private By registerButton = By.xpath("//*[@value='Register']");
    private By loginEmailInput = By.id("username");
    private By loginPasswordInput = By.id("password");
    private By logInButton = By.xpath("//*[@value='Log in']");
    private By logOutButton = By.xpath("//*[text()='Logout']");
    private By accountDashBoard = By.className("woocommerce-MyAccount-content");

    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    public MyAccountPage fillLogInData(String email, String password){
        sendKeys(loginEmailInput, email);
        sendKeys(loginPasswordInput, password);
        return this;
    }

    public MyAccountPage clickLoginButton(){
        click(logInButton);
        return this;
    }

    public MyAccountPage fillRegisterData(String email, String password){
        sendKeys(registerEmailInput, email);
        sendKeys(registerPasswordInput, password);
        return this;
    }

    public MyAccountPage clickRegisterButton(){
       click(registerButton);
        return this;
    }

    public MyAccountPage clickLogOutButton(){
        click(logOutButton);
        return this;
    }

    public String getAccountDashBoardText(){
        return getElement(accountDashBoard).getText();
    }
}
