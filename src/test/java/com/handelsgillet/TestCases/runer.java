package com.handelsgillet.TestCases;

import java.util.List;

import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.collections.Lists;

public class runer 
{

	public static void main(String[] args)
	{
		
		TestListenerAdapter tla = new TestListenerAdapter();
		TestNG tng = new TestNG();
		List<String> suites = Lists.newArrayList();
		String xmlFile  = System.getProperty("user.dir")+"/TestNGXmlFile/HGTestSuite.xml";
		suites.add(xmlFile);
		//suites.add("./src/main/resources/HGTestSuite.xml");
		
		tng.setTestSuites(suites);
		tng.run();
	}
}
