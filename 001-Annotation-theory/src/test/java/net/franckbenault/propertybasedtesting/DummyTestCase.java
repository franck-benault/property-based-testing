package net.franckbenault.propertybasedtesting;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

/**
 * 
 * simple test class
 * to show that @Theory is compliant
 * with junit classic @Test @Before ...
 *
 */
@RunWith(Theories.class)
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
	
	@Theory
	public void testTheory(boolean b) {
		System.out.println("testTheory b="+b);
	}
}
