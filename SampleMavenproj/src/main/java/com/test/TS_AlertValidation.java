package main.java.com.test;

import org.testng.Reporter;

import main.java.com.testbase.testbase;
import main.java.com.pages.*;




public class TS_AlertValidation extends testbase{
	
	public void ValidatingAlertBox() {
		
		open("http://demo.guru99.com/test/delete_customer.php");
		Reporter.log("Loging to http://demo.guru99.com/test/delete_customer.php");
		type(PG_AlertValidation.tf_CusID(), "23456");
		 Reporter.log("Type the Cus ID");
		click(PG_AlertValidation.btn_Submit());
		 Reporter.log("Click on Submit button");
	    String getAlertText = SwichtoWindowandGetText();
	    Reporter.log(getAlertText);
	    acceptingAlert();
	    Reporter.log("Accept the Alert");
	
		
	}
	
	

}
