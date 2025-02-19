package com.MyTests;

import org.testng.annotations.Test;

public class D04GetData {
  @Test(dataProvider = "getData", dataProviderClass = com.MyTests.MyData.class)
  public void displayData(int n, String nm) {
	  System.out.println(n);
	  System.out.println(nm);
  }
}
