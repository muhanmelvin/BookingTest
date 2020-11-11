
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BookingTestWithTestNG {
	
	@org.testng.annotations.Test
	public void demo()
	{
		
		System.out.println("Hellow");	
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kasthuri\\Documents\\Temp\\chromedriver_86.exe");
		System.setProperty("webdriver.chrome.driver", "chromedriver_86.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://hotel-test.equalexperts.io/");
		
		driver.findElement(By.xpath("//*[@id='firstname']")).sendKeys("Melvin-selenium-5");
		driver.findElement(By.xpath("//*[@id='lastname']")).sendKeys("G.");
		driver.findElement(By.xpath("//*[@id='totalprice']")).sendKeys("12.50");
		driver.findElement(By.xpath("//*[@id='checkin']")).sendKeys("2020-11-10"); //yyyy-mm-dd
		driver.findElement(By.xpath("//*[@id='checkout']")).sendKeys("2020-11-15"); //yyyy-mm-dd
		
		//Select s = new Select(driver.findElement(By.xpath("//*[@id='depositpaid']")));
		Select s = new Select(driver.findElement(By.id("depositpaid")));
		//s.selectByValue("false");
		s.selectByIndex(1);
		
		driver.findElement(By.xpath("//*[@id='form']/div/div[7]/input")).click();
		System.out.println("Test execution complete Muhan comment");	
		

	}
}