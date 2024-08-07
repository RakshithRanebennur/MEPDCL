package TestScripts;

import Base.TestBase;
import org.testng.annotations.Test;

public class SmartMeterOnBoard extends TestBase
{

    @Test
    public void smartMeter() throws InterruptedException
    {

        loginPage.enterUsernameTextField("superadmin");

        loginPage.enterPasswordTextField("A");

        loginPage.clickOnLoginButton();

        Thread.sleep(500);

        smartMeterOnBoardPage.clickOnSwitchRole();

        Thread.sleep(1000);

        smartMeterOnBoardPage.clickOnRoleDropDown();

        smartMeterOnBoardPage.selectRoleDropDown("MANAGER(SUB DIV)");

        Thread.sleep(500);

        smartMeterOnBoardPage.clickOnLocationDropDown();

        smartMeterOnBoardPage.selectLocationDropDown("CENTRAL SUBDIVISION");

        smartMeterOnBoardPage.clickOnProceedButton();

        Thread.sleep(250);

        utility.scrollHorizantally();

        Thread.sleep(150);

        smartMeterOnBoardPage.clickOnSmartBillingTab();

        Thread.sleep(250);

        smartMeterOnBoardPage.clickOnSmartMeterOnboardTab();

        smartMeterOnBoardPage.clickOnNewButton();

        Thread.sleep(250);

        smartMeterOnBoardPage.clickOnPostPaidChecKBox();

        Thread.sleep(250);

        smartMeterOnBoardPage.clickOnChooseFileButton(SmartMeterOnboardFilepath);

        Thread.sleep(250);

        smartMeterOnBoardPage.clickOnLoadButton();

        Thread.sleep(1000);

        smartMeterOnBoardPage.clickOnOKButton();

    }
}
