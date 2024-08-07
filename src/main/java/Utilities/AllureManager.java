package Utilities;

import com.github.automatedowl.tools.AllureEnvironmentWriter;
import com.google.common.collect.ImmutableMap;
import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.Browser;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import static Base.TestBase.driver;
import static org.openqa.selenium.OutputType.BYTES;

public class AllureManager {

    private AllureManager() {
    }

    public static void setAllureEnvironmentInformation() {
        AllureEnvironmentWriter.allureEnvironmentWriter(
                ImmutableMap.<String, String>builder().
                        put("Test URL", "http://159.117.145.184:1994/").
                        put("Target Execution", "local").
                        put("Global Timeout", String.valueOf(5)).
                        put("Page Load Timeout", String.valueOf(40)).
                        put("Headless Mode", "false").
                        put("Local Browser", String.valueOf(Browser.CHROME)).
                        put("Remote URL", "localhost").
                        put("Remote Port", "4444").
                        build());

        System.out.println("Allure Reports is installed.");

    }

    @Attachment(value = "Failed test Screenshot", type = "image/png")
    public static byte[] takeScreenshotToAttachOnAllureReport() {
        try {
            return ((TakesScreenshot) driver).getScreenshotAs(BYTES);
        } catch (Exception ex) {
            ex.getMessage();
        }
        return new byte[0];
    }

    @Attachment(value = "Step Screenshot", type = "image/png")
    public static byte[] takeScreenshotStep() {
        try {
            return ((TakesScreenshot) driver).getScreenshotAs(BYTES);
        } catch (Exception ex) {
            ex.getMessage();
        }
        return new byte[0];
    }

    @Attachment(value = "Browser Information", type = "text/plain")
    public static String addBrowserInformationOnAllureReport() {
        return BrowserInfoUtils.getOSInfo();
    }


    //Text attachments for Allure
    @Attachment(value = "{0}", type = "text/plain")
    public static String saveTextLog(String message) {
        return message;
    }

    //HTML attachments for Allure
    @Attachment(value = "{0}", type = "text/html")
    public static String attachHtml(String html) {
        return html;
    }

//    public static void addAttachmentVideoAVI() {
//        if ("no".toLowerCase().trim().equals("yes")) {
//            try {
//                //Get file Last Modified in folder
//                File video = FileHelpers.getFileLastModified("ExportData/Videos");
//                if (video != null) {
//                    Allure.addAttachment("Video record AVI", "video/avi", new FileInputStream(video), "avi");
//                } else {
////                    LogUtils.warn("Video record not found.");
////                    LogUtils.warn("Can not attachment Video in Allure report");
//                }
//
//            } catch (IOException e) {
////                LogUtils.error("Can not attachment Video in Allure report");
//                e.printStackTrace();
//            }
//        }
//    }
//
//    public static void addAttachmentVideoMP4() {
//        try {
//            //Get file Last Modified in folder
//            File video = FileHelpers.getFileLastModified("ExportData/Videos");
//            //File video = new File("ExportData/Videos/SampleVideo.mp4");
//            if (video != null) {
//                Allure.addAttachment("Video record MP4", "video/mp4", new FileInputStream(video), "mp4");
//            } else {
////                LogUtils.warn("Video record not found.");
////                LogUtils.warn("Can not attachment Video in Allure report");
//            }
//
//        } catch (IOException e) {
////            LogUtils.error("Can not attachment Video in Allure report");
//            e.printStackTrace();
//        }
//    }

}
