package seleniumProjectPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumSampleMercury {

	public static void main(String[] args) {
		WebDriver driver  = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		String ExpectedTitle = "Welcome: Mercury Tours";
		String ActualTitle = "";
		ActualTitle = driver.getTitle();
		
		if(ActualTitle.contentEquals(ExpectedTitle)){
			System.out.println("Testpassed");
		}else{
			System.out.println("Test failed");
		}
		
		
		driver.close();

	}

}
