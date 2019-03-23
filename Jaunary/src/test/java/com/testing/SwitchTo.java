package com.testing;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SwitchTo extends Reuse{

	public static void switchTest() throws InterruptedException {
		InitializeDriver();
		InitializePath();
		launch("https://selenium-prd.firebaseapp.com/","SwitchTab");
		System.out.println("Application launched succesfully");
		login();
		WebElement switchto=findElement(By.xpath("//button[contains(text(),'Switch To')]"),"switch tab");
		Actions action=new Actions(driver);
		action.moveToElement(switchto).build().perform();
		findElement(By.xpath("//a[contains(text(),'Alert')]"),"Alert").click();
		findElement(By.xpath("//button[contains(text(),'Window Alert')]"),"Window alert").click();
		Alert al=driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();  
		Thread.sleep(3000);
		WebElement prompt=findElement(By.xpath("//button[contains(text(),'Promt Alert')]"),"Prompt Alert");
		clickButton(prompt,"Prompt alert");
		Thread.sleep(4000);
		Alert alert=driver.switchTo().alert();
		alert.sendKeys("shweta");	
		alert.accept();  
		System.out.println(findElement(By.xpath("//*[@id=\"Selenium\"]"),"Prompt Alert msg").getText());
		EndReport();
	}

}
