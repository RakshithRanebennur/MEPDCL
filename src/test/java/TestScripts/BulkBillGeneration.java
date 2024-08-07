package TestScripts;

import Base.TestBase;
import org.testng.annotations.Test;

public class BulkBillGeneration extends TestBase{

    @Test
    public void BulkBillGenerationForm() throws InterruptedException {

        loginPage.enterUsernameTextField("8050626262");

        loginPage.enterPasswordTextField("Idea@123");

        loginPage.clickOnLoginButton();

        Thread.sleep(500);

        bulkBillGenerationPage.clickOnBulkBillGenerationTab();

        bulkBillGenerationPage.clickOnBulkBillingNewButton();

        bulkBillGenerationPage.clickOnUploadPredefinedFileCheckBox();

        bulkBillGenerationPage.clickOnChooseFileButton(BulkBillGenerationFilepath);

        bulkBillGenerationPage.clickOnUploadFileButton();
    }
}
