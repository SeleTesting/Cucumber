package LoginStepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinition {
WebDriver driver;
@Given("^when user is on login homepage1$")
public void when_user_is_on_login_homepage1() throws Throwable 
{
	System.setProperty("webdriver.chrome.driver","/Users/nchillal/Documents/Shweta/chromedriver");
	driver=new ChromeDriver();
	driver.get("https://login.salesforce.com/");
	driver.manage().window().maximize();
	System.out.println("hi...");
}
@When("^user enters username and password$")
public void user_enters_username_and_password() throws Throwable 
{	
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//*[@id='username']")).sendKeys("chillaleshwet@gmail.com");
	driver.findElement(By.xpath("//*[@id='password']")).sendKeys("SeleniumTest123");
}
@When("^clicks on login button$")
public void clicks_on_login_button() throws Throwable
{
	try 
{

	driver.findElement(By.xpath("//input[@value='Log In']")).click();
}
catch(NoSuchElementException e)
{
	System.out.println(e);
}
}
@Then("^user will be on home page$")
public void user_will_be_on_home_page() throws Throwable
{
	Thread.sleep(4000);
	String str=driver.getCurrentUrl();
	System.out.println("hi...");
	System.out.println("Title::"+str);
	Assert.assertEquals("https://na85.salesforce.com/setup/forcecomHomepage.apexp?setupid=ForceCom",str);
	Thread.sleep(4000);
	driver.quit();
}
}
