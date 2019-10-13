package seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ChromeLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\ds\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/mercuryregister.php?osCsid=1fa3c8abca30880c05b8c43201b82516");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.name("country"));
		Select s = new Select(element);
		s.selectByVisibleText("ALGERIA ");

	}

}
