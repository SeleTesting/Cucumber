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
	WebElement upload = findElement(By.xpath("//div[@id='button-1041']"), "upload");
	clickButton(upload,"upload");
	try
	{
	Thread.sleep(5000);
	Wait();
	driver.switchTo().activeElement();
	WebElement browsePhoto=findElement(By.xpath("/html[1]/body[1]/div[10]/div[2]/span[1]/div[1]/div[1]/div[1]/span[1]/div[1]/div[3]/div[1]/span[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]"),"Browse");
	Wait();
	browsePhoto.sendKeys("/Users/nchillal/Desktop/flower.jpeg");
	//WebElement browsePhoto=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='j_id0:uploadFileForm:uploadInputFile']")));
	//browsePhoto.sendKeys("Data/flower.jpeg");
	Thread.sleep(4000);
	WebElement savePhoto=findElement(By.xpath("//*[@id=\"button-1178\"]"),"save photo");
	savePhoto.click();
	}
	catch(org.openqa.selenium.WebDriverException e)
	{
		System.out.println("Fail Could not be click");	
		logger.log(LogStatus.FAIL," Could not be click ");
	}
	EndReport();
	}
}
