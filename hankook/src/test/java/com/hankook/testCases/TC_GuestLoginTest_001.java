package com.hankook.testCases;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.AssertJUnit;
import java.io.IOException;
import com.hankook.pageObject.LoginPage;

public class TC_GuestLoginTest_001 extends BaseClass
{

	@Test
	public void loginTest() throws Throwable 
	{
		LoginPage lp=new LoginPage(driver);
		
		Thread.sleep(1000);
		
		lp.clickLogPopUp();
		Thread.sleep(2000);

		lp.clickFLogBtn();
		Thread.sleep(1000);

		lp.setUserName(username);
		Thread.sleep(2000);

		lp.setPassword(password);
		Thread.sleep(1000);

		lp.clickSubmit();
		Thread.sleep(2000);
		System.out.println("Login Successful");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,10000)", "");
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(1000);
		//WebElement celement = driver.findElement(By.xpath("//body/section[1]/div[2]/div[1]/div[1]/div[1]/div[4]/button[1]/img[1]"));
		WebElement celement = driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[3]/h1[1]"));

		js.executeScript("arguments[0].scrollIntoView();", celement);
		Thread.sleep(2000);

		/*
		 * if(driver.getTitle().equals("Hankook")) { AssertJUnit.assertTrue(true); }
		 * else { captureScreen(driver,"loginTest"); AssertJUnit.assertTrue(false); }
		 */
		
		lp.clickLogOutPopUp();
		Thread.sleep(1000);

		lp.clickLogout();
		System.out.println("Login Successful");

		Thread.sleep(3000);
		
	}
}
