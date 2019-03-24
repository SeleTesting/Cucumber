package com.firebase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.firebase.Reuse;
public class HomePage extends Reuse
{
public static void homepageTest() throws InterruptedException
{		
	InitializeDriver();
		InitializePath();
		launch("https://selenium-prd.firebaseapp.com/","HomeTab");
		System.out.println("Application launched succesfully");
		login();
		WebElement Hometab=findElement(By.xpath("//a[contains(text(),'Home')]"),"Hometab");
		clickButton(Hometab,"Home Tab");
		WebElement name=findElement(By.id("name"),"name");
		enterText(name,"name","shweta");
		WebElement lname=findElement(By.id("lname"),"lastname");
		enterText(lname,"lastname","sapare");
		WebElement postalAddress=findElement(By.id("postaladdress"),"postal code");
		enterText(postalAddress,"postal code","California");
		WebElement personalAddress=findElement(By.id("personaladdress"),"personal address");
		enterText(personalAddress,"personal address","California");
		WebElement gender=findElement(By.xpath("//input[@value='female']"),"sex");
		clickButton(gender,"sex");
		WebElement city=findElement(By.id("city"),"city");
		Select select=new Select(city);
		select.selectByValue("goa");
		Thread.sleep(3000);
		Select course=new Select(findElement(By.name("course"),"course"));
		course.selectByVisibleText("MCA");
		Select district=new Select(findElement(By.id("district"),"district"));
		district.selectByIndex(2);
		Thread.sleep(3000);
		Select state=new Select(findElement(By.id("state"),"state"));
		state.selectByValue("bca");
		WebElement pincodes=findElement(By.id("pincode"),"pincode");
		enterText(pincodes,"pincode","12345");
		WebElement emailid=findElement(By.id("emailid"),"email");
		emailid.sendKeys("shweta@gmail.com");
		Thread.sleep(5000);
		WebElement submit=findElement(By.xpath("//button[@class='bootbutton']"),"submit");
		clickButton(submit,"submit");
		EndReport();
}

}
