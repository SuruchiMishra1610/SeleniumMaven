package testcases;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import pages.LoginPage;

public class LoginTestSimplilearn extends BaseClass{

	@Test
	public void Test1() {
	
		test.log(LogStatus.INFO, "Test 1 Started");
		
		LoginPage lp = new LoginPage(driver);
		lp.Login("Abc@xyz.com","Abc@1234");
		
		
		WebElement Errormsg = driver.findElement(By.id("msg_box"));
		String ActError = Errormsg.getText();
		String ExpError = "The email or password you have entered is invalid.";
		
		Assert.assertTrue(Errormsg.isDisplayed());
		Assert.assertEquals(ActError, ExpError);
		
	}
			
	@Test
	@Parameters({"uname","pwd"})
		public void Test2(String UserName, String Password) {
			
		test.log(LogStatus.INFO, "Test 2 Started");
		LoginPage lp = new LoginPage(driver);
		lp.Login(UserName,Password);
			
			
		}
	

   @Test
	public void Test3() {
	
	test.log(LogStatus.INFO, "Test 3 Started");
	String UserName = sheet.getRow(1).getCell(0).getStringCellValue();
	String Password = sheet.getRow(1).getCell(1).getStringCellValue();
		
	LoginPage lp = new LoginPage(driver);
	lp.Login(UserName,Password);
		
		
	}
}

