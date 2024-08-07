package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BulkBillGenerationPage {

    public WebDriver driver;

    @FindBy(xpath = "//a[.='Bulk Bill Generation']")
    private WebElement BulkBillGenerationTab;

    @FindBy(css = "button#btnBulkBilling")
    private WebElement BulkBillingNewButton;

    @FindBy(css = "input#chkShowHide")
    private WebElement UploadPredefinedFileCheckBox;

    @FindBy(css = "input#bulkBillingExcelUpload")
    private WebElement ChooseFileButton;

    @FindBy(css = "input#btnUploadFile")
    private WebElement UploadFileButton;

    public BulkBillGenerationPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public BulkBillGenerationPage clickOnBulkBillGenerationTab(){
        BulkBillGenerationTab.click();
        return new BulkBillGenerationPage(driver);
    }

    public void clickOnBulkBillingNewButton(){
        BulkBillingNewButton.click();
    }

    public void clickOnUploadPredefinedFileCheckBox(){
        UploadPredefinedFileCheckBox.click();
    }

    public void clickOnChooseFileButton(String input){
        ChooseFileButton.sendKeys(input);
    }

    public void clickOnUploadFileButton(){
        UploadFileButton.click();
    }
}
