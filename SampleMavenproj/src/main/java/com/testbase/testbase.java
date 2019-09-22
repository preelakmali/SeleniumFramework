package main.java.com.testbase;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;

import main.java.com.runtime.Helper;

//import javafx.scene.control.Alert;
import org.openqa.selenium.Alert;

public class testbase extends Helper{

	public void type(final WebElement element , String text)
	{
		try {
			element.sendKeys(text);
		} catch (NoSuchElementException e) {
		    System.out.println(element + " is not available" + e);
		}
	}
	
	public void click(final WebElement element ){
		try {
			element.click();
			
		} catch (NoSuchElementException e) {
			System.out.println(element + "is not available" + e);
		}
		
	}
	public void open(String url){
		
		try {
			driver.get(url);
			
		} catch (Exception e) {
			System.out.println(url + "is not working"+e);
		}
		
	}
	public String SwichtoWindowandGetText() {
		  // Switching to Alert     
		
		return driver.switchTo().alert().getText();	
		

	}
	
	public void acceptingAlert() {
	  driver.switchTo().alert().accept();
	}
	
	public void pause(int pauseTime){
		
		try {
			Thread.sleep(pauseTime);
			
		} catch (Exception e) {
			System.out.println("Pause time is not woking "+ e);
		}
	}
}
