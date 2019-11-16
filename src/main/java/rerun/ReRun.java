package rerun;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ReRun {
    public static class FailedTestCases implements IRetryAnalyzer {

        private int retryCnt = 0;
        //You could mentioned maxRetryCnt (Maximiun Retry Count) as per your requirement. Here I took 2, If any failed testcases then it runs two times
        private int maxRetryCnt = 2;
        public boolean retry(ITestResult iTestResult) {
            if (retryCnt < maxRetryCnt) {
                System.out.println("Retrying " + iTestResult.getName() + " again and the count is " + (retryCnt+1));
                retryCnt++;
                return true;
            }
            return false;
        }
    }
}
