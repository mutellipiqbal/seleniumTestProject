package screenShotForFailed;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ScreenshotForFailed implements ITestListener {


    public void onTestStart(ITestResult result) {


    }

    public void onTestSuccess(ITestResult result) {


    }

    public void onTestFailure(ITestResult result) {
        String methodName= result.getName();
        TakeScreenShot takeScreenShot= new TakeScreenShot();
        takeScreenShot.takeScreenShot(methodName);


    }

    public void onTestSkipped(ITestResult result) {


    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {


    }

    public void onStart(ITestContext context) {



    }

    public void onFinish(ITestContext context) {

    }
}
