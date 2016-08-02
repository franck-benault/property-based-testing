package net.franckbenault.propertybasetesting;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertTrue;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

/**
 * 
 * simple test class
 * to show that JunitQuickcheck is compliant
 * with junit classic annotation @Test @Before ...
 *
 */
@RunWith(JUnitQuickcheck.class)
public class DummyTestCase {

	private static String fullLog ="";
	
	@BeforeClass
	public static void beforeClass() {
		fullLog+="BeforeClass";
		assertTrue(fullLog.equals("BeforeClass"));
		System.out.println("BeforeClass");
	}
	
	@Before
	public void before() {
		fullLog+="Before";
		assertTrue(fullLog.startsWith("BeforeClassBefore"));
		System.out.println("Before");
	}
	
	@AfterClass
	public static void afterClass() {
		fullLog+="AfterClass";
		assertTrue(fullLog.equals("BeforeClassBeforeAfterBeforeAfterBeforeAfterBeforeAfterAfterClass"));
		System.out.println("AfterClass");
	}
	
	@After
	public void after() {
		fullLog+="After";
		assertTrue(fullLog.startsWith("BeforeClassBeforeAfter"));
		System.out.println("After");
	}
	
	@Test
	public void test1() {
		System.out.println("test1");
	}

	@Test
	public void test2() {
		System.out.println("test2");
	}
	
	@Property(trials=2)
	public void testTheory(boolean b) {
		System.out.println("testQuickcheck b="+b);
	}
}
