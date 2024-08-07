package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends ScreenActions{

    public WebDriver driver;

    private final By UsernameTextField = By.cssSelector("input#txtLoginName");
    private final By PasswordTextField = By.cssSelector("input#txtpassword");
    private final By LoginButton = By.xpath("//button[.='Login']");

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public LoginPage enterUsernameTextField(String input){
        clickElement(UsernameTextField,"UsernameTextField");
        setText(UsernameTextField,input,"UsernameTextField");
        return new LoginPage(driver);
    }

    public void enterPasswordTextField(String input){
        clickElement(PasswordTextField,"PasswordTextField");
        setText(PasswordTextField,input,"PasswordTextField");
    }

    public void clickOnLoginButton(){
        clickElement(LoginButton,"LoginButton");
    }
}
