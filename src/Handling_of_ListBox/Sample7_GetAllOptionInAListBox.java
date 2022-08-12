package Handling_of_ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample7_GetAllOptionInAListBox
{

	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver", "F:\\setup\\chrome\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///F:/selenium/MultipleListBox.html");
		
		
		
		WebElement selectCountry = driver.findElement(By.xpath("//select[@id=\"1234\"]"));
		
		Thread.sleep(3000);
		
		//step:2
		Select s=new Select(selectCountry);
		
		List<WebElement> multioptions = s.getOptions();
		
		for(WebElement s1:multioptions) 
		{
			System.out.println(s1.getText());
		}
	}
}
