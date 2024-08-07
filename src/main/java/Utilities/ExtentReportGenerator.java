package Utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static Base.TestBase.driver;

public class ExtentReportGenerator {

    private static ExtentReports extent;

    private static String path;

    public static String timestamp = new SimpleDateFormat("dd-MM-yyyy-HH.mm.ss").format(new Date());

    public static String reportPath = "ExtentReports/eReport-"+timestamp+".html";

    public static ExtentReports getExtentReport(){

        ExtentReports report = new ExtentReports();

        File extentReportFile = new File(reportPath);

        ExtentSparkReporter sparkReporter = new ExtentSparkReporter(extentReportFile);

        try {
            sparkReporter.loadXMLConfig(System.getProperty("user.dir")+"\\src\\test\\resources\\extent-report-config.xml");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        report.attachReporter(sparkReporter);

        return report;

    }

    public static ExtentReports getInstance() {
        if (extent == null)
            createInstance();

        return extent;
    }

    public static ExtentReports createInstance() {
        if (extent == null) {
            String workingDir = System.getProperty("user.dir");
            String reportName = "Report.html";

            if (System.getProperty("os.name").toLowerCase().contains("mac")
                    || System.getProperty("os.name").toLowerCase().contains("linux")) {
                path = "//target//" + reportName;
            } else {
                path = "\\target\\" + reportName;
            }
            ExtentSparkReporter htmlReporter = new ExtentSparkReporter(workingDir + path);
            htmlReporter.config().setTheme(Theme.STANDARD);
            htmlReporter.config().setDocumentTitle("Report");
            htmlReporter.config().setEncoding("utf-8");
            htmlReporter.config().setReportName("Automated Tests - Report");
            extent = new ExtentReports();
            extent.attachReporter(htmlReporter);
        }
        return extent;
    }

    public static void addScreenShot(String message)
    {
        String base64Image = "data:image/png;base64," + ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);

        //Base64 from Screenshot of Selenium
        ExtentTestManager.getExtentTest().log(Status.INFO, MediaEntityBuilder.createScreenCaptureFromBase64String(base64Image).build());

        //File Path from Screenshot of Java
        //ExtentTestManager.getExtentTest().log(Status.INFO, MediaEntityBuilder.createScreenCaptureFromPath(String.valueOf(CaptureHelpers.getScreenshotFile(message))).build());

    }

    public static void pass(String message) {
        //LogUtils.info("ExtentReportManager class: " + ExtentTestManager.getExtentTest());
        ExtentTestManager.getExtentTest().pass(message);
    }
}
