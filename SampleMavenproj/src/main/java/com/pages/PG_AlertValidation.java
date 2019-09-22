package main.java.com.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import main.java.com.runtime.Helper;



public class PG_AlertValidation extends Helper {
	
	public static WebElement tf_CusID()
	{
		return driver.findElement(By.xpath("//input[@name = 'cusid']"));
	}
	public static WebElement btn_Submit() {
		
		return driver.findElement(By.xpath("//input[@name = 'submit']"));
		
	}
}
