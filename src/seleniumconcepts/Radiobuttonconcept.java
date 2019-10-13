package seleniumconcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobuttonconcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\chromefiles\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
		
		List<WebElement> cheesebutton = driver.findElements(By.name("group1"));
		//System.out.println(cheesebutton.size());
		for(int i=0;i<cheesebutton.size();i++)
		{
			String radiobuttontext = cheesebutton.get(i).getAttribute("value");
			System.out.println(radiobuttontext);
			if(radiobuttontext.equals("Milk"))
			{
				cheesebutton.get(i).click();
			}
		}
		

	}

}
