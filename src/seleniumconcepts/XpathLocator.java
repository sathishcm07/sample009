package seleniumconcepts;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class XpathLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\chromefiles\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-use-explicit-wait-in-selenium.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id='post-body-7708391096228750161']/button")).click();
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.pollingEvery(5, TimeUnit.SECONDS);
		wait.withTimeout(30, TimeUnit.SECONDS);
		WebElement element = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver arg0)
			{
				WebElement ele = arg0.findElement(By.xpath("//*[@id='demo']"));
				if(ele.getAttribute("innerHTML").equalsIgnoreCase("Webdriver"))
				{
					System.out.println("value is "+ele.getAttribute("innerHTML"));
					return ele;
				}
				else
				{
					System.out.println("value is "+ele.getAttribute("innerHTML"));
					return null;
				}
			}
		});

		System.out.println("Final element "+element.isDisplayed());
	}

}
