package Pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;
import com.test.Reuse;

public class SignUpPage extends Reuse {
	public void Tc2A() throws Exception 
	{
		InitializeDriver("Chrome");
		launchurl("https://www.xero.com/us/");
		StartReport("SignUpPage Tc2A");	
		WebElement trial = findElement(By.xpath("//a[@class='btn btn-primary global-ceiling-bar-btn']"), "Free Trial");
		clickButton(trial, "Free Trial");
		Wait();
		Wait();
		WebElement un = findElement(By.xpath("//input[@name='FirstName']"), "FirstName");
		String[][] recdata = readExceldata("Data/DataFile.xls","Sheet5");
		enterText(un, "userName", recdata[0][0]);
		WebElement Ln = findElement(By.name("LastName"), "FirstName");
		enterText(Ln, "userName", recdata[0][1]);
		WebElement EmailAddress = findElement(By.name("EmailAddress"), "EmailAddress");
		enterText(EmailAddress, "userName", recdata[0][2]);
		WebElement PhoneNumber = findElement(By.name("PhoneNumber"), "PhoneNumber");
		enterText(PhoneNumber, "userName", recdata[0][3]);
		WebElement LocationCode = findElement(By.name("LocationCode"), "LocationCode");
		Select select = new Select(LocationCode);
		select.selectByVisibleText("United States");
		WebElement captcha = findElement(By.xpath("//body[@class='xero is-live-mode']"), "captcha");
		clickButton(captcha, "captcha Image option");
		WebElement terms = findElement(By.name("TermsAccepted"), "terms");
		clickButton(terms, "captcha Image option");
		WebElement submit = findElement(By.xpath("//button[@type='submit']"), "submit");
		if(submit.isEnabled())
		{
			clickButton(submit, "submit");
			logger.log(LogStatus.PASS," "+submit+"  clicked ");	
		}
		else
		{	System.out.println("Fail Button is Disabled ");
			logger.log(LogStatus.FAIL," "+submit+" Could not be click Disabled");	
		}
		
		EndReport();
	}
	public void Tc2B() throws Exception 
	{
		InitializeDriver("Chrome");
		launchurl("https://www.xero.com/us/");
		StartReport("SignUpPage Tc2B");
		Wait();
		WebElement trial = findElement(By.xpath("//a[@class='hero-btn hero-btn-1 hero-cta btn btn-primary']"), "Free Trial");
		trial.click();
		try {
		WebElement submit=findElement(By.xpath("//span[@class='g-recaptcha-submit']"), "submit");
		submit.click();
		WebElement fn=findElement(By.xpath("//span[contains(text(),\"First name can't be empty\")]"), "First name Error ");
		String str1=fn.getText();
		String str2="First name can't be empty";
		System.out.println(validate(str1,str2));
		Wait();
		WebElement Ln=findElement(By.xpath("//span[contains(text(),\"Last name can't be empty\")]"), "First name Error ");
		String str3=Ln.getText();
		String str4="Last name can't be empty";
		System.out.println(validate(str3,str4));
		WebElement email=findElement(By.xpath("//span[contains(text(),\"Email address can't be empty\")]"), "Email Error ");
		String str5=email.getText();
		String str6="Email address can't be empty";
		System.out.println(validate(str5,str6));
		WebElement phone=findElement(By.xpath("//span[contains(text(),\"Phone number can't be empty\")]"), "Phone number Error ");
		String str7=phone.getText();
		String str8="Phone number can't be empty";
		System.out.println(validate(str7,str8));
		WebElement EmailAddress = findElement(By.name("EmailAddress"), "EmailAddress");
		enterText(EmailAddress, "userName","abc");
		WebElement email1=findElement(By.xpath("//span[@id='signup-form-error-message-3']"), " invalid Email Error ");
		String str9=email.getText();
		String str10="Email address is invalid";
		System.out.println(validate(str9,str10));
		WebElement color=findElement(By.xpath("//label[@class='form-label text']"), "Terms and policy highlighted");
		System.out.println("text enabled:  "+color.isEnabled());
		}
		catch(org.openqa.selenium.NoSuchElementException e)
		{
			System.out.println("Fail : Submit Button is not clickable "+e);
			logger.log(LogStatus.FAIL," Submit Button is not clickable"+e);	
		}
		EndReport();
	}
	public void Tc2C() throws Exception 
	{
		InitializeDriver("Chrome");
		launchurl("https://www.xero.com/us/");
		StartReport("SignUpPage Tc2C");
		Wait();
		WebElement trial = findElement(By.xpath("//a[@class='hero-btn hero-btn-1 hero-cta btn btn-primary']"), "Free Trial");
		clickButton(trial, "Free Trial");
		Wait();
		WebElement terms = findElement(By.xpath("//a[contains(text(),'terms of use')]"), "terms");
		clickButton(terms, "terms");
		Set<String> getAllwindows=driver.getWindowHandles();
		String[] getwin=getAllwindows.toArray(new String[getAllwindows.size()]);
		System.out.println(getAllwindows.size());
		driver.switchTo().window(getwin[1]);
		String str=driver.getCurrentUrl();
		System.out.println(str);
		String a="https://www.xero.com/us/about/terms/";
		System.out.println(validate(str,a));
		driver.switchTo().window(getwin[0]);
		WebElement privacy = findElement(By.xpath("//a[contains(text(),'privacy notice')]"), "privacy");
		clickButton(privacy, "privacy");
		Set<String> getAllwindows1=driver.getWindowHandles();
		String[] getwin1=getAllwindows1.toArray(new String[getAllwindows1.size()]);
		System.out.println(getAllwindows1.size());
		driver.switchTo().window(getwin1[2]);
		String str1=driver.getCurrentUrl();
		String str2="https://www.xero.com/us/about/privacy/";
		System.out.println(validate(str1,str2));
		EndReport();
	}
	public void Tc2D() throws Exception 
	{
		InitializeDriver("Chrome");
		launchurl("https://www.xero.com/us/");
		StartReport("SignUpPage Tc2D");
		Wait();
		WebElement trial = findElement(By.xpath("//a[@class='hero-btn hero-btn-1 hero-cta btn btn-primary']"), "Free Trial");
		clickButton(trial, "Free Trial");
		Wait();
		WebElement offers = findElement(By.xpath("//a[contains(text(),'offer details')]"), "offers");
		clickButton(offers, "offers");
		Set<String> getAllwindows=driver.getWindowHandles();
		String[] getwin=getAllwindows.toArray(new String[getAllwindows.size()]);
		System.out.println(getAllwindows.size());
		driver.switchTo().window(getwin[1]);
		String str=driver.getCurrentUrl();
		System.out.println(str);
		System.out.println(validate(str,"https://www.xero.com/us/signup/offer-details/"));		
		EndReport();
	}
	public void Tc2E() throws Exception 
	{
		InitializeDriver("Chrome");
		launchurl("https://www.xero.com/us/");
		StartReport("SignUpPageTc2E");
		Wait();
		WebElement trial = findElement(By.xpath("//a[@class='hero-btn hero-btn-1 hero-cta btn btn-primary']"), "Free Trial");
		clickButton(trial, "Free Trial");
		Wait();
		WebElement bookkeeper = findElement(By.xpath("//a[contains(text(),'accountant or bookkeeper')]"), "accountant or bookkeeper");
		clickButton(bookkeeper, "accountant or bookkeeper");
		System.out.println(findElement(By.xpath("//div[@class='campaign-header-branding']"), "You are on accountant or bookkeeper page").isDisplayed());
		EndReport();
	}
}
