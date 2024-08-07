package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.nio.file.LinkPermission;

public class SmartMeterOnBoardPage {

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

    @FindBy(xpath = "//span[.='Smart Billing']")
    private WebElement SmartBillingTab;

    @FindBy(xpath = "//a[.='SMART METER ONBOARD']")
    private WebElement SmartMeterOnboardTab;

    @FindBy(css = "input#btnNew")
    private WebElement NewButton;

    @FindBy(xpath = "//label[.='POSTPAID']")
    private WebElement PostPaidChecKBox;

    @FindBy(css = "input#fileupload")
    private WebElement ChooseFileButton;

    @FindBy(css = "input#btnfileupload")
    private WebElement LoadButton;

    @FindBy(xpath = "(//button[@type='button'])[12]")
    private WebElement OKButton;

    public SmartMeterOnBoardPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public SRBDPostpaidFileGeneratePage clickOnSwitchRole(){
        SwitchRole.click();
        return new SRBDPostpaidFileGeneratePage(driver);
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

    public void clickOnSmartBillingTab(){
        SmartBillingTab.click();
    }

    public void clickOnSmartMeterOnboardTab(){
        SmartMeterOnboardTab.click();
    }

    public void clickOnNewButton(){
        NewButton.click();
    }

    public void clickOnPostPaidChecKBox(){
        PostPaidChecKBox.click();
    }

    public void clickOnChooseFileButton(String input){
//        ChooseFileButton.click();
        ChooseFileButton.sendKeys(input);
    }

    public void clickOnLoadButton(){
        LoadButton.click();
    }

    public void clickOnOKButton(){
        OKButton.click();
    }
}
