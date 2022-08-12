package Handling_of_ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample8_GetSizeOf_Alloptioninalistbox
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\setup\\chrome\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(3000);
		
		//step:1
		WebElement month=driver.findElement(By.xpath("//select[@id=\"month\"]"));
		
		//step:2
		Select s=new Select(month);
		
		List<WebElement> multipleoptions = s.getOptions();
		int size = multipleoptions.size();
		
		System.out.println(size);
		
		for(WebElement s1:multipleoptions) 
		{
			System.out.println(s1.getText());
		}
		
	}
}
