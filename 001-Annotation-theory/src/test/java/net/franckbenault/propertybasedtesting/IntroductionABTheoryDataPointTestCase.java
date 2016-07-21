package net.franckbenault.propertybasedtesting;

import static org.junit.Assert.*;

import org.junit.experimental.theories.DataPoint;
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
public class IntroductionABTheoryDataPointTestCase {

	@DataPoint
	public static int a=2;
	
	@DataPoint
	public static int b=6;
	
	@DataPoint
	public static int c=12;
	
	
	
	/**
	 * a and are coming from DataPoints method 
	 * @param a
	 * @param b
	 */
	@Theory
	public void a_plus_b_greater_than_a_and_greater_than_b_test(int a, int b) {
		System.out.println("a="+a +" b="+b);
		assertTrue(a+b > b);
		assertTrue(a+b > a);
	}
	
	

}
