package com.test;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.modules.LoginModule;

public class Reuse implements LoginModule{
	protected static WebDriver driver;
	static ExtentReports report;
	protected static ExtentTest logger;

	// Driver Initialization
	public static void InitializeDriver(String browser) throws Exception
	{	
		if(browser.equalsIgnoreCase("Chrome"))
		{	
			Thread.sleep(3000);
			System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
			driver=new ChromeDriver();
			System.out.println("Chrome browser launched");
			
		}
		else if(browser.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver","drivers/geckodriver");
			driver=new FirefoxDriver();
			System.out.println("Firefox browser launched");
			
		}
		else if(browser.equalsIgnoreCase("Safari"))
		{
			driver = new SafariDriver();
			System.out.println("Safari browser launched");
			
		}
		else
		{
			throw new Exception("couldn't launch");
		}

	}
	
	//Launching Browser
	public static void launchurl(String url)
	{
		driver.get(url);
		driver.manage().window().maximize();
		
	}
	//Starting Extent Report
	public static void StartReport(String logfilename)
	{
		report=new ExtentReports(System.getProperty("user.dir") +"/test-output/ExtentReport.html", false);	
		logger=report.startTest(logfilename);
	}
	/* Name         : findElement
	 * Arguments    : loction:Location of the object
	 *                objName:Name of the object
	 * Created date : 29Mar2019
	 * Last Modified: 29Mar2019           
	 * */
	public static WebElement findElement(By location,String objName)
	{
		WebElement obj=null;
		try
		{
			obj=driver.findElement(location);
			System.out.println("pass : "+objName+" found on page");
			logger.log(LogStatus.PASS," "+objName+"found on page  ");
		}
		catch(org.openqa.selenium.NoSuchElementException e)
		{
			System.out.println("fail : "+objName+" could not found on page");
			logger.log(LogStatus.FAIL," "+objName+ "could not find on page  ");

		}
		return obj;
	}
	
	/* Name         : enterText
	 * Arguments    : obj:Name of the WebElement
	 *                objName:Name of the object(user defined)
	 *                textvale:Text to be entered
	 * Last Modified: 29Mar2019           
	 * */
	public static void enterText(WebElement obj,String objName,String textvalue)
	{
		if(obj==null)
			return;
		if(obj.isDisplayed())
		{
			obj.sendKeys(textvalue);
			System.out.println("pass : "+textvalue+" enter in "+objName);
			logger.log(LogStatus.PASS,"entered succesfully  "+textvalue);
		}
		else
		{
			System.out.println("Fail : "+objName+" could not enter value ");	
			logger.log(LogStatus.FAIL,"Incorrect  "+textvalue);
		}
	}
	//Wait time
	public static void Wait()
	{
		driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
	}
	/*Title :select checkBox
	 * Arguments    : obj:Name of the WebElement
	 *                objName:Name of the object(user defined)
	 *                textvale:Text to be entered
	 * Last Modified: 29Mar2019           
	 * */
	public static void selectCheckBox(WebElement obj,String objName)
	{
		if(obj==null)
			return;
		try {
			if(obj.isDisplayed())
			{
				if(!obj.isSelected())
				{
					obj.click();
				}
				System.out.println("Pass : checkbox "+objName+" selected ");
				logger.log(LogStatus.PASS," "+objName+ "selected ");
			}}
		catch(org.openqa.selenium.NoSuchElementException e)

		{
			System.out.println("Fail "+objName+" Could not be found ");
			logger.log(LogStatus.FAIL," "+objName+" Could not be found");
		}
	}
	public static void selectOptionButton(WebElement obj,String objName)
	{
		if(obj==null)
			return;
		try {
			if(obj.isDisplayed())
			{
				if(!obj.isSelected())
				{
					obj.click();
				}
				System.out.println("Pass : Option button "+objName+" selected ");
				logger.log(LogStatus.PASS," "+objName+ "selected ");
			}
		}
		catch(org.openqa.selenium.NoSuchElementException e)
		{
			System.out.println("Fail "+objName+" Could not be found ");
			logger.log(LogStatus.FAIL," "+objName+" Could not be found");
		}
	}
	/* Name         : clickButton
	 * Arguments    : obj:Name of the WebElement
	 *                objName:Name of the object(user defined)
	 *                textvale:Text to be entered
	 * Last Modified: 29Mar2019         
	 * */
	public static void clickButton(WebElement obj,String objName)
	{
		if(obj==null)
			return;
		try {
			if(obj.isDisplayed())
			{
				obj.click();
				System.out.println("Pass : "+objName+" click ");
				logger.log(LogStatus.PASS," "+objName+"  click ");
			}}
		catch(org.openqa.selenium.NoSuchElementException e)
		{
			System.out.println("Fail "+objName+"Could not be click");	
			logger.log(LogStatus.FAIL," "+objName+" Could not be click ");
		}
	}
	//Reading data 
	public static String[][] readExceldata(String dataTablepath,String sheetname) throws IOException
	{
		File xlFile=new File(dataTablepath);
		FileInputStream xldoc=new FileInputStream(xlFile);
		HSSFWorkbook wb=new HSSFWorkbook(xldoc);
		HSSFSheet sheet=wb.getSheet(sheetname);
		int iRowcount=sheet.getLastRowNum()+1;
		int iColcount=sheet.getRow(0).getLastCellNum();
		String[][]xldata=new String[iRowcount][iColcount];
		for(int i=0;i<iRowcount;i++)
		{
			for(int j=0;j<iColcount;j++)
			{
				xldata[i][j]=sheet.getRow(i).getCell(j).getStringCellValue();
			}
		}
		return xldata;
	}
	public static boolean validate(String s1,String s2)
	{  
		if(s1.equals(s2))
		{
			logger.log(LogStatus.PASS," Assertion true "+s1);
			return true;
		}
		else
		{
			logger.log(LogStatus.FAIL," Assertion false "+s1);
			return false;
		}	
	}
	//ending report
	public static void EndReport()
	{
		report.endTest(logger);
		report.flush();
		System.out.println("end report");
		driver.quit();
	}

	public void login() throws IOException 
	
		{	
			String[][] recdata=readExceldata("Data/DataFile.xls","Sheet4");
			
			System.out.println("You are on Login page " +findElement(By.xpath("//a[@class='logo']"),"xero Logo").isDisplayed());
			WebElement un=findElement(By.id("email"),"User Name");
			enterText(un,"userName",recdata[0][0]);
			WebElement pass=findElement(By.id("password"),"Pass Word");
			enterText(pass,"PassWrod",recdata[0][1]);
			WebElement lgn=findElement(By.id("submitButton"),"Login");
			clickButton(lgn,"Login");
		}
		
	


}
