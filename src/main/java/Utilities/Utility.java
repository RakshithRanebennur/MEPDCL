package Utilities;

import Base.TestBase;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.IOException;
import java.text.Normalizer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Pattern;

public class Utility extends TestBase {

    private static final Pattern NONLATIN = Pattern.compile("[^\\w-]");
    private static final Pattern WHITESPACE = Pattern.compile("[\\s]");

    public Utility(){
        PageFactory.initElements(driver,this);
    }

    public void scrollVertically(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    public void scrollHorizantally(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,550)", "");
    }

    public static void takeSS(String filename)
    {
        String path = "./screenshots/";
        String timestamp = new SimpleDateFormat("dd/mm/yyyy-hh:mm:ss a").format(new Date());
        TakesScreenshot ts = (TakesScreenshot)driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        File des = new File(path + filename+".png");
        try
        {
            FileHandler.copy(src, des);
        }
        catch (IOException e)
        {
            System.out.println("File not found");
            e.printStackTrace();
        }
    }
    public static String takeScreenshot(String testName,WebDriver driver) {

        File sourceScreenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File destinationScreenshotFile = new File(System.getProperty("user.dir")+"\\Screenshots\\"+testName+".png");
        try {
            FileUtils.copyFile(sourceScreenshotFile, destinationScreenshotFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return destinationScreenshotFile.getAbsolutePath();

    }

    public static String makeSlug(String input)
    {
        if (input == null)
            throw new IllegalArgumentException();

        String noWhiteSpace = WHITESPACE.matcher(input).replaceAll("_");
        String normalized = Normalizer.normalize(noWhiteSpace, Normalizer.Form.NFD);
        String slug = NONLATIN.matcher(normalized).replaceAll("");
        return slug.toLowerCase(Locale.ENGLISH);
    }

    public void acceptAlertPopup()
    {
        driver.switchTo().alert().accept();
    }

}
