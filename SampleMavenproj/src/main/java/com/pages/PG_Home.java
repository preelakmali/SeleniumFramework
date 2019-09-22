package main.java.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import main.java.com.runtime.Helper;

public class PG_Home extends Helper{
	
	public static WebElement tf_UserName()
	{
		return driver.findElement(By.xpath("//input[@id ='email']"));
	}
	
	public static WebElement tf_Password()
	{
		return driver.findElement(By.xpath("//input[@id ='passwd']"));
	}
	
	public static WebElement btn_Click()
	{
		return driver.findElement(By.xpath("//button[@id ='SubmitLogin']")) ; 
	}
	public static WebElement LoginSuccess()
	{
		return driver.findElement(By.xpath("//*[contains(text(),'Successfully Logged in...')]"));
	}

	
}
