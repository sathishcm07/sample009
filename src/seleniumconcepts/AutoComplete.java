package seleniumconcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutoComplete {

	@Test
	public  void autocomplete() throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\chromefiles\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.justdial.com/Chennai/play-schools/nct-10286876");
		driver.manage().window().maximize();
		
		
		WebElement close=driver.findElement(By.xpath("html/body/section/section"));
		close.sendKeys(Keys.TAB);
		close.sendKeys(Keys.ESCAPE);
		//text
		String sxpath="html/body/div[2]/div[2]/div[2]/div[2]/div[1]/div/section/div/ul/li[";
		String expath="]/section/div[1]/section/div[1]/h4/span/a";
		//phone
		String sxpath1="html/body/div[2]/div[2]/div[2]/div[2]/div[1]/div/section/div/ul/li[";
		String expath1="]/section/div[1]/section/div[1]/p[2]/span/a";
		int i=1;
		while(true)
		{
			try
			{
				JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript("window.scrollBy(0,1500)");
				//text
				String xpath=sxpath+i+expath;
				WebElement	name= driver.findElement(By.xpath(xpath));
				String data=name.getText();
				/*if(data.equals(null))
		        {
		       	 break;
		        }**/
				System.out.println(data);
				//phone
				String xpath1=sxpath1+i+expath1;
		        WebElement phone=driver.findElement(By.xpath(xpath1));
		        String data1=phone.getText();
		        System.out.println(data1);
		         i++;
			}
			catch(Exception e)
			{
				break;
			}


	

}
