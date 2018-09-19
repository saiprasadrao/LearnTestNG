package com.mansard.testngman;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


@Listeners(TestListeners.class)
//
public class SampleTest2 {
	
	@BeforeClass
	public void runBeforeClass() {
		System.out.println("Ran Before Running Class");
	}
	
	@AfterClass
	public void runAfterClass() {
		System.out.println("Ran AFter Running Class");
	}
	
	
	@BeforeTest
	public void validateLink() {
		System.out.println("Link is Working");
	}

	
	@Parameters({"first-name","last-name"})
	@Test(groups= {"sample-test"})
	public void testCase1(String fname, String lname) {
		System.out.println("Executing Test Case 1");
		System.out.println(fname + " " + lname );
//		assertEquals(fname, "Saii", "Both are Equal");
//		assertFalse(fname.equals("Saii"));
//		assertTrue(fname.equals("Sai"));
		assert "Saii".equals(fname);
		
//		Assert.fail("I want to fail this test");
	}
	
	
	@AfterTest
	public void logout() {
		System.out.println("Logging out of the system");
	}
}
