package utility;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener {

    private ExtentSparkReporter sparkReporter;
    private ExtentReports extent;
    private static ThreadLocal<ExtentTest> extentTest = new ThreadLocal<>();
    private String repName;

    @Override
    public void onStart(ITestContext testContext) {
        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        repName = "EspoCRM Test-Report-" + timeStamp + ".html";

        String reportPath = "C:\\Users\\xmedia\\Desktop\\Automation Test Report\\" + repName;
        sparkReporter = new ExtentSparkReporter(reportPath);

        sparkReporter.config().setDocumentTitle("EspoCRM Automation Report");
        sparkReporter.config().setReportName("EspoCRM Functional Testing");
        sparkReporter.config().setTheme(Theme.STANDARD);

        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);

        extent.setSystemInfo("Application", "EspoCRM");
        extent.setSystemInfo("All Module", "Admin");
        extent.setSystemInfo("Sub Module", "Customers");
        extent.setSystemInfo("User Name", System.getProperty("user.name"));
        extent.setSystemInfo("Environment", "QA");
        extent.setSystemInfo("Operating System", "Windows 10");
        extent.setSystemInfo("Browser", "Chrome");

        List<String> includedGroups = testContext.getCurrentXmlTest().getIncludedGroups();
        if (!includedGroups.isEmpty()) {
            extent.setSystemInfo("Groups", includedGroups.toString());
        }
    }

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test started: " + result.getMethod().getMethodName());

        ExtentTest test = extent.createTest(
                result.getTestClass().getName() + " - " + result.getMethod().getMethodName()
        );
        test.assignCategory(result.getMethod().getGroups());
        extentTest.set(test);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        extentTest.get().log(Status.PASS, result.getName() + " got successfully executed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        ExtentTest test = extentTest.get();
        test.log(Status.FAIL, result.getName() + " failed");
        test.log(Status.INFO, result.getThrowable().getMessage());

        try {
            // Screenshot capture (modify this to match your actual method)
            String imgPath = new MyProject.demo.us.espocrm.com.BaseClass().captureScreen(result.getName());
            test.addScreenCaptureFromPath(imgPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        ExtentTest test = extentTest.get();
        test.log(Status.SKIP, result.getName() + " got skipped");
        if (result.getThrowable() != null) {
            test.log(Status.INFO, result.getThrowable().getMessage());
        }
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        ExtentTest test = extentTest.get();
        test.log(Status.WARNING, result.getName() + " failed but is within the success percentage.");
        test.log(Status.INFO, result.getThrowable().getMessage());
    }

    @Override
    public void onFinish(ITestContext testContext) {
        extent.flush();

        String pathOfExtentReport = "C:\\Users\\xmedia\\Desktop\\Automation Test Report\\" + repName;
        File extentReport = new File(pathOfExtentReport);

        try {
            if (Desktop.isDesktopSupported()) {
                Desktop.getDesktop().browse(extentReport.toURI());
            } else {
                System.out.println("Desktop is not supported, please manually open the report.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
