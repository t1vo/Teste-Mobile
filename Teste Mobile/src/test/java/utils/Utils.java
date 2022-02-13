package utils;

import static utils.Utils.driver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.core.api.Scenario;

public class Utils {

	public static AppiumDriver<WebElement> driver;

	public static void acessarColorNote() throws MalformedURLException {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("deviceName", "emulator-5554");
		desiredCapabilities.setCapability("automationName", "uiautomator2");
		desiredCapabilities.setCapability("appPackage", "com.socialnmobile.dictapps.notepad.color.note");
		desiredCapabilities.setCapability("appActivity", "com.socialnmobile.colornote.activity.Main");
		driver = new AppiumDriver<WebElement>(new URL("http://localhost:4723/wd/hub"), desiredCapabilities);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public static void capturarScreenshot(Scenario scenario) {
		final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		scenario.embed(screenshot, "image/png");
	}

	public static void aguardarElemento(MobileElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

}
