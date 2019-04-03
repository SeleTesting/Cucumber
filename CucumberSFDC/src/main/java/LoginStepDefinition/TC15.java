package LoginStepDefinition;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import cucumber.api.PendingException;
import cucumber.api.java.en.*;

public class TC15 extends Reuse
{ 
	
	@Given("^when user is on homepage4$")
	public void when_user_is_on_homepage4() throws Throwable 
	{	
		login();
	}

	@When("^click on opportunities Tab$")
	public void click_on_opportunities_Tab() throws Throwable 
	{	
	Thread.sleep(6000);
	Actions mousehoover=new Actions(driver);
	driver.findElement(By.xpath("//a[@title='Opportunities Tab']")).click();
	
	}

	@When("^click on opprotunities dropdown$")
	public void click_on_opprotunities_dropdown() throws Throwable
	{
		WebElement menu=driver.findElement(By.name("fcf"));
		menu.click();

	}

	@Then("^verify elements$")
	public void verify_elements() throws Throwable 
	{	
		WebElement dropdown = driver.findElement(By.xpath("//select[@title='View:']")); 
		Select select = new Select(dropdown); 
		java.util.List<WebElement> options = select.getOptions(); 
		for(WebElement item:options) 
		{ 

			System.out.println("Dropdown values are "+ item.getText());           
		} 
		Wait();
		driver.quit();
	}


}
