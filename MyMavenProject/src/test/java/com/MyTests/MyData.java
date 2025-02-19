package com.MyTests;

import org.testng.annotations.DataProvider;

public class MyData {
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = { {1, "simram"},
							{2, "Pavan"},
							{3, "Mohit"}};
		
		return data;
	}

}
