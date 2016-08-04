package net.franckbenault.propertybasetesting.integer;

import static org.junit.Assert.assertTrue;

import org.junit.runner.RunWith;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.generator.InRange;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

@RunWith(JUnitQuickcheck.class)
public class IntegerTestCase {

	@Property(trials=5)
	public void testRandom(
			int a, 
			int b) {
		System.out.println("a="+a+", b="+b);
	}
	
	@Property(trials=5)
	public void testAplusBGreaterThanA(
			@InRange(min = "1", max = "99")int a, 
			@InRange(min = "1", max = "99")int b) {
		System.out.println("a="+a+", b="+b);
		assertTrue((a+b) >a);
	}

}
