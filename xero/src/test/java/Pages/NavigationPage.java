package Pages;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;
import com.test.Reuse;
public class NavigationPage extends Reuse
{
	public void Tc3() throws Exception
	{
	InitializeDriver("Chrome");
	launchurl("https://login.xero.com/");
	StartReport("NavigationPage Tc3");
	login();
	WebElement dashboard = findElement(By.xpath("//a[@class='xrh-focusable xrh-tab--body xrh-tab--body-is-selected']"), "dashboard");
	clickButton(dashboard, "dashboard");
	findElement(By.xpath("//div[@class='xui-page-title xdash-setupwidget__setup--header-title___1obD5']"), "Welcome header of dashboard").isDisplayed();
	WebElement Accounting = findElement(By.xpath("//button[contains(text(),'Accounting')]"), "Accounting");
	Accounting.click();
	findElement(By.xpath("//a[contains(text(),'Bank accounts')]"), "Bank accounts").isDisplayed();
	findElement(By.xpath("//a[contains(text(),'Reports')]"), "Reports").isDisplayed();
	findElement(By.xpath("//a[contains(text(),'Advanced')]"), "Advanced").isDisplayed();
	findElement(By.xpath("//a[contains(text(),'Account Transactions')]"), "Account Transactions").isDisplayed();
	findElement(By.xpath("//a[contains(text(),'Aged Payables Summary')]"), "Aged Payables Summary").isDisplayed();
	findElement(By.xpath("//a[contains(text(),'Aged Receivables Summary')]"), "Aged Receivables Summary").isDisplayed();
	findElement(By.xpath("//a[contains(text(),'Balance Sheet')]"), "Balance Sheet").isDisplayed();
	findElement(By.xpath("//a[contains(text(),'Income Statement')]"), "Income Statement").isDisplayed();
	findElement(By.xpath("//a[contains(text(),'Sales Tax Report')]"), "Sales Tax Report").isDisplayed();
	findElement(By.xpath("//a[contains(text(),'Chart of accounts')]"), "Chart of accounts").isDisplayed();
	findElement(By.xpath("//a[contains(text(),'Fixed assets')]"), "Fixed assets").isDisplayed();
	
	Wait();//a[contains(text(),'Invoices')]
	WebElement Business = findElement(By.xpath("//button[contains(text(),'Business')]"), "Business");
	clickButton(Business, "Business");	
	findElement(By.xpath("//a[contains(text(),'Invoices')]"), "Invoices").isDisplayed();
	findElement(By.xpath("//a[contains(text(),'Quotes')]"), "Quotes").isDisplayed();
	findElement(By.xpath("//a[contains(text(),'Sales overview')]"), "Sales overview").isDisplayed();
	findElement(By.xpath("//a[contains(text(),'Bills to pay')]"), "Bills to pay").isDisplayed();
	findElement(By.xpath("//a[contains(text(),'Purchase orders')]"), "Purchase orders").isDisplayed();
	findElement(By.xpath("//a[contains(text(),'Purchases overview')]"), "Purchases overview").isDisplayed();
	findElement(By.xpath("//a[contains(text(),'Expense claims')]"), "Expense claims").isDisplayed();
	findElement(By.xpath("//a[contains(text(),'Products and services')]"), "Products and services").isDisplayed();
	findElement(By.xpath("//a[contains(text(),'Checks')]"), "Checks").isDisplayed();
	
	
	Wait();
	WebElement Contacts = findElement(By.xpath("//button[contains(text(),'Contacts')]"), "Contacts");
	clickButton(Contacts, "Contacts");	
	findElement(By.xpath("//a[contains(text(),'All contacts')]"), "All contacts").isDisplayed();
	findElement(By.xpath("//a[contains(text(),'Customers')]"), "Customers").isDisplayed();
	findElement(By.xpath("//a[contains(text(),'Suppliers')]"), "Suppliers").isDisplayed();
	WebElement menu = findElement(By.xpath("//div[@class='xrh-appbutton--body']"),"menu");
	clickButton(menu, "menu");
	WebElement Settings = findElement(By.xpath("//a[contains(text(),'Settings')]"), "Settings");
	clickButton(Settings, "Settings");	
	WebElement text=findElement(By.xpath("//span[contains(text(),'Organization settings')]"),"menu");
	String msg=text.getText();
	logger.log(LogStatus.PASS," Setting displayed"+msg);
	findElement(By.xpath("//button[@title='Create new']//div[@class='xrh-focusable--child xrh-iconwrapper']"), "plus Symbol").isDisplayed();
	findElement(By.xpath("//button[@title='Notifications']//*[@class='xrh-icon xrh-icon-svg']"), "Notifications").isDisplayed();
	findElement(By.xpath("//button[@title='Search']//div[@class='xrh-focusable--child xrh-iconwrapper']"),"Search").isDisplayed();
	findElement(By.xpath("//button[@title='Help']//div[@class='xrh-focusable--child xrh-iconwrapper']"),"Help").isDisplayed();
	EndReport();
	}
}
