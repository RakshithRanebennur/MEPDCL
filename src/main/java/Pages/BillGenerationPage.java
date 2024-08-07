package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BillGenerationPage {

    public WebDriver driver;

    @FindBy(xpath = "//a[.='Bill Generation']")
    private WebElement BillGenerationTab;

    @FindBy(css = "input#txtAccID")
    private WebElement ConsumerIDTextField;

    @FindBy(css = "input#btnSearchacc")
    private WebElement SearchTextField;

    @FindBy(xpath = "//div[@id='ddlMeterStatus_chosen']/a/span")
    private WebElement MeterStatusDropDown;

    @FindBy(xpath = "//div[@id='ddlMeterStatus_chosen']//input")
    private WebElement MeterStatus;

    @FindBy(css = "input#txtPreviousMeterRead")
    private WebElement PreviousReading;

    @FindBy(css = "input#txtPresReading")
    private WebElement CurrentReadingTextField;

    @FindBy(css = "input#btnCalculate")
    private WebElement CalculateButton;

    @FindBy(css = "textarea#txtApprovalComments")
    private WebElement CommentTextField;

    @FindBy(xpath = "//button[@class='btn btn-success dropdown-bs-toggle']")
    private WebElement ChooseActionButton;

    @FindBy(xpath = "(//input[@type='button'])[5]")
    private WebElement SaveButton;

    @FindBy(xpath = "(//button[@type='button'])[12]")
    private WebElement CloseButton;

    @FindBy(css = "span.align-items-center>span>span")
    private WebElement LogoutButton;

    @FindBy(css = "[data-key*='logout']")
    private WebElement Logout;

    @FindBy(xpath = "//button[@class='confirm']")
    private WebElement OKButton;

    public BillGenerationPage(WebDriver driver){
        this.driver =  driver;
        PageFactory.initElements(driver, this);
    }

    public BillGenerationPage clickOnBillGenerationTab(){
        BillGenerationTab.click();
        return new BillGenerationPage(driver);
    }

    public void clickOnConsumerIDTextField(String input){
        ConsumerIDTextField.click();
        ConsumerIDTextField.sendKeys(input);
    }

    public void clickOnSearchTextField(){
        SearchTextField.click();
    }

    public void clickOnMeterStatusDropDown(){
        MeterStatusDropDown.click();
    }

    public void enterMeterStatusDropDown(String input){
        MeterStatus.sendKeys(input, Keys.ENTER);
    }

    public String getPreviousReading(){
        String reading = PreviousReading.getAttribute("value");
        return reading;
    }

    public void enterCurrentReadingTextField(String input){
        CurrentReadingTextField.click();
        CurrentReadingTextField.clear();
        CurrentReadingTextField.sendKeys(input);
    }

    public void clickOnOKButton(){
        OKButton.click();
    }

    public void clickOnCalculateButton(){
        CalculateButton.click();
    }

    public void  enterCommentTextField(String input){
        CommentTextField.click();
        CommentTextField.sendKeys(input);
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

    public void clickOnCloseButton(){
        CloseButton.click();
    }

}
