package tests;

import org.testng.Assert;
import pages.HomePage;
import org.testng.annotations.Test;
import utils.User;

import java.io.IOException;

public class RegisterTest extends BaseTest {

    @Test
    public void registerAndLoginUser() throws IOException {
        User user = new User();

        String accountDashBoardText = new HomePage(driver)
                .goToMyAccountPage()
                .fillRegisterData(user.getFullEmail(), user.getPassword())
                .clickRegisterButton()
                .clickLogOutButton()
                .fillLogInData(user.getFullEmail(), user.getPassword())
                .clickLoginButton()
                .getAccountDashBoardText();

        Assert.assertTrue(accountDashBoardText.contains(user.getEmailName()));
    }
}
