package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass 
{
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
		driver= new FirefoxDriver();
		
		driver.get("http://demo.nopcommerce.com");
		driver.findElement(By.xpath("html/body/div[5]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath(".//*[@id='FirstName']")).sendKeys("Cherishma");
		
		Select day= new Select (driver.findElement(By.xpath("html/body/div[5]/div[3]/div/div/form/div/div[2]/div[1]/div[2]/div[4]/select[1]")));
		day.selectByValue("7");		
		
		
		
	}

}
