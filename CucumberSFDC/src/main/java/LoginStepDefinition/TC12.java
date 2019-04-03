package LoginStepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.*;
import junit.framework.Assert;

public class TC12 extends Reuse
{
	@Given("^when user is on login homepage3$")
	public void when_user_is_on_login_homepage3() throws Throwable 
	{	
		login();
	}
	@When("^Click on the Accounts Tab1$") 
	public void Click_on_the_Accounts_Tab1()throws Throwable 
	{
		Thread.sleep(6000);
		driver.findElement(By.xpath("//a[contains(@title,'Accounts Tab')]")).click();		
		Wait();
	}
	
	@And("^Select view name from dropdown$")  
	public void Select_view_name_from_dropdown()throws Throwable 
	{
		WebElement selectmenu=driver.findElement(By.name("fcf"));
		Select select=new Select(selectmenu);
		select.selectByVisibleText("Ann");
		System.out.println("Selected name");
		Wait();
	}
	@And("^Click on Edit and make changes and save$") 
	public void Click_on_Edit_and_make_changes_and_save()throws Throwable 
	{
		Actions mousehoover=new Actions(driver);
		driver.findElement(By.linkText("Edit")).click();
		WebElement fname=driver.findElement(By.name("fname"));
		fname.clear();
		fname.sendKeys("Ann1");
		Wait();
		WebElement selectmenu=driver.findElement(By.name("fop1"));
		Select select1=new Select(selectmenu);
		select1.selectByVisibleText("contains");
		WebElement value=driver.findElement(By.id("fval1"));
		value.sendKeys("a");
		Wait();
		WebElement field=driver.findElement(By.id("colselector_select_0"));
		Select select2=new Select(field);
		select2.selectByVisibleText("Last Activity");
		Wait();
		driver.findElement(By.xpath("//a[@id='colselector_select_0_right']//img[@title='Add']")).click();
		driver.findElement(By.name("save")).click();
		
	}
	@Then("^newly added details sould be displayed$") 
	public void newly_added_details_sould_be_displayed()throws Throwable 
	{
		Wait();
		WebElement selectmenu=driver.findElement(By.xpath("//select[@title='View:']"));
		Select select=new Select(selectmenu);
		select.selectByVisibleText("Ann1");
		driver.quit();
	}

}
