package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEdriverinvocation 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
		System.setProperty("webdriver.ie.driver", "C://IEDriverServer.exe");
		
		WebDriver driver= new InternetExplorerDriver();
		driver.get("http://google.com");
	}
}
