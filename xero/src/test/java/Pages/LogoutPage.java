package Pages;
import java.rmi.activation.ActivateFailedException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;
import com.test.Reuse;
import bsh.Console;
public class LogoutPage extends Reuse
{
	public void Tc4() throws Exception
	{
		InitializeDriver("Chrome");
		launchurl("https://login.xero.com/");
		StartReport("LogoutPage Tc4");	
		login();
		Wait();
		WebElement UserMenu = findElement(By.xpath("//button[@title='Selenium Testing']"), "UserMenu");
		clickButton(UserMenu,"UserMenu");
		Wait();
		WebElement Logout = findElement(By.xpath("//a[@class='xrh-verticalmenuitem--body'][contains(text(),'Log out')]"), "Logout");
		clickButton(Logout,"Logout");
		String[][] recdata = readExceldata("Data/DataFile.xls", "Sheet2");
		WebElement un = findElement(By.id("email"), "User name");
		String str=un.getText();
		System.out.println(validate(str,recdata[0][0]));
		System.out.println("User name field has   "+un.getText());
		EndReport();
	}
}
