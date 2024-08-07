package TestScripts;

import Base.TestBase;
import org.testng.annotations.Test;

public class ChangeRequest extends TestBase {

    @Test
    public void changeRequestForm() throws InterruptedException {

        loginPage.enterUsernameTextField("8050626262");

        loginPage.enterPasswordTextField("Idea@123");

        loginPage.clickOnLoginButton();

        Thread.sleep(1000);

        changeRequestPage.clickOnNewConnectionManagementTab();

        Thread.sleep(500);

        changeRequestPage.clickOnChangeRequestTab();

        Thread.sleep(500);

        changeRequestPage.clickOnNewButton();

        Thread.sleep(500);

        changeRequestPage.enterConsumerIDTextField("1000812885");

        changeRequestPage.clickOnSearchButton();

        Thread.sleep(2000);

        changeRequestPage.clickOnConsumerRequestTypeDropDown();

        changeRequestPage.selectConsumerRequestTypeDropDown("LOAD CHANGE");

        Thread.sleep(1000);

        utility.scrollHorizantally();

        Thread.sleep(500);

        changeRequestPage.clickOnNewContractLoadUnitDropDown();

        Thread.sleep(500);

        changeRequestPage.selectNewContractLoadUnitDropDown("KVA");

        changeRequestPage.enterContractDemandTextField("60");

        Thread.sleep(500);

        utility.scrollHorizantally();

        Thread.sleep(500);

        changeRequestPage.clickOnReRatingChargeTextField("100");

        Thread.sleep(500);

        utility.scrollHorizantally();

        Thread.sleep(500);

        utility.scrollHorizantally();

        Thread.sleep(250);

        changeRequestPage.clickOnDocumentListDropDown();

        Thread.sleep(250);

        changeRequestPage.selectDocumentListDropDown("ATTACHMENT 1");

        Thread.sleep(250);

        changeRequestPage.clickOnChooseFile(path);

        Thread.sleep(150);

        changeRequestPage.clickOnAddButton();

        Thread.sleep(250);

        changeRequestPage.clickOnOKButton();

        changeRequestPage.clickOnChooseActionButton();

        Thread.sleep(250);

        changeRequestPage.clickOnSaveButton();

        changeRequestPage.clickOnOKButton();

//        changeRequestPage.clickOnLogoutButton();
//
//        changeRequestPage.clickOnLogout();

    }
}
