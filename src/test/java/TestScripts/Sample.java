package TestScripts;

import Base.TestBase;
import org.testng.annotations.Test;

public class Sample extends TestBase {

    @Test
    public void demo(){
        loginPage.enterUsernameTextField("7676386048");

        loginPage.enterPasswordTextField("Idea@123");

        loginPage.clickOnLoginButton();
    }
}
