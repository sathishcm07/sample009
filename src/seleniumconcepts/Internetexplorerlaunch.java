package seleniumconcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Internetexplorerlaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.ie.driver", "D:\\chromefiles\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.get("https://www.google.com/");

	}

}
