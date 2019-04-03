package LoginStepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.*;
import junit.framework.Assert;

public class TC11 extends Reuse{
	@Given("^when user is on homepage2$")
	public void when_user_is_on_homepage2() throws Throwable 
	{	
		login();
	}
	@When("^Click on the Accounts Tab$")
	public void click_on_the_Accounts_Tab() throws Throwable 
	{
	  Wait();
	 driver.findElement(By.xpath("//a[contains(@title,'Accounts Tab')]")).click();
	}

	@Then("^click create new button$")
	public void click_create_new_button() throws Throwable 
	{
		driver.findElement(By.linkText("Create New View")).click();
	}

	@Then("^fill form and click save button$")
	public void fill_form_and_click__save_button() throws Throwable {
		driver.findElement(By.name("fname")).sendKeys("Ann");
		Wait();
		driver.findElement(By.name("save")).click();
		Wait();
	
	}

	@Then("^Account name should be created$")
	public void account_name_should_be_created() throws Throwable 
	{
		Wait();
		Wait();
		WebElement selectmenu=driver.findElement(By.xpath("//select[@title='View:']"));
		Select select=new Select(selectmenu);
		select.selectByVisibleText("Ann");	
		Wait();
		driver.quit();
	}

}
