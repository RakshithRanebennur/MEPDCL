package Keywords;

import Base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class WebUI extends TestBase {

    public WebUI() {
        PageFactory.initElements(driver,this);
    }

    public void clickElement(WebElement element, String name) {
        element.click();
        super.addLog(name+" component is clicked successfully");
    }

    public void sendingValue(WebElement element,String components,String value){
        element.sendKeys(value);
        super.addLog("This value is selected in the "+components);
    }
}
