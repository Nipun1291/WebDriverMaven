import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}
	@Test
	public void doLogin() throws InterruptedException
	{
		driver.get("https://gmail.com");
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("tester09testing@gmail.com");
		driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
		
		Thread.sleep(2000L);
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Nipun@12");
	    driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
	}
   @AfterSuite
	public void tearDown()
	{
		driver.quit();
	}
}
