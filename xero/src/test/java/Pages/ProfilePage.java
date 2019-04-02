package Pages;

import java.awt.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.LogStatus;
import com.test.Reuse;

public class ProfilePage extends Reuse{
	public void Tc6() throws Exception
	{
	InitializeDriver("Chrome");
	launchurl("https://login.xero.com/");
	StartReport("ProfilePage Tc6");	
	login();
	Wait();
	WebElement UserMenu = findElement(By.xpath("//button[@title='Selenium Testing']"), "UserMenu");
	clickButton(UserMenu,"UserMenu");
	WebElement EditProfile = findElement(By.xpath("//li[@class='xrh-addon xrh-addon-lastvisible']//li[1]//a[1]"), "EditProfile");
	clickButton(EditProfile,"EditProfile");
	Thread.sleep(5000);

	try
	{
	Thread.sleep(5000);
	Wait();
	
	WebElement upload=findElement(By.xpath("//div[@id='button-1043']"),"upload");
	upload.click();
	Wait();
	//driver.switchTo().activeElement();
	//WebElement close=findElement(By.xpath("//img[@class='x-tool-img x-tool-close']"),"close");
	//close.click();
	WebElement browsePhoto=findElement(By.xpath("//input[@name='file']"),"browse");
	enterText(browsePhoto,"browse","⁨/Users/nchillal/Documents/Desktop/pic.jpeg");
	//browsePhoto.sendKeys("⁨Data/pic.jpeg");
	Thread.sleep(6000);
	WebElement savePhoto=findElement(By.xpath("/html[1]/body[1]/div[4]/form[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]"),"save photo");
//	enterText(savePhoto,"savephoto","savephoto");
	savePhoto.click();
	}
	catch(Exception e)
	{
		System.out.println("Fail Could not be click");	
		logger.log(LogStatus.FAIL," Could not be click ");
	}
	EndReport();
	}
}
