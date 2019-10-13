package seleniumconcepts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AlertConcept {
	
	WebDriver driver;
	@Parameters("browser")
	@BeforeClass
	public void browserlaunch(String browser)
	{
		if(browser.equals("Chrome"))
		{
	System.setProperty("webdriver.chrome.driver", "D:\\chromefiles\\chromedriver.exe");
	driver = new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "D:\\chromefiles\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
	}

	@Test
	public  void alet() throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		driver.manage().window().maximize();
		driver.switchTo().frame("iframeResult");
		WebElement tryitbutton = driver.findElement(By.xpath("/html/body/button"));
		tryitbutton.click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		String alerttext = alert.getText();
		if(alerttext.equals("Hello! I am an alert box!"))
		{			
		alert.accept();
		}
		//alert.dismiss();
		

	}

}
