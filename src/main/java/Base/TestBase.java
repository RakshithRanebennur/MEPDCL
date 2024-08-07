package Base;

import Keywords.WebUI;
import Pages.*;
import Utilities.ExtentReportGenerator;
import Utilities.ReportManager;
import Utilities.ReportTestManager;
import Utilities.Utility;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.util.HashMap;
import java.util.logging.Logger;

public class TestBase {

    public static WebDriver driver;
    public static Logger logger;
    public Utility utility;
    public WebUI webUI;
    public LoginPage loginPage;
    public ConsumerHistoryPage consumerHistoryPage;
    public String path = System.getProperty("user.dir")+"/src/main/resources/UploadFile/File.png";
    public String BulkBillGenerationFilepath = System.getProperty("user.dir")+"/src/main/resources/UploadFile/BulkBilling.xlsx";
    public String SmartMeterOnboardFilepath = System.getProperty("user.dir")+"/src/main/resources/UploadFile/SmartMeterOnboard.xlsx";
    public String SmartMeterChangeFilepath = System.getProperty("user.dir")+"/src/main/resources/UploadFile/2.xlsx";
    public ChangeRequestPage  changeRequestPage;
    public ExtentReports report = ExtentReportGenerator.getExtentReport();
    public ExtentTest eTest;
    public SRBDPostpaidFileGeneratePage srbdPostpaidFileGeneratePage;
    public BillGenerationPage billGenerationPage;
    public String PreviousReading;
    public BulkBillGenerationPage bulkBillGenerationPage;
    public FileGeneratePage fileGeneratePage;
    public SmartMeterOnBoardPage smartMeterOnBoardPage;
    public MeterReaderAllocationPage meterReaderAllocationPage;
    public SmartMeterChangePage smartMeterChangePage;

    @BeforeTest
    public void start()
    {
        logger = Logger.getLogger("DemoBlaze Automation Framework");
//        PropertyConfigurator.configure("Log4jfile.properties");
        logger.info("Framework Execution started");
    }

    @AfterTest
    public void end()
    {
        logger.info("Framework execution stopped");
    }

    @BeforeMethod
    public void setUp(){

        String downloadDir = "src/main/resources/Downloads";

        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars"); // disabling infobars
        options.addArguments("--disable-extensions"); // disabling extensions
        options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
        options.addArguments("--no-sandbox"); // Bypass OS security model

        HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
        chromePrefs.put("profile.default_content_settings.popups", 0);
        chromePrefs.put("download.default_directory", downloadDir);
        options.setExperimentalOption("prefs", chromePrefs);


        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("http://159.117.145.184:1994/");
        utility = new Utility();
        webUI = new WebUI();
        loginPage = new LoginPage(driver);
        consumerHistoryPage = new ConsumerHistoryPage(driver);
        changeRequestPage = new ChangeRequestPage(driver);
        srbdPostpaidFileGeneratePage = new SRBDPostpaidFileGeneratePage(driver);
        billGenerationPage = new BillGenerationPage(driver);
        bulkBillGenerationPage = new BulkBillGenerationPage(driver);
        fileGeneratePage = new FileGeneratePage(driver);
        smartMeterOnBoardPage = new SmartMeterOnBoardPage(driver);
        meterReaderAllocationPage = new MeterReaderAllocationPage(driver);
        smartMeterChangePage = new SmartMeterChangePage(driver);
    }

    public void addLog(String message){
        ReportTestManager.getTest().log(Status.PASS,message);
    }

//    @AfterMethod
//    public void tearDown(){
//        driver.quit();
//    }

}
