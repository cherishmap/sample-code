package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browserinvocation 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://qaclickacademy.com");
		
		System.out.println(driver.getPageSource());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		driver.close();
		
	}
}
