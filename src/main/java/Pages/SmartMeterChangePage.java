package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmartMeterChangePage {

    public WebDriver driver;

    @FindBy(css = "img#btnswitch")
    private WebElement SwitchRole;

    @FindBy(xpath = "//div[@id='ddlRole_chosen']/a/span")
    private WebElement RoleDropDown;

    @FindBy(xpath = "//div[@id='ddlRole_chosen']//input")
    private WebElement Role;

    @FindBy(xpath = "//div[@id='ddlSubdivision_chosen']/a/span")
    private WebElement LocationDropDown;

    @FindBy(xpath = "//div[@id='ddlSubdivision_chosen']//input")
    private WebElement Location;

    @FindBy(css = "button#btnproceed")
    private WebElement ProceedButton;

    @FindBy(xpath = "(//button[@aria-label='Close'])[2]")
    private WebElement CloseButton;

    @FindBy(xpath = "//span[.='Smart Billing']")
    private WebElement SmartBillingTab;

    @FindBy(xpath = "//a[.='SRBD Meter Change']")
    private WebElement SmartMeterChangeTab;

    @FindBy(xpath = "//div[@id='ddlBillType_chosen']/a/span")
    private WebElement BillTypeDropDown;

    @FindBy(xpath = "//div[@id='ddlBillType_chosen']//input")
    private WebElement BillType;

    @FindBy(css = "input#fileupload")
    private WebElement ChooseFileButton;

    @FindBy(css = "input#btnSave")
    private WebElement SaveButton;

    @FindBy(xpath = "//button[@type='confirm']")
    private WebElement OKButton;

    public SmartMeterChangePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public SmartMeterChangePage clickOnSwitchRole(){
        SwitchRole.click();
        return new SmartMeterChangePage(driver);
    }

    public void clickOnRoleDropDown(){
        RoleDropDown.click();
    }

    public void selectRoleDropDown(String input){
        Role.sendKeys(input, Keys.ENTER);
    }

    public void clickOnLocationDropDown(){
        LocationDropDown.click();
    }

    public void selectLocationDropDown(String input){
        Location.sendKeys(input, Keys.ENTER);
    }

    public void clickOnProceedButton(){
        ProceedButton.click();
    }

    public void clickOnnCloseButton(){
        CloseButton.click();
    }

    public void clickOnSmartBillingTab(){
        SmartBillingTab.click();
    }

    public void clickOnSmartMeterChangeTab(){
        SmartMeterChangeTab.click();
    }

    public void clickOnBillTypeDropDown(){
        BillTypeDropDown.click();
    }

    public void selectBillTypeDropDown(String input){
        BillType.sendKeys(input,Keys.ENTER);
    }

    public void clickOnChooseFileButton(String input){
        ChooseFileButton.sendKeys(input);
    }

    public void clickOnSaveButton(){
        SaveButton.click();
    }

    public void clickOnOKButton(){
        OKButton.click();
    }


}
