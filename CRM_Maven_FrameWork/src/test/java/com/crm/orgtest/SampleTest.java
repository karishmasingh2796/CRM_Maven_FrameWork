package com.crm.orgtest;

import org.testng.annotations.Test;

public class SampleTest {
	@Test
	public void getMvnDatatest() {
//		System.out.println(System.getProperty("url"));
		//System.out.println(System.getProperty("username"));
		
		//System.out.println(System.getProperty("password"));
		
		String url = System.getProperty("url");
		System.out.println("********************************************"+url+"*********************************");
		
	}

}
