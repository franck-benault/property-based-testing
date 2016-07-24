package net.franckbenault.propertybasedtesting.enumeration;

import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;


@RunWith(Theories.class)
public class EnumerationTestCase {


	public static enum JDKS {
		JDK6, JDK7,
	}

	@Theory
	public void testFoo(JDKS j) throws Exception {
		System.out.println("jdk:" + j);
	}

}
