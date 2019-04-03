package LoginStepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reuse {
	static WebDriver driver;
	public static void login()
	{
		System.out.println("launch" );
		System.setProperty("webdriver.chrome.driver","/Users/nchillal/Documents/Shweta/chromedriver");
		driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("chillaleshwet@gmail.com");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("SeleniumTest123");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		Wait();
	}
	public static void Wait()
	{
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	}
}
