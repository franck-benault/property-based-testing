package net.franckbenault.propertybasedtesting.integer;

import static org.junit.Assert.*;

import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.experimental.theories.suppliers.TestedOn;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class IntegerTestedOnTestCase {
	


	@Theory
	public void testAplusBGreaterThanA(
			@TestedOn(ints ={1,5,456})int a, 
			@TestedOn(ints ={2,5,58})int b) {
		System.out.println("a="+a+", b="+b);
		assertTrue((a+b) >a);
	}

}
