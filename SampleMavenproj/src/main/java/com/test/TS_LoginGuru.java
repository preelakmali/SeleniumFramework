package main.java.com.test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import main.java.com.pages.*;
import main.java.com.testbase.testbase;



public class TS_LoginGuru extends testbase {

	
	@DataProvider(name  = "tc_loginToGurru99" )
	public Object[][] dataTable_tc_loginToGurru99() throws IOException{
		return main.java.com.utils.DataProvider.readExcel("tc_loginToGurru99"); 
	}
	
	@Test(dataProvider = "tc_loginToGurru99")
	public void tc_loginToGurru99(final String tc_name ,final String url , final String email ,final String password)
	{
		open(url);
		Reporter.log("Login to " +url + "Succesfuly");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		type(PG_Home.tf_UserName(), email);
		Reporter.log("Enter the Username"+email);
		type(PG_Home.tf_Password(), password);
		pause(2000);
		Reporter.log("Enter the Password ");
		click(PG_Home.btn_Click());
		Reporter.log("Login is completed");
		pause(4000);
		
	}
	
	
	
}
