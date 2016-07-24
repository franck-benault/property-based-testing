package net.franckbenault.propertybasedtesting.bool;

import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

/**
 * here no need datapoint(s) to prepare the data
 * @author Franck Benault
 *
 */
@RunWith(Theories.class)
public class BooleanTestCase {

	@Theory
	public void testBooleanV1(boolean b) {
		System.out.println("b="+b);
	}
	
	/**
	 * 
	 * @param b Boolean but the null value is not tested
	 */
	@Theory
	public void testBooleanV2(Boolean b) {
		System.out.println("B="+b);
	}
}
