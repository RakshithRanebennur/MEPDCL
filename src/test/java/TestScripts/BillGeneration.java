package TestScripts;

import Base.TestBase;
import org.testng.annotations.Test;

public class BillGeneration extends TestBase{

    @Test
    public void billGenerationForm() throws InterruptedException {

        loginPage.enterUsernameTextField("8050626262");

        loginPage.enterPasswordTextField("Idea@123");

        loginPage.clickOnLoginButton();

        Thread.sleep(500);

        billGenerationPage.clickOnBillGenerationTab();

        billGenerationPage.clickOnConsumerIDTextField("1000837268");

        billGenerationPage.clickOnSearchTextField();

        Thread.sleep(500);

        utility.scrollHorizantally();

        Thread.sleep(500);

        billGenerationPage.clickOnMeterStatusDropDown();

        billGenerationPage.enterMeterStatusDropDown("OK (Normal)");

        Thread.sleep(1000);

        PreviousReading = billGenerationPage.getPreviousReading();

        logger.info(PreviousReading);

        billGenerationPage.enterCurrentReadingTextField(PreviousReading+100);

        Thread.sleep(500);

        billGenerationPage.clickOnOKButton();

        Thread.sleep(500);

        utility.scrollHorizantally();

        Thread.sleep(500);

        billGenerationPage.clickOnCalculateButton();

        Thread.sleep(500);

        utility.scrollHorizantally();

        Thread.sleep(500);

        utility.scrollHorizantally();

        Thread.sleep(500);

        billGenerationPage.enterCommentTextField("okay");

        billGenerationPage.clickOnChooseActionButton();

        Thread.sleep(250);

        billGenerationPage.clickOnSaveButton();

        Thread.sleep(500);

        utility.acceptAlertPopup();

        Thread.sleep(200);

        utility.acceptAlertPopup();

        Thread.sleep(300);

        billGenerationPage.clickOnCloseButton();

//        billGenerationPage.clickOnLogoutButton();
//
//        billGenerationPage.clickOnLogout();


    }
}
