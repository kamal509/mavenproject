package com.demo;

import org.testng.annotations.Test;

import com.thoughtworks.qdox.tools.QDoxTester.Reporter;

public class DemoJenkins 
{
	@Test
	
	public void login()
	{
		org.testng.Reporter.log("oprn on username",true);
		
	}
	
	@Test
	public void details()
	{
		org.testng.Reporter.log("enter username",true);
	}
	
	@Test
	public void password()
	{
		org.testng.Reporter.log("enter password", true);
	}

}
