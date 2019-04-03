package LoginStepDefinition;
//package Manual_Test_Auto;
//
//import org.testng.annotations.BeforeMethod;
//import java.io.IOException;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Parameters;
//import org.testng.annotations.Test;
//
//import com.relevantcodes.extentreports.LogStatus;
//
//import pack1.Reuse;
//
//public class SDFCTest2 extends Reuse 
//{
//	@BeforeMethod
//	@BeforeTest
//	public void setUp()
//	{
//	String path="/Users/nchillal/Documents/Shweta/ExtentReports/SFDCTestng.html";
//	reports(path,"SFDCTestng");
//	}
//	@BeforeMethod
//	public void launch() throws IOException
//	{
//	initializeDriver();
//	}
//	/*Test case11
//	 * Launch https://www.login.salesforce.com and provide positive <username> and <password> data to SalesForce Application. 
//	Click on Accounts link on the home page
//	Click on create new view link and provide <View name>, <View unique name> and click on save button
//	***************************************************************************************************/
//	@Test(priority=8,enabled=false)
//	@Parameters({"unameVal","passVal","sendername"})
//	public void TestCase11(String unameVal,String passVal) throws IOException
//	{
//		WebElement un=findElements(By.xpath("//*[@id='username']"),"User Name");
//		Sendkeys(un,"userName",unameVal);
//		WebElement pass=findElements(By.xpath("//*[@id='password']"),"Pass Word");
//		Sendkeys(pass,"Password",passVal);
//		WebElement lgn=findElements(By.xpath("//input[@value='Log In']"),"Login");
//		ClickButton(lgn,"Login");
//		System.out.println("Succefully login");
//		logger.log(LogStatus.PASS,"Login succesfully");
//		Wait();
//		WebElement acct=findElements(By.xpath("//a[contains(@title,'Accounts Tab')]"),"Account Tab");
//		ClickButton(acct,"Account Tab");
//		WebElement link=findElements(By.linkText("Create New View"),"create new view link");
//		ClickButton(link,"create new view link");
//		WebElement fname=findElements(By.name("fname"),"name");
//		Sendkeys(fname,"name","Tom");
//		Wait();
//		WebElement save=findElements(By.name("save"),"save");
//		ClickButton(save,"save");
//		Wait();
//		WebElement selectmenu=driver.findElement(By.name("fcf"));
//		Select select=new Select(selectmenu);
//		select.selectByVisibleText("Tom");
//		System.out.println("Selected name");
//		Wait();
//		
//	}
//	
//	/*TestCase : 12
//	 	Launch https://www.login.salesforce.com and provide positive <username> and <password> data to SalesForce Application. 
//		Click on Accounts link on the home page
//		Select the <view name> from the view drop down list on the account page. Click on the Edit link the accounts page.
//		Change the <view name> to <new view name>. Select the filters field <Account name>, operator  <contains>, Value <a>.
//	 	Select fields to display, select Last activity text from available Fields and click on Add button. Click on save button.
//	 	***********************************************************************************************************************/
//	@Test
//	@Parameters({"unameVal","passVal"})
//	public void TestCase12(String unameVal,String passVal) throws IOException, InterruptedException
//	{
//		WebElement un=findElements(By.xpath("//*[@id='username']"),"User Name");
//		Sendkeys(un,"userName",unameVal);
//		WebElement pass=findElements(By.xpath("//*[@id='password']"),"Pass Word");
//		Sendkeys(pass,"Password",passVal);
//		WebElement lgn=findElements(By.xpath("//input[@value='Log In']"),"Login");
//		ClickButton(lgn,"Login");
//		System.out.println("Succefully login");
//		logger.log(LogStatus.PASS,"Login succesfully");
//		Thread.sleep(6000);
//		WebElement acct=findElements(By.xpath("//a[contains(@title,'Accounts Tab')]"),"Account Tab");
//		ClickButton(acct,"Account Tab");
//		Wait();
//		WebElement selectmenu=driver.findElement(By.name("fcf"));
//		Select select=new Select(selectmenu);
//		select.selectByVisibleText("Tom");
//		System.out.println("Selected name");
//		Wait();
//		Actions mousehoover=new Actions(driver);
//		WebElement edit1=findElements(By.linkText("Edit"),"edit");
//		ClickButton(edit1,"edit");
//		WebElement fname=findElements(By.name("fname"),"name");
//		fname.clear();
//		Sendkeys(fname,"name","Tom1");
//		Wait();
//		selectmenu=driver.findElement(By.name("fop1"));
//		Select select1=new Select(selectmenu);
//		select1.selectByVisibleText("contains");
//		WebElement value=findElements(By.id("fval1"),"value");
//		Sendkeys(value,"a",passVal);
//		Wait();
//		WebElement field=findElements(By.id("colselector_select_0"),"fields to display");
//		Select select2=new Select(field);
//		select2.selectByVisibleText("Last Activity");
//		Wait();
//		WebElement add=findElements(By.xpath("//a[@id='colselector_select_0_right']//img[@title='Add']"),"add");
//		ClickButton(add,"add");
//		WebElement save=findElements(By.name("save"),"save");
//		ClickButton(save,"save");
//	}
////	@AfterMethod
////	public void Quit()
////	{
////		driver.quit();
////	}
//	
//}
