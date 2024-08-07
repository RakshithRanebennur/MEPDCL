package Pages;


import Utilities.*;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.sql.DriverManager;
import java.time.Duration;

import static Base.TestBase.driver;

public class ScreenActions
{
    private static SoftAssert softAssert = new SoftAssert();

    public static void stopSoftAssertAll()
    {
        softAssert.assertAll();
    }

    public static void sleep(double second)
    {
        try
        {
            Thread.sleep((long) (second * 1000));
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }

    public static WebElement getWebElement(By by)
    {
        return driver.findElement(by);
    }

    public static void smartWait()
    {
        if ("true".trim().toLowerCase().equals("true"))
        {
            waitForPageLoaded();
        }
        sleep(0);
    }

//    @Step("Open website with URL {0}")
    public static void openWebsite(String URL)
    {
        sleep(0);

        driver.get(URL);

        waitForPageLoaded();

//        LogUtils.info("Open Website with URL: "+ URL);

        if (ExtentTestManager.getExtentTest() != null) {
            ExtentReportGenerator.pass("Open website with URL: " + URL);
        }
        AllureManager.saveTextLog("Open website with URL: " + URL);

        addScreenshotToReport(Thread.currentThread().getStackTrace()[1].getMethodName() + "_" + DateUtils.getCurrentDateTime());

    }

    @Step("Click on the element {0}")
    public static void clickElement(By by, String componentName)
    {
        waitForElementClickable(by).click();
//        LogUtils.info("Clicked on the element " + by.toString());

        if (ExtentTestManager.getExtentTest() != null)
        {
            ExtentReportGenerator.pass("Clicked on the element " + componentName);
        }
        AllureManager.saveTextLog("Clicked on the element " + componentName);

        addScreenshotToReport(Thread.currentThread().getStackTrace()[1].getMethodName() + "_" + DateUtils.getCurrentDateTime());

    }

    public static void waitForPageLoaded()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40), Duration.ofMillis(500));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        ExpectedCondition<Boolean> jsLoad = driver -> ((JavascriptExecutor) driver).executeScript("return document.readyState").toString().equals("complete");

        boolean jsReady = js.executeScript("return document.readyState").toString().equals("complete");

        if (!jsReady) {
//            LogUtils.info("Javascript in NOT Ready!");
            try
            {
                wait.until(jsLoad);
            }
            catch (Throwable error)
            {
                error.printStackTrace();
                Assert.fail("Timeout waiting for page load. (40s)");
            }
        }
    }

    public static void addScreenshotToReport(String screenName)
    {
        if ("yes".equals("yes"))
        {
            if (ExtentTestManager.getExtentTest() != null)
            {
                ExtentReportGenerator.addScreenShot(Utility.makeSlug(screenName));
            }
            //CaptureHelpers.captureScreenshot(DriverManager.getDriver(), Helpers.makeSlug(screenshotName));
            AllureManager.takeScreenshotStep();
        }
    }

    public static WebElement waitForElementClickable(By by)
    {
        smartWait();

        try
        {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10), Duration.ofMillis(500));
            return wait.until(ExpectedConditions.elementToBeClickable(getWebElement(by)));
        }
        catch (Throwable error)
        {
            Assert.fail("Timeout waiting for the element ready to click. " + by.toString());
//            LogUtils.error("Timeout waiting for the element ready to click. " + by.toString());
        }
        return null;
    }

//    @Step("Set text on text box")
    public static void setText(By by, String value, String component)
    {
        waitForElementVisible(by).sendKeys(value);
//        LogUtils.info("Set text " + value + " on " + by.toString());

        if (ExtentTestManager.getExtentTest() != null) {
            ExtentReportGenerator.pass("Set text " + value + " on " + component);
        }
        AllureManager.saveTextLog("Set text " + value + " on " + component);

        addScreenshotToReport(Thread.currentThread().getStackTrace()[1].getMethodName() + "_" + DateUtils.getCurrentDateTime());
    }

    public static WebElement waitForElementVisible(By by)
    {
        smartWait();
        waitForElementPresent(by);

        try
        {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10), Duration.ofMillis(500));
            boolean check = isElementVisible(by, 1);
            if (check == true)
            {
                return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
            }
            else
            {
                scrollToElementAtBottom(by);
                return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
            }
        }
        catch (Throwable error)
        {
//            LogUtils.error("Timeout waiting for the element Visible. " + by.toString());
            Assert.fail("Timeout waiting for the element Visible. " + by.toString());
        }
        return null;
    }

    public static WebElement waitForElementPresent(By by)
    {
        smartWait();

        try
        {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10), Duration.ofMillis(500));
            return wait.until(ExpectedConditions.presenceOfElementLocated(by));
        }
        catch (Throwable error)
        {
//            LogUtils.error("Element not exist. " + by.toString());
            Assert.fail("Element not exist. " + by.toString());
        }
        return null;
    }

    @Step("Verify element visible {0}")
    public static boolean isElementVisible(By by, int timeout)
    {
        smartWait();

        try
        {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
//            LogUtils.info("Verify element visible " + by);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    @Step("Scroll to element {0}")
    public static void scrollToElementAtBottom(By by)
    {
        smartWait();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(false);", getWebElement(by));
//        LogUtils.info("Scroll to element " + by);
    }
}
