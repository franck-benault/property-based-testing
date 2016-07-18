package net.franckbenault.propertybasedtesting;

import static org.junit.Assert.*;

import org.junit.Assume;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

/**
 * 
 * @author Franck Benault
 * 
 * a_plus_b_greater_than_a_and_greater_than_b
 * For all a,b>0
 * the following is true 
 * a+b>a and a+b>b
 *
 */
@RunWith(Theories.class)
public class IntroductionABTheoryAndAssumeTestCase {

	@DataPoints
	public static int[] positiveIntegers() {
		return new int[] {-12, -5, 1 ,10 , 123456};
	}
	
	
	/**
	 * a and are coming from DataPoints method 
	 * Assume is removing negative values
	 * 
	 * @param a
	 * @param b
	 */
	@Theory
	public void a_plus_b_greater_than_a_and_greater_than_b_test(int a, int b) {
		Assume.assumeTrue(a >0 && b> 0);
		
		System.out.println("a="+a +" b="+b);
		assertTrue(a+b > b);
		assertTrue(a+b > a);
	}
	
	

}
