package seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigatesample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\chromefiles\\chromedriver.exe");
		driver = new ChromeDriver();
		Dimension size = new Dimension(500, 1500);
		driver.manage().window().setSize(size);
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
