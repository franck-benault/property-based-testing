package net.franckbenault.propertybasedtesting;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



/**
 * 
 * simple test class
 * show the compliance with testNG functionalities
 * DataProvider example comming from TestNG site
 *
 */
public class DummyTestCase {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("beforeClass");
	}
	
	@BeforeMethod
	public void before() {
		System.out.println("beforeMethod");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("afterClass");
	}
	
	@AfterMethod
	public void after() {
		System.out.println("afterMethod");
	}
	
	@Test
	public void test1() {
		System.out.println("test1");
	}

	@Test
	public void test2() {
		System.out.println("test2");
	}
	
	@DataProvider(name = "test1")
	public Object[][] createData1() {
	 return new Object[][] {
	   { "Cedric", new Integer(36) },
	   { "Anne", new Integer(37)},
	 };
	}
	 
	//This test method declares that its data should be supplied by the Data Provider
	//named "test1"
	@Test(dataProvider = "test1")
	public void verifyData1(String n1, Integer n2) {
	 System.out.println(n1 + " " + n2);
	} 
	

}
