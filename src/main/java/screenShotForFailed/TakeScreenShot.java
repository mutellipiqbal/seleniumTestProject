package screenShotForFailed;
import com.crm.qa.base.*;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class TakeScreenShot extends TestBase {
    public void takeScreenShot(String name){
        File file= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, new File(""+name+".jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
