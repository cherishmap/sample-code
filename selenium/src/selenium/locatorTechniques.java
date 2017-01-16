package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class locatorTechniques 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("cherishma.perikala");
		driver.findElement(By.name("pass")).sendKeys("12345");
		//driver.findElement(By.xpath(".//*[@id='u_0_n']")).click();
		driver.findElement(By.linkText("Forgot account?")).click();
		driver.findElement(By.tagName("a"));
	}

}
