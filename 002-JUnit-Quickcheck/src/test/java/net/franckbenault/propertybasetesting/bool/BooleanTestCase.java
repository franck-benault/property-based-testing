package net.franckbenault.propertybasetesting.bool;

import org.junit.runner.RunWith;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;



@RunWith(JUnitQuickcheck.class)
public class BooleanTestCase {

	@Property(trials=5)
	public void testBooleanV1(boolean b) {
		System.out.println("b="+b);
	}
	
	@Property(trials=5)
	public void testBooleanV2(Boolean b) {
		System.out.println("B="+b);
	}
}
