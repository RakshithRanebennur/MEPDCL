package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MeterReaderAllocationPage {

    public WebDriver driver;

    @FindBy(xpath = "//span[.='Master Mapping']")
    private WebElement MasterMappingTab;

    @FindBy(xpath = "//a[.='Meter Reader ReAllocation']")
    private WebElement MeterReaderReAllocationTab;

    @FindBy(css = "input#BtnNew")
    private WebElement NewMeterReaderReAlloctionButton;

    @FindBy(xpath = "//div[@id='ddlVillage_chosen']/a/span")
    private WebElement VillageDropDown;

    @FindBy(xpath = "//div[@id='ddlVillage_chosen']//input")
    private WebElement Village;

    @FindBy(xpath = "//div[@id='ddlMRCode_chosen']/a/span")
    private WebElement OldMRCodeDropDown;

    @FindBy(xpath = "//div[@id='ddlMRCode_chosen']//input")
    private WebElement OldMRCode;

    @FindBy(css = "input#btnload")
    private WebElement LoadButton;

    @FindBy(xpath = "(//input[@type='checkbox'])[4]")
    private WebElement CheckBox;

    @FindBy(xpath = "//div[@id='sddlMRCode_chosen']/a/span")
    private  WebElement NewMRCodeDropDown;

    @FindBy(xpath = "//div[@id='sddlMRCode_chosen']/a/span")
    private  WebElement NewMRCode;

    @FindBy(css = "input#btnSave")
    private WebElement SaveButton;

    @FindBy(xpath = "//button[@type='confirm']")
    private WebElement OKButton;

    public MeterReaderAllocationPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public MeterReaderAllocationPage clickOnMasterMappingTab(){
        MasterMappingTab.click();
        return new MeterReaderAllocationPage(driver);
    }

    public void clickOnMeterReaderReAllocationTab(){
        MeterReaderReAllocationTab.click();
    }

    public void clickOnNewMeterReaderReAlloctionButton(){
        NewMeterReaderReAlloctionButton.click();
    }

    public void clickOnVillageDropDown(){
        VillageDropDown.click();
    }

    public void enterVillageDropDown(String input){
        Village.sendKeys(input, Keys.ENTER);
    }

    public void clickOnOldMRCodeDropDown(){
        OldMRCodeDropDown.click();
    }

    public void enterOldMRCodeDropDown(String input){
        OldMRCode.sendKeys(input,Keys.ENTER);
    }

    public void clickOnLoadButton(){
        LoadButton.click();
    }

    public void clickOnCheckBox(){
        CheckBox.click();
    }

    public void clickNewMRCodeDropDown(){
        NewMRCodeDropDown.click();
    }

    public void enterNewMRCodeDropDown(String input){
        NewMRCode.sendKeys(input, Keys.ENTER);
    }

    public void clickOnSaveButton(){
        SaveButton.click();
    }

    public void clickOnOKButton(){
        OKButton.click();
    }
}
