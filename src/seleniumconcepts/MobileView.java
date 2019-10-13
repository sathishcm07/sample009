package seleniumconcepts;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MobileView {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\chromefiles\\chromedriver.exe");
		Map<String, String> mobileEmulation = new HashMap<>();
		mobileEmulation.put("deviceName", "Nexus 5");
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("mobileEmulation", mobileEmulation);
		driver = new ChromeDriver(options);
		driver.get("https://www.google.com/");
		
		
		WebElement inputbox = driver.findElement(By.name("q"));
		inputbox.sendKeys("Vmetry Technologies");
		inputbox.sendKeys(Keys.ENTER);
		
		/*WebElement searchbutton = driver.findElement(By.name("btnK"));
		searchbutton.click();*/
		
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		driver.navigate().to("https://www.bing.com");


	}

}
