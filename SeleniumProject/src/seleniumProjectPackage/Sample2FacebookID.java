package seleniumProjectPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample2FacebookID {

	public static void main(String[] args) {
			WebDriver driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.facebook.com/");
			System.out.println(driver.getWindowHandle().toString());
			String TagName;
			TagName = driver.findElement(By.id("email")).getTagName();
			System.out.println(TagName);
			driver.close();
			
	}

}
