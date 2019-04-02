package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.test.Reuse;

public class AccountsPage extends Reuse{
	public void Tc10() throws Exception
	{
	InitializeDriver("Chrome");
	launchurl("https://login.xero.com/");
	StartReport("AccountsPage Tc10");	
	login();
	Wait();//button[contains(text(),'Business')]
	WebElement business=findElement(By.xpath("//button[contains(text(),'Business')]"), "business");
	clickButton(business, "business");
	WebElement Billstopay=findElement(By.xpath("//a[contains(text(),'Bills to pay')]"), "Bills to pay");
	clickButton(Billstopay, "Bills to pay");
	WebElement Paid=findElement(By.xpath("//a[contains(text(),'Paid')]"), "Paid");
	clickButton(Paid, "Paid");
	String str1="https://go.xero.com/AccountsPayable/Search.aspx?invoiceStatus=INVOICESTATUS%2fPAID";
	String str2=driver.getCurrentUrl();
	System.out.println(validate(str1,str2));
	WebElement Repeating=findElement(By.xpath("//a[@href='/AccountsPayable/SearchRepeating.aspx']"), "Repeating");
	clickButton(Repeating, "Repeating");
	String str3="https://go.xero.com/AccountsPayable/SearchRepeating.aspx";
	String str4=driver.getCurrentUrl();
	System.out.println(validate(str3,str4));
	WebElement all=findElement(By.xpath("//a[@href='/AccountsPayable/Search.aspx']"), "All");
	clickButton(all, "All");
	String str5="https://go.xero.com/AccountsPayable/Search.aspx";
	String str6=driver.getCurrentUrl();
	System.out.println(validate(str5,str6));
	EndReport();
}
}
