package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;
import com.test.Reuse;

public class CreateAccountPage extends Reuse{
	public void Tc5() throws Exception
	{
	InitializeDriver("Chrome");
	launchurl("https://login.xero.com/");
	StartReport("CreateAccountPage Tc5");	
	login();
	Wait();
	System.out.println("Fail : Create Account Could not be found on Page");
	logger.log(LogStatus.FAIL," Create Account Could not be found on Page");
	EndReport();
	}
}
