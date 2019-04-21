package com.TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Tc_01 {
	
	@Test
	
	public static void doBrowserLaunch()
	{
		WebDriver driver=new FirefoxDriver();
		
		
		driver.get("https://www.google.com");
		
		
		
		
	}
	

}
