package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownAndCheckboxes 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "C://Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://spicejet.com/");
		/*
		//handling dynamic dropdown
		driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath(".//a[@value='VGA']")).click();
		
		driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();
		driver.findElement(By.xpath(".//a[@value='DHM']")).click();
		
		//handling static dropdown
		Select dropdown=new Select(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_Adult']")));
		dropdown.selectByIndex(1);//imp
		dropdown.selectByValue("5");//imp
		dropdown.selectByVisibleText("6 Adults");//imp
		*/
		//checking if the checkboxes are selected
		System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_StudentDiscount']")).isSelected());
		driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_StudentDiscount']")).click();
		
		System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_StudentDiscount']")).isSelected());
		driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_StudentDiscount']")).click();
		
		System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_StudentDiscount']")).isSelected());
		
		
	}
}
