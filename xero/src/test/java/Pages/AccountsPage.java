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
	WebElement Repeating=findElement(By.xpath("//a[@href='/AccountsPayable/SearchRepeating.aspx']"), "Repeating");
	clickButton(Repeating, "Repeating");
	WebElement all=findElement(By.xpath("//a[@href='/AccountsPayable/Search.aspx']"), "All");
	clickButton(all, "All");
	EndReport();
}
}
