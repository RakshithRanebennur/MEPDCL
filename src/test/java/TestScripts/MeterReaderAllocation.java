package TestScripts;

import Base.TestBase;
import org.testng.annotations.Test;

public class MeterReaderAllocation extends TestBase {

    @Test
    public void meterReaderForm() throws InterruptedException {

        loginPage.enterUsernameTextField("8050626262");

        loginPage.enterPasswordTextField("Idea@123");

        loginPage.clickOnLoginButton();

        Thread.sleep(1000);

        meterReaderAllocationPage.clickOnMasterMappingTab();

        Thread.sleep(250);

        meterReaderAllocationPage.clickOnMeterReaderReAllocationTab();

        meterReaderAllocationPage.clickOnNewMeterReaderReAlloctionButton();

        Thread.sleep(250);

        meterReaderAllocationPage.clickOnVillageDropDown();

        meterReaderAllocationPage.enterVillageDropDown("CTV Mawprem DSD");

        Thread.sleep(250);

        meterReaderAllocationPage.clickOnOldMRCodeDropDown();

        meterReaderAllocationPage.enterOldMRCodeDropDown("1212002-Pearson Nongrum (100270)");

        Thread.sleep(250);

        meterReaderAllocationPage.clickOnLoadButton();

        Thread.sleep(250);

        meterReaderAllocationPage.clickOnCheckBox();

        Thread.sleep(1000);

        meterReaderAllocationPage.clickNewMRCodeDropDown();

        Thread.sleep(250);

        utility.scrollHorizantally();

        Thread.sleep(1000);

        meterReaderAllocationPage.enterNewMRCodeDropDown("1212003-Pynraplang Mylliemumlong (100859)");

        meterReaderAllocationPage.clickOnSaveButton();

        Thread.sleep(250);

        meterReaderAllocationPage.clickOnOKButton();
    }
}
