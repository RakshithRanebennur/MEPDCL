package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConsumerHistoryPage {

    public WebDriver driver;

    @FindBy(xpath = "//span[.='Consumer']")
    private WebElement ConsumerTab;

    @FindBy(xpath = "//a[.='Consumer History']")
    private WebElement ConsumerHistoryTab;

    @FindBy(css = "input#txtAccID")
    private WebElement ConsumerIDTextField;

    @FindBy(css = "input#btnSearchacc")
    private WebElement SearchTextField;

    @FindBy(xpath = "(//a[@id='contact-tab'])[1]")
    private WebElement BillingTab;

    @FindBy(css = "[title='View Bill']")
    private WebElement ViewIcon;

    @FindBy(xpath = "(//img[@src='https://www.iconpacks.net/icons/2/free-pdf-download-icon-2617-thumb.png'])[1]")
    private WebElement PDFImage;

    @FindBy(xpath = "//button[@class='ui-dialog-titlebar-close']")
    private WebElement CloseButton;

    @FindBy(css = "span.align-items-center>span>span")
    private WebElement LogoutButton;

        @FindBy(css = "[data-key*='logout']")
    private WebElement Logout;

    public ConsumerHistoryPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public ConsumerHistoryPage clickOnConsumerTab(){
        ConsumerTab.click();
        return new ConsumerHistoryPage(driver);
    }

    public void clickOnConsumerHistoryTab(){
        ConsumerHistoryTab.click();
    }

    public void enterConsumerIDTextField(String input){
        ConsumerIDTextField.click();
        ConsumerIDTextField.sendKeys(input);
    }

    public void clickOnSearchTextField(){
        SearchTextField.click();
    }

    public void clickOnBillingTab(){
        BillingTab.click();
    }

    public void clickOnViewIcon(){
//        ViewIcon.click();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].click();",ViewIcon);
    }

    public void clickOnPDFImage(){
        PDFImage.click();
    }

    public void clickOnCloseButton(){
        CloseButton.click();
    }

    public void clickOnLogoutButton(){
        LogoutButton.click();
    }

    public void clickOnLogout(){
        Logout.click();
    }


}
