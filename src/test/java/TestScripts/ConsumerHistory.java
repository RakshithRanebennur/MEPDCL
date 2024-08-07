package TestScripts;

import Base.TestBase;
import org.testng.annotations.Test;

public class ConsumerHistory extends TestBase {

    @Test
    public void consumerHistory() throws InterruptedException {

        loginPage.enterUsernameTextField("8050626262");

        loginPage.enterPasswordTextField("Idea@123");

        loginPage.clickOnLoginButton();

        Thread.sleep(500);

        consumerHistoryPage.clickOnConsumerTab();

        consumerHistoryPage.clickOnConsumerHistoryTab();

        Thread.sleep(500);

        consumerHistoryPage.enterConsumerIDTextField("1000849490");

        consumerHistoryPage.clickOnSearchTextField();

        Thread.sleep(1000);

        consumerHistoryPage.clickOnBillingTab();

        Thread.sleep(5000);

        consumerHistoryPage.clickOnViewIcon();

        Thread.sleep(10000);

        consumerHistoryPage.clickOnPDFImage();

        Thread.sleep(5000);

        consumerHistoryPage.clickOnCloseButton();

//        consumerHistoryPage.clickOnLogoutButton();
//
//        consumerHistoryPage.clickOnLogout();
    }
}
