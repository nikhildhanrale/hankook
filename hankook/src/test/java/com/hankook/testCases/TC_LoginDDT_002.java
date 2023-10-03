package com.hankook.testCases;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.hankook.pageObject.LoginPage;
import com.hankook.utilities.XLUtils;

public class TC_LoginDDT_002 extends BaseClass
{

	@Test(dataProvider="LoginData")
	public void loginDDT(String user,String pwd) throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.clickLogPopUp();
		Thread.sleep(2000);

		lp.clickFLogBtn();
		Thread.sleep(3000);

		lp.setUserName(user);
		Thread.sleep(2000);

		lp.setPassword(pwd);
		Thread.sleep(2000);

		lp.clickSubmit();
		
		Thread.sleep(2000);
		
		lp.clickLogOutPopUp();
		Thread.sleep(2000);
		
		lp.clickLogout(); 
		System.out.println("Login Successful"); 
		Thread.sleep(2000);
		 
		
		
		/*
		 * if(isAlertPresent()==true) { driver.switchTo().alert().accept();//close alert
		 * driver.switchTo().defaultContent(); Assert.assertTrue(false); } else {
		 * Assert.assertTrue(true); lp.clickLogout(); Thread.sleep(3000);
		 * driver.switchTo().alert().accept();//close logout alert
		 * driver.switchTo().defaultContent();
		 * 
		 * }
		 */
		 
		
		
	}
	
	
	public boolean isAlertPresent() //user defined method created to check alert is presetn or not
	{
		try
		{
		driver.switchTo().alert();
		return true;
		}
		catch(NoAlertPresentException e)
		{
			return false;
		}
		
	}
	
	
	@DataProvider(name="LoginData")
	String [][] getData() throws IOException
	{
		String path=System.getProperty("user.dir")+"/src/test/java/com/hankook/testData/LoginData.xlsx";
		//String path="/home/shanti/eclipse-workspace/Trav/hankook/src/test/java/com/hankook/testData/LoginData.xlsx";

		int rownum=XLUtils.getRowCount(path, "Sheet1");
		int colcount=XLUtils.getCellCount(path,"Sheet1",1);
		
		String logindata[][]=new String[rownum][colcount];
		
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				logindata[i-1][j]=XLUtils.getCellData(path,"Sheet1", i,j);//1 0 - 1 1 - 2 0 - 2 1 
			}
				
		}
	return logindata;
	}
	
}
