package seleniumconcepts;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownconcept {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\chromefiles\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.tamildailycalendar.com/tamil_daily_calendar.php");
		driver.manage().window().maximize();
		
		WebElement month = driver.findElement(By.id("month"));
		Select s = new Select(month);
		//s.selectByVisibleText("April");
		//s.selectByIndex(8);
		//s.selectByValue("05");
		WebElement firstelement= s.getFirstSelectedOption();
		String data = firstelement.getText();
		//System.out.println(data);
		
		List<WebElement> options= s.getOptions();
		File f = new File("C:\\Users\\Sathish Kumar Inba\\Desktop\\dropdownlist.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		for(int i=0;i<options.size();i++)
		{
			String dropdownvalue = options.get(i).getText();
			System.out.println(dropdownvalue);
			bw.write(dropdownvalue);
			bw.newLine();
			
		}
		
		bw.close();
		
		
		

	}

}
