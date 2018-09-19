package com.mansard.testngman;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestAnnotations {
	
	@BeforeMethod
	public void getData() {
		System.out.println("Before Method : Fetched Data");
	}

	@BeforeClass
	public static void setupEnvironment() {
		System.out.println("Before Class : Environment is Ready for Test1");
		
	}
	
	@Test
	public void addProductToShoppingCart() {
		System.out.println("Test1 : Browser is Opened Successfully");
	}
	
	@Ignore
	@Test
	public void navigateToSite() {
		System.out.println("Test2 : Nagivated to Site");
	}
	
	
	@AfterMethod
	public void generateTestResult() {
		System.out.println("After Method : Results Generated");
	}
	
	@AfterClass
	public static void cleanupEnvironment() {
		System.out.println("After Class : Environment is Cleaned after Test1");
	}

}
