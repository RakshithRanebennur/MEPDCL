package TestScripts;

import Base.TestBase;
import org.testng.annotations.Test;

public class FileGenerate extends TestBase {

    @Test
    public void FileGenerateForm() throws InterruptedException {

        loginPage.enterUsernameTextField("superadmin");

        loginPage.enterPasswordTextField("A");

        loginPage.clickOnLoginButton();

        Thread.sleep(500);

        fileGeneratePage.clickOnSwitchRole();

        Thread.sleep(1000);

        fileGeneratePage.clickOnRoleDropDown();

        fileGeneratePage.enterRoleDropDown("MANAGER(SUB DIV)");

        Thread.sleep(500);

        fileGeneratePage.clickOnLocationDropDown();

        fileGeneratePage.enterLocationDropDown("CENTRAL SUBDIVISION");

        fileGeneratePage.clickOnProceedButton();
//
//        Thread.sleep(1000);
//
//        fileGeneratePage.clickOnnCloseButton();

        Thread.sleep(250);

        utility.scrollHorizantally();

        Thread.sleep(150);

        fileGeneratePage.clickOnSupportActivityTab();

        Thread.sleep(150);

        fileGeneratePage.clickOnFileGenerateTab();

        Thread.sleep(250);

        fileGeneratePage.clickOnSubDivisionDropDown();

        fileGeneratePage.enterSubDivisionDropDown("CENTRAL SUBDIVISION");

        Thread.sleep(500);

        fileGeneratePage.clickOnUserNameDropDown();

        fileGeneratePage.enterUserNameDropDown("7333333333~TEST");

        Thread.sleep(250);

        fileGeneratePage.clickOnLoadButton();

        Thread.sleep(500);

        fileGeneratePage.enterCommentTextField("okay");

        fileGeneratePage.clickOnGenerateButton();

        Thread.sleep(45000);

        fileGeneratePage.clickOnOKButton();

//        Thread.sleep(250);
//
//        fileGeneratePage.clickOnLoadButton();
//
//        fileGeneratePage.clickOnLogout();
    }
}
