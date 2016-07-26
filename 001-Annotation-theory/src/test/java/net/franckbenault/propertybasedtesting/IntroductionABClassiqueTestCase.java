package net.franckbenault.propertybasedtesting;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/**
 * 
 * @author Franck Benault
 * 
 * a_plus_b_greater_than_a_and_greater_than_b
 * For all a,b>0
 * the following is true 
 * a+b>a and a+b>b
 * 
 * classique examples
 *
 */
public class IntroductionABClassiqueTestCase {
	
	/**
	 * this test is an example
	 */
	@Test
	public void a_plus_b_greater_than_a_and_greater_than_b_test() {
		int a =2;
		int b =3;
		assertTrue(a+b > b);
		assertTrue(a+b > a);
	}
	
	/**
	 * several values
	 * but hard-coded
	 * using loop
	 */
	@Test
	public void a_plus_b_greater_than_a_and_greater_than_b_multiple_values_test() {
		List<Integer> values = Arrays.asList(1,2,300,4000000);
		for(Integer a: values) {
			for(Integer b:values) {
				assertTrue(a+b > b);
				assertTrue(a+b > a);
			}
		}
	}	

}
