package seleniumconcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefoxlaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "D:\\chromefiles\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.google.com/");

	}

}
