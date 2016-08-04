package net.franckbenault.propertybasetesting.bool;

import org.junit.runner.RunWith;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.generator.ValuesOf;
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
	
	@Property(trials=5)
	public void testTwoBooleanV1(boolean b1, boolean b2) {
		System.out.println("b1="+b1+" b2="+b2);
	}
	
	/**
	 *  annotation ValueOf 
	 *  there is no more random generation
	 *  but the generation follow all the possible values 
	 * @param b1
	 * @param b2
	 */
	@Property(trials=5)
	public void testTwoBooleanV2(
			@ValuesOf boolean b1, @ValuesOf boolean b2) {
		System.out.println("--b1="+b1+" b2="+b2);
	}
}
