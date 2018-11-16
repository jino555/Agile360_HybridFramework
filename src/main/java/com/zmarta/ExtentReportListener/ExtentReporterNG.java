package com.zmarta.ExtentReportListener;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ExtentReporterNG {
	
	WebDriver driver;
	
	@Test
	public void get() {
	System.setProperty("webdriver.chrome.driver", "E:\\Jino_testing\\Automation_project\\Selenium_datadrivenframework\\Drivers\\chromedriver.exe");
	 
	
	 driver=new ChromeDriver();
	 driver.get("https://staging.zmarta.se/lana-pengar/privatlan/ansok/1");
	 //Select dropdown = new Select( driver.findElement(By.id("lykc")));
	 //dropdown.selectByValue("1");
	 
	 //driver.findElement(By.id("lykc"))
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
}