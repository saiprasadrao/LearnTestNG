package com.mansard.testngman;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FaceBook_Login {
	
	public WebDriver driver = null;
	
	
	@BeforeClass
	public void runBeforeClass() {
		System.out.println("Ran Before Running Facebook Class");
	}
	
	@AfterClass
	public void runAfterClass() {
		System.out.println("Ran AFter Running Facebook Class");
	}
	
	
	@BeforeTest
	public void openFaceBook() {
		
		
		System.out.println("Facebook Before Test");
	}
	
	@Test(groups= {"facebook"})
	public void check_Login_And_Password_Text_Box(){
		System.setProperty("webdriver.chrome.driver","/Users/saiprasadrao/Documents/Projects/automation/drivers/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("-disable-notifications");
		driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).isDisplayed();
		driver.findElement(By.id("pass")).isDisplayed();
		driver.close();
		System.out.println("Completed Running Facebook Test");
	}
	
	@AfterTest
	public void closeBroswer() {
		
		System.out.println("Facebook AFter Test");
	}
	
	

}
