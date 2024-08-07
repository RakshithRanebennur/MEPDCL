package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChangeRequestPage {

    public WebDriver driver;

    @FindBy(xpath = "//span[.='New Connection Management']")
    private WebElement NewConnectionManagementTab;

    @FindBy(xpath = "//a[.='Change Request']")
    private WebElement ChangeRequestTab;

    @FindBy(css = "input#btnNew")
    private WebElement NewButton;

    @FindBy(css = "input#txtConsumerId")
    private WebElement ConsumerIDTextField;

    @FindBy(css = "input#btnLoad")
    private WebElement SearchButton;

    @FindBy(xpath = "//div[@id='ddlConsumerRequestId_chosen']/a/span")
    private WebElement ConsumerRequestTypeDropDown;

    @FindBy(xpath = "//div[@id='ddlConsumerRequestId_chosen']//input")
    private WebElement ConsumerRequestType;

    @FindBy(xpath = "//div[@id='ddlLoadUnit_chosen']/a/span")
    private WebElement NewContractLoadUnitDropDown;

    @FindBy(xpath = "//div[@id='ddlLoadUnit_chosen']//input")
    private WebElement NewContractLoadUnit;

    @FindBy(css = "input#txtloadContrDemandKVA_New")
    private WebElement ContractDemandTextField;

    @FindBy(xpath = "(//input[@name='FieldAmount'])[21]")
    private WebElement ReRatingChargeTextField;

    @FindBy(xpath = "//div[@id='ddldocument_chosen']/a/span")
    private WebElement DocumentListDropDown;

    @FindBy(xpath = "//div[@id='ddldocument_chosen']//input")
    private WebElement DocumentList;

    @FindBy(css = "input#docimage")
    private WebElement ChooseFile;

    @FindBy(css = "input#btnuploadDoc")
    private WebElement AddButton;

    @FindBy(xpath = "//button[.='OK']")
    private WebElement OKButton;

    @FindBy(xpath = "//button[@class='btn btn-success dropdown-bs-toggle']")
    private WebElement ChooseActionButton;

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement SaveButton;

    @FindBy(css = "span.align-items-center>span>span")
    private WebElement LogoutButton;

    @FindBy(css = "[data-key*='logout']")
    private WebElement Logout;

    public ChangeRequestPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public ChangeRequestPage clickOnNewConnectionManagementTab(){
        NewConnectionManagementTab.click();
        return new ChangeRequestPage(driver);
    }

    public void clickOnChangeRequestTab(){
        ChangeRequestTab.click();
    }

    public void clickOnNewButton(){
        NewButton.click();
    }

    public void enterConsumerIDTextField(String input) throws InterruptedException {
        ConsumerIDTextField.click();
        Thread.sleep(1000);
        ConsumerIDTextField.clear();
        ConsumerIDTextField.sendKeys(input);
    }

    public void clickOnSearchButton(){
        SearchButton.click();
    }

    public void clickOnConsumerRequestTypeDropDown(){
        ConsumerRequestTypeDropDown.click();
    }

    public void selectConsumerRequestTypeDropDown(String input){
        ConsumerRequestType.sendKeys(input, Keys.ENTER);
    }

    public void clickOnNewContractLoadUnitDropDown(){
        NewContractLoadUnitDropDown.click();
    }

    public void selectNewContractLoadUnitDropDown(String input){
        NewContractLoadUnit.sendKeys(input, Keys.ENTER);
    }

    public void enterContractDemandTextField(String input){
        ContractDemandTextField.click();
        ContractDemandTextField.sendKeys(input);
    }

    public void clickOnReRatingChargeTextField(String input) throws InterruptedException {
        ReRatingChargeTextField.click();
        Thread.sleep(1000);
        ReRatingChargeTextField.clear();
        ReRatingChargeTextField.sendKeys(input);
    }

    public void clickOnDocumentListDropDown(){
        DocumentListDropDown.click();
    }

    public void selectDocumentListDropDown(String input){
        DocumentList.sendKeys(Keys.ENTER);
    }

    public void clickOnChooseFile(String input){
        ChooseFile.sendKeys(input);
    }

    public void clickOnAddButton(){
        AddButton.click();
    }

    public void clickOnOKButton(){
        OKButton.click();
    }

    public void clickOnChooseActionButton(){
        ChooseActionButton.click();
    }

    public void clickOnSaveButton(){
        SaveButton.click();
    }

    public void clickOnLogoutButton(){
        LogoutButton.click();
    }

    public void clickOnLogout(){
        Logout.click();
    }
}
