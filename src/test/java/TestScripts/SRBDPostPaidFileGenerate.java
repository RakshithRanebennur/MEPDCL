package TestScripts;

import Base.TestBase;
import org.testng.annotations.Test;

public class SRBDPostPaidFileGenerate extends TestBase{

    @Test
    public void SRBDFile() throws InterruptedException {

        loginPage.enterUsernameTextField("superadmin");

        loginPage.enterPasswordTextField("A");

        loginPage.clickOnLoginButton();

        Thread.sleep(500);

        srbdPostpaidFileGeneratePage.clickOnSwitchRole();

        Thread.sleep(1000);

        srbdPostpaidFileGeneratePage.clickOnRoleDropDown();

        srbdPostpaidFileGeneratePage.selectRoleDropDown("MANAGER(SUB DIV)");

        Thread.sleep(500);

        srbdPostpaidFileGeneratePage.clickOnLocationDropDown();

        srbdPostpaidFileGeneratePage.selectLocationDropDown("CENTRAL SUBDIVISION");

        srbdPostpaidFileGeneratePage.clickOnProceedButton();

//        Thread.sleep(1000);
//
//        srbdPostpaidFileGeneratePage.clickOnnCloseButton();

        Thread.sleep(250);

        utility.scrollHorizantally();

        Thread.sleep(150);

        srbdPostpaidFileGeneratePage.clickOnSupportActivityTab();

        Thread.sleep(250);

        srbdPostpaidFileGeneratePage.clickOnSRBDFileGenerateTab();

        Thread.sleep(250);

        srbdPostpaidFileGeneratePage.clickOnUserNameTextField();

        Thread.sleep(250);

        srbdPostpaidFileGeneratePage.enterUserNameTextField("7333333333~TEST");

        Thread.sleep(250);

        srbdPostpaidFileGeneratePage.clickOnLoadButton();

        Thread.sleep(250);

        srbdPostpaidFileGeneratePage.enterCommentTextField("okay");

        Thread.sleep(250);

        srbdPostpaidFileGeneratePage.clickOnGenerateButton();

        Thread.sleep(1000);

        srbdPostpaidFileGeneratePage.clickOnOKButton();

//        srbdPostpaidFileGeneratePage.clickOnLogoutButton();
//
//        srbdPostpaidFileGeneratePage.clickOnLogout();

    }
}
