package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SRBDPostpaidFileGeneratePage {

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

    @FindBy(xpath = "//span[.='Support Activity']")
    private WebElement SupportActivityTab;

    @FindBy(xpath = "//a[.='SRBD Post Paid File Generate']")
    private WebElement SRBDFileGenerateTab;

    @FindBy(xpath = "//div[@id='UserLoginName_chosen']/a/span")
    private WebElement UserNameTextField;

    @FindBy(xpath = "//div[@id='UserLoginName_chosen']//input")
    private WebElement UserName;

    @FindBy(css = "input#btnLoad")
    private WebElement LoadButton;

    @FindBy(css = "textarea#txtComments")
    private WebElement CommentTextField;

    @FindBy(css = "input#btnGenerate")
    private WebElement GenerateButton;

    @FindBy(xpath = "//button[@class='confirm']")
    private WebElement OKButton;

    @FindBy(css = "span.align-items-center>span>span")
    private WebElement LogoutButton;

    @FindBy(css = "[data-key*='logout']")
    private WebElement Logout;

    public SRBDPostpaidFileGeneratePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
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

    public void clickOnnCloseButton(){
        CloseButton.click();
    }

    public void clickOnSupportActivityTab(){
        SupportActivityTab.click();
    }

    public void clickOnSRBDFileGenerateTab(){
        SRBDFileGenerateTab.click();
    }

    public void clickOnUserNameTextField(){
        UserNameTextField.click();
    }

    public void enterUserNameTextField(String input){
        UserName.sendKeys(input, Keys.ENTER);
    }

    public void clickOnLoadButton(){
        LoadButton.click();
    }

    public void enterCommentTextField(String input){
        CommentTextField.click();
        CommentTextField.sendKeys(input);
    }

    public void clickOnGenerateButton(){
        GenerateButton.click();
    }

    public void clickOnOKButton(){
        OKButton.click();
    }

    public void clickOnLogoutButton(){
        LogoutButton.click();
    }

    public void clickOnLogout(){
        Logout.click();
    }

}
