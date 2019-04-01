package Pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;
import com.test.Reuse;

public class MyXeroPage extends Reuse {
public void Tc8A() throws Exception
{	
	try
	{
	InitializeDriver("Chrome");
	launchurl("https://login.xero.com/");
	StartReport("MyXeroPage Tc8A");	
	login();
	Wait();
	WebElement Settings = findElement(By.xpath("//div[@class='xrh-appbutton--body']"), "Settings");
	clickButton(Settings, "Settings");	
	WebElement MyXero = findElement(By.xpath("//a[contains(text(),'My Xero')]"), "MyXero");
	clickButton(MyXero, "MyXero");
	System.out.println(driver.getCurrentUrl());
	Wait();
	Set<String> getAllwindows=driver.getWindowHandles();
	String[] getwin=getAllwindows.toArray(new String[getAllwindows.size()]);
	System.out.println(getAllwindows.size());
	driver.switchTo().window(getwin[1]);
	System.out.println(driver.getCurrentUrl());
	WebElement org = findElement(By.xpath("//a[@id='ext-gen1043']"), "org");
	clickButton(org,"org");
	String[][] recdata = readExceldata("Data/DataFile.xls", "Sheet6");
	WebElement name = findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/div[1]/div[1]/div[1]/table[2]/tbody[1]/tr[1]/td[2]/input[1]"), "name");
	name.sendKeys(recdata[1][0]);
	WebElement country = findElement(By.xpath("//input[@id='countryCmb-inputEl']"), "country");
	country.sendKeys("United States");
	WebElement timeselect = findElement(By.xpath("//*[@id=\"cmbTimeZone-inputEl\"]"),"Timeselect");
	timeselect.sendKeys("(UTC-08:00) Pacific Time (US & Canada)");
	WebElement industry = findElement(By.xpath("//input[@id='industrysearchcombofield-1025-inputEl']"), "industry");
	industry.sendKeys(recdata[1][1]);
	Thread.sleep(4000);
	WebElement BuyNow = findElement(By.id("simplebutton-1036"), "BuyNow");
	clickButton(BuyNow, "BuyNow");	
	Wait();
	WebElement Early = findElement(By.xpath("//section[1]//div[1]//label[1]//div[1]"),"Radio Button");
	Early.click();
	WebElement continueButton = findElement(By.id("continueButton"), "continueButton");
	clickButton(continueButton, "continueButton");
	Wait();
	WebElement contactAddress = findElement(By.name("contactAddress"), "contactAddress");
	enterText(contactAddress, "contactAddress",recdata[1][2]);
	WebElement contactCity = findElement(By.name("contactCity"), "contactCity");
	enterText(contactCity, "contactCity",recdata[1][3]);Wait();
	WebElement postal = findElement(By.xpath("//div[@id='postalAddress']//button[@type='button']"), "postal");
	clickButton(postal, "postal");
	WebElement postalselect = findElement(By.xpath("//li[@id='California']//button[@type='button']"), "postalselect");
	postalselect.click();
	WebElement contactPostalCode = findElement(By.id("contactPostalCode"), "contactPostalCode");
	enterText(contactPostalCode,"contactPostalCode", recdata[1][4]);
	WebElement continueButton1 = findElement(By.xpath("//button[contains(text(),'Continue to Review & Pay')]"), "continueButton1");
	clickButton(continueButton1, "continueButton1");
	Wait();
	WebElement frame=findElement(By.xpath("//*[@id=\"stripe-card-number\"]/div/iframe"),"card number iframe");
	driver.switchTo().frame(frame);
	System.out.println("Switched to frame"+ frame);
	WebElement cardnumber = findElement(By.name("cardnumber"), "cardnumber");
	cardnumber.sendKeys(recdata[1][5]);	
	driver.switchTo().defaultContent();
	WebElement frame1=findElement(By.xpath("//*[@id=\"stripe-card-expiry\"]/div/iframe"),"card expiry iframe");
	driver.switchTo().frame(frame1);
	WebElement cardexpiry = findElement(By.name("exp-date"), "cardexpiry");
	cardexpiry.sendKeys(recdata[1][6]);	
	driver.switchTo().defaultContent();
	WebElement frame2=findElement(By.xpath("//*[@id=\"stripe-card-cvc\"]/div/iframe"),"card cvc iframe");
	driver.switchTo().frame(frame2);
	WebElement cardcvc = findElement(By.name("cvc"), "cardcvc");
	cardcvc.sendKeys(recdata[1][7]);
	driver.switchTo().defaultContent();
	Wait();
	WebElement cardholdername = findElement(By.xpath("//*[@id=\"stripe-cardholder-name\"]"), "card holder name");
	cardholdername.sendKeys(recdata[1][8]);
	WebElement continueButton2 = findElement(By.id("continueButton"), "Confirm Purchase");
	clickButton(continueButton2, "Confirm Purchase");
	}
	catch(org.openqa.selenium.WebDriverException e)
	{
		System.out.println("Fail Could not be click");	
		logger.log(LogStatus.FAIL," Could not be click ");
	}
	EndReport();
	
}
public void Tc8B() throws Exception
{
	InitializeDriver("Chrome");
	launchurl("https://login.xero.com/");
	StartReport("MyXeroPage Tc8B");	
	login();
	Wait();
	try
	{
	WebElement Settings = findElement(By.xpath("//div[@class='xrh-appbutton--body']"), "Settings");
	clickButton(Settings, "Settings");	
	WebElement MyXero = findElement(By.xpath("//a[contains(text(),'My Xero')]"), "MyXero");
	clickButton(MyXero, "MyXero");
	System.out.println(driver.getCurrentUrl());
	Set<String> getAllwindows=driver.getWindowHandles();
	String[] getwin=getAllwindows.toArray(new String[getAllwindows.size()]);
	System.out.println(getAllwindows.size());
	driver.switchTo().window(getwin[1]);
	WebElement org = findElement(By.xpath("//a[@id='ext-gen1043']"),"org");
	clickButton(org,"org");	
	System.out.println(driver.getCurrentUrl());
	WebElement name = findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/div[1]/div[1]/div[1]/table[2]/tbody[1]/tr[1]/td[2]/input[1]"), "name");
	String[][] recdata = readExceldata("Data/DataFile.xls", "Sheet6");
	name.sendKeys(recdata[1][0]);
	WebElement country = findElement(By.xpath("//div[2]//span[1]//div[1]//table[1]//tbody[1]//tr[1]//td[2]//table[1]//tbody[1]//tr[1]//td[2]//div[1]"), "country");
	clickButton(country,"country");
	WebElement time = findElement(By.xpath("//*[@id=\"cmbTimeZone-inputEl\"]"),"Time");
	time.sendKeys("(UTC-08:00) Pacific Time (US & Canada)");
	WebElement industry = findElement(By.xpath("//input[@id='industrysearchcombofield-1025-inputEl']"), "industry");
	industry.sendKeys(recdata[1][1]);
	WebElement conversionLink = findElement(By.id("conversionLink"), "conversionLink");
	clickButton(conversionLink, "conversionLink");
	WebElement conversionCheckbox = findElement(By.xpath("//input[@id='conversionCheckbox-inputEl']"), "conversionCheckbox");
	selectCheckBox(conversionCheckbox,"conversionCheckbox");
	WebElement Continue = findElement(By.id("simplebutton-1036"), "Continue");
	clickButton(Continue, "Continue");	
	}
	catch(org.openqa.selenium.WebDriverException e)
	{
		System.out.println("Fail Could not be click");	
		logger.log(LogStatus.FAIL," Could not be click ");
	}
	EndReport();
}
}
