package net.franckbenault.propertybasetesting;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

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

	@BeforeClass
	public static void beforeClass() {
		System.out.println("beforeClass");
	}
	
	@Before
	public void before() {
		System.out.println("before");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("afterClass");
	}
	
	@After
	public void after() {
		System.out.println("after");
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
