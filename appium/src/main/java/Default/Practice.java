package Default;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class Practice {

    static IOSDriver<IOSElement>driver;

    public static IOSDriver<IOSElement> capatabilities() throws MalformedURLException{

        DesiredCapabilities d = new DesiredCapabilities();
        d.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 6");
        d.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
        d.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
        d.setCapability(MobileCapabilityType.APP, "/Users/renanchagas/Documents/Workspace-IntelliJ/Selenium/UICatalog.app");

       driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"),d);
       driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);

       return driver;
    }
}
