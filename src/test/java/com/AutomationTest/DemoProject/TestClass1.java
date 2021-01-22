package com.AutomationTest.DemoProject;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class TestClass1 {
   public static WebDriver driver;
   
   @BeforeMethod
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\project\\chromedriver.exe");
		driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
	}
	@Test
	public void Test1()
	{
		driver.navigate().to("https://automationtalks.com/");
		System.out.println("Test 1 title is "+driver.getTitle());
	}
	@Test
	public void Test2()
	{
		driver.navigate().to("https://automationtalks.com/");
		System.out.println("Test 2 title is "+driver.getTitle());
	}
	@Test
	public void Test3()
	{
		driver.navigate().to("https://automationtalks.com/");
		System.out.println("Test 3 title is "+driver.getTitle());
	}
	
	
}
