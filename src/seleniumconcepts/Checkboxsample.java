package seleniumconcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxsample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\chromefiles\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/Html/tryit.asp?filename=tryhtml_checkbox");
		driver.manage().window().maximize();
		List<WebElement> frames=  driver.findElements(By.tagName("iframe"));
		System.out.println("No of frames present in the web page: "+ frames.size());
		
		driver.switchTo().frame("iframeResult");
		//i have a bike checkbox
		WebElement bikecheckbox = driver.findElement(By.name("vehicle"));
		//bikecheckbox.click();
		
		if(bikecheckbox.isEnabled())
		{
			System.out.println("Checkbox is enabled");
		}
		if(bikecheckbox.isDisplayed())
		{
			System.out.println("Checkbox is displayed");
		}
		if(!bikecheckbox.isSelected())
		{
			bikecheckbox.click();
			System.out.println("Checkbox is selected");
		}
		

	}

}
