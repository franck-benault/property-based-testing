package net.franckbenault.propertybasedtesting;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 * @author Franck Benault
 * For all a,b>0
 * the following is true 
 * a+b>a and a+b>b
 *
 */
public class IntroductionABTestCase {

	@Test
	public void a_plus_b_greater_than_a_and_greater_than_b_test() {
		int a =2;
		int b =3;
		assertTrue(a+b > b);
		assertTrue(a+b > a);
		
	}

}
