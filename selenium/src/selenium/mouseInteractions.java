package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseInteractions 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "C://Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		Actions mouse=new Actions(driver);
		
		WebElement element=driver.findElement(By.xpath(".//*[@id='nav-link-accountList']"));
		mouse.moveToElement(element).build().perform();
		
		WebElement element2=driver.findElement(By.xpath(".//*[@id='nav-al-your-account']/a[1]/span"));
		mouse.click(element2).build().perform();
		
		WebElement element3=driver.findElement(By.xpath(".//*[@id='twotabsearchtextbox']"));
		mouse.keyDown(Keys.SHIFT).sendKeys(element3, "bodyshop").build().perform();
		
	}

}
