package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromeinvocation 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
	}

}
