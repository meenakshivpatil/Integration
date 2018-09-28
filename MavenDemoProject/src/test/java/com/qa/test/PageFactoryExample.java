package com.qa.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.Page.LoginPage;

public class PageFactoryExample {
	
	public void a1()
	{
		System.out.println("TestClass1");
	}
	
	public void a2()
	{
		System.out.println("TestClass1");
	}

	//public static WebDriver driver;
	LoginPage loginPage;
	
	@BeforeMethod
	  public void setUp()
	  {
		  
			System.setProperty("webdriver.gecko.driver", "C:\\Eclipse\\EclipseMyWorkspace\\geckodriver.exe");
			LoginPage.driver = new FirefoxDriver();
			LoginPage.driver.get("http://anyaut.com/orange");
			LoginPage.driver.manage().window().maximize();
			LoginPage.driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	  }
	
	@Test
	  public void loginActiTimeApp()
	  {
		  //creating loginPage object through page factory 
		loginPage=PageFactory.initElements(LoginPage.driver, LoginPage.class); 
		
		loginPage.validLogin("meenakshivpatil@gmail.com","Test!1234");
			
		//Wait<WebDriver> wait= new WebDriverWait(driver,50);
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("logout")));
			
			
	  }  
	@AfterMethod
	public void tearDown()
	{
		LoginPage.driver.quit();
	}
	
	
	
}
