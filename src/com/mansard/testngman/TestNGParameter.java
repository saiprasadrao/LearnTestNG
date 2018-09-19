package com.mansard.testngman;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGParameter {
	
	@DataProvider
	public Object[][] getData(){
		Object[][] data = new Object[2][3];
		
		data[0][0] = "Sai";
		data[0][1] = "Rao";
		data[0][2] = 30;
	
		data[1][0] = "SPRao";
		data[1][1] = "Test";
		data[1][2] = 20;
	
		return data;
	}

	@Test(dataProvider="getData")
	public void useData(String firstname, String lastname,int age) {
		System.out.println(firstname+" "+lastname+" "+age);
	}
	
}
