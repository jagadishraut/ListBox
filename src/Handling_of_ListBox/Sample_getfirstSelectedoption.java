package Handling_of_ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample_getfirstSelectedoption
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
		
		s.selectByIndex(3);
		s.selectByIndex(1);
		s.selectByIndex(2);
		s.selectByIndex(0);
		
	WebElement firstselectedoption= s.getFirstSelectedOption();
	 String text = firstselectedoption.getText();
	System.out.println(text);

}
}
