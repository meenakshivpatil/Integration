package com.qa.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.*;



//import com.qa.test.PageFactoryExample;

//import com.qa.test.PageFactoryExample;

public class LoginPage {
	public static WebDriver driver;
	
	public void a1()
	{
		System.out.println("LoginPage executed");
	}


	@FindBy(id="username")
	public WebElement userNameField;
	
	@FindBy(id="password")
	public WebElement passwordField;
	
	@FindBy(xpath="//*[@id=\"singlebutton\"]")
	public WebElement login;
	
	/*public Object VerifyTitle(String expTitle)
	{
		try 
		{
			System.out.println("expTitle => " + expTitle + "driver.getTitle => " +driver.getTitle());
			if(expTitle.contentEquals(driver.getTitle()))
			{
				return true;
			}
			else return false;
		}catch(Exception e)
		{
			System.out.println(e);
		}
		return null;
	}*/
	public boolean verifyTitle()
	{
		try 
		{
			Assert.assertEquals("anyAUT - AUTOMATE ANY APPLICATION UNDER TEST", driver.getTitle());
		} 
		catch (Exception e)
		{
			return false;
		}return true;
	}
	
	public void validLogin(String userName, String password)
	{
		userNameField.clear();
		userNameField.sendKeys(userName);
		passwordField.clear();
		passwordField.sendKeys(password);
		login.click();
	}
	public void LoginValidationWithNoInputs()
	{
		login.click();
	}

}
