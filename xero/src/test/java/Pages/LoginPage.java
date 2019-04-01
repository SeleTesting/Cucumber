package Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;
import com.test.Reuse;
import com.test.Reuse;

public class LoginPage extends Reuse {
	public void Tc1A() throws Exception 
	{
		InitializeDriver("Safari");
		launchurl("https://login.xero.com/");
		StartReport("LoginPage Tc1A");
		logger.log(LogStatus.PASS ,"Safari browser launched");
		login();
		System.out.println(driver.getTitle());
		EndReport();
	}
	/*Enter Valid User Name
	Enter Incorrect Password <pwd>*/
	public void Tc1B() throws Exception {
		InitializeDriver("Firefox");
		launchurl("https://login.xero.com/");
		StartReport("LoginPage Tc1B");
		logger.log(LogStatus.PASS ,"Firefox browser launched");
		String[][] recdata = readExceldata("Data/DataFile.xls", "Sheet2");
		System.out.println(
				"You are on Login page " + findElement(By.xpath("//a[@class='logo']"), "xero Logo").isDisplayed());
		WebElement un = findElement(By.id("email"), "User Name");
		enterText(un, "userName", recdata[1][0]);
		WebElement pass = findElement(By.id("password"), "Pass Word");
		enterText(pass, "PassWrod", recdata[1][1]);
		WebElement lgn = findElement(By.id("submitButton"), "Login");
		clickButton(lgn, "Login");
		String str = findElement(By.xpath("//p[contains(text(),'Your email or password is incorrect')]"), "Error msg")
				.getText();
		String str2 = "Your email or password is incorrect";
		Assert.assertEquals(str, str2);
		System.out.println("Error msg :" + str);
		logger.log(LogStatus.PASS, "Error msg  :" + str);
		EndReport();
	}
	/*Enter InValid User Name
	Enter correct Password <pwd>*/
	public void Tc1C() throws Exception {
		InitializeDriver("Chrome");
		launchurl("https://login.xero.com/");
		StartReport("LoginPage Tc1C");
		logger.log(LogStatus.PASS ,"Chrome browser launched");
		String[][] recdata = readExceldata("Data/DataFile.xls", "Sheet3");
		System.out.println("You are on Login page " + findElement(By.xpath("//a[@class='logo']"), "xero Logo").isDisplayed());
		WebElement un = findElement(By.id("email"), "User Name");
		enterText(un, "userName", recdata[1][0]);
		WebElement pass = findElement(By.name("password"), "Pass Word");
		enterText(pass, "PassWrod", recdata[1][1]);
		WebElement lgn = findElement(By.id("submitButton"), "Login");
		clickButton(lgn, "Login");
		String str = findElement(By.xpath("//p[contains(text(),'Your email or password is incorrect')]"), "Error msg").getText();
		String str2 = "Your email or password is incorrect";
		Assert.assertEquals(str, str2);
		System.out.println("Error msg :" + str);
		logger.log(LogStatus.PASS, "Error msg  :" + str);
		EndReport();
	}

	public void Tc1D() throws Exception {
		InitializeDriver("Chrome");
		launchurl("https://login.xero.com/");
		StartReport("LoginPage Tc1D");
		logger.log(LogStatus.PASS ,"Chrome browser launched");
		String[][] recdata = readExceldata("Data/DataFile.xls", "Sheet2");
		WebElement forgot = findElement(By.xpath("//a[@class='forgot-password-advert']"), "forgot password");
		clickButton(forgot, "forgot password");
		Thread.sleep(3000);
		WebElement email = findElement(By.id("UserName"), "Login");
		email.clear();
		enterText(email, "user email", "chillaleshwet@gmail.com");
		WebElement sendlink = findElement(By.xpath("//span[@class='text']"), "send link");
		clickButton(sendlink, "send link");
		EndReport();
	}
}
