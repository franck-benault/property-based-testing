package net.franckbenault.propertybasedtesting.integer.supplier;

import static org.junit.Assert.*;

import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import net.franckbenault.propertybasedtesting.integer.supplier.BetweenParameterSupplier.Between;

@RunWith(Theories.class)
public class IntegerTestCase {
	


	@Theory
	public void testAplusBGreaterThanA(
			@Between(first = 10, last=13)int a, 
			@Between(first = 10, last=13) int b) {
		System.out.println("a="+a+", b="+b);
		assertTrue((a+b) >a);
	}

}
