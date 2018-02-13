package Default;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.openqa.selenium.Dimension;
import io.appium.java_client.TouchAction;

import java.net.MalformedURLException;

public class IOSTest extends Practice{

    public static void main(String args[]) throws MalformedURLException {

        IOSDriver<IOSElement> driver = capatabilities();

        driver.findElementByAccessibilityId("Alert Views").click();
        driver.findElementByAccessibilityId("Text Entry").click();
        driver.findElementByClassName("XCUIElementTypeTextField").sendKeys("Hello");
        driver.findElementByName("OK").click();

        /*
        //Scrool down phone
        Dimension screenSize = driver.manage().window().getSize();
        new TouchAction(driver)
                .press((int) (screenSize.width * 0.6), 130)
                .press((int) (screenSize.width * 0.3), 130)
                .release()
                .perform();

        driver.findElementByAccessibilityId("Alert Views").click();
        */

    }
}
