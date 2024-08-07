package TestScripts;

import Base.TestBase;
import org.testng.annotations.Test;

public class SmartMeterChange extends TestBase {

    @Test
    public void uploadingFileInExcelSheets() throws InterruptedException {

        loginPage.enterUsernameTextField("7676386048");

        loginPage.enterPasswordTextField("Idea@123");

        loginPage.clickOnLoginButton();

        Thread.sleep(500);

        smartMeterChangePage.clickOnSwitchRole();

        Thread.sleep(1000);

        smartMeterChangePage.clickOnRoleDropDown();

        smartMeterChangePage.selectRoleDropDown("MANAGER(SUB DIV)");

        Thread.sleep(500);

        smartMeterChangePage.clickOnLocationDropDown();

        smartMeterChangePage.selectLocationDropDown("CENTRAL SUBDIVISION");

        smartMeterChangePage.clickOnProceedButton();

        Thread.sleep(500);

        smartMeterChangePage.clickOnnCloseButton();

        Thread.sleep(250);

        utility.scrollHorizantally();

        Thread.sleep(150);

        smartMeterChangePage.clickOnSmartBillingTab();

        Thread.sleep(250);

        smartMeterChangePage.clickOnSmartMeterChangeTab();

        Thread.sleep(500);

        smartMeterChangePage.clickOnBillTypeDropDown();

        Thread.sleep(150);

        smartMeterChangePage.selectBillTypeDropDown("POSTPAID");

        Thread.sleep(250);

        smartMeterChangePage.clickOnChooseFileButton(SmartMeterChangeFilepath);

        Thread.sleep(500);

        smartMeterChangePage.clickOnSaveButton();

        Thread.sleep(500);

        smartMeterChangePage.clickOnOKButton();

    }
}
