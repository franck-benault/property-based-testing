package net.franckbenault.propertybasedtesting.enumeration.bug;

import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

/**
 * {@link} https://github.com/junit-team/junit4/issues/673
 * 
 * issue : the enumeration is not populated
 *
 */
@RunWith(Theories.class)
public class Bug673TestCase {

	@DataPoints
	public static String[] platforms = new String[] { "windows", "linux", null };

	public static enum JDKS {
		JDK6, JDK7,
	}

	@Theory
	public void testFoo(String platform, boolean truth, JDKS j) throws Exception {
		System.out.println(platform + ":" + truth + ":" + j);
	}

}
