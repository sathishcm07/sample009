package seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\chromefiles\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.bing.com");
		driver.manage().window().maximize();
		
		WebElement binginputbox = driver.findElement(By.cssSelector("input#sb_form_q"));
		binginputbox.sendKeys("Vmetry Technologies");
		
		WebElement searchbox = driver.findElement(By.id("sb_form_go"));
		searchbox.sendKeys(Keys.ENTER);
		//searchbox.submit();
		//searchbox.click();
		
		/*String data=binginputbox.getAttribute("value");
		System.out.println(data);*/

	}

}
