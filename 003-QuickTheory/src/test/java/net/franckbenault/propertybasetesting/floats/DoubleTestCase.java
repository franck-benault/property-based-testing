package net.franckbenault.propertybasetesting.floats;

import static org.quicktheories.quicktheories.QuickTheory.qt;
import static org.quicktheories.quicktheories.generators.SourceDSL.doubles;

import org.junit.Test;

public class DoubleTestCase {
	
	private int counter =0;

	private boolean printOK(double d) {
		counter++;
		System.out.println("counter="+counter+ " d="+d);
		return true;
	}
	
	@Test
	public void testAllDouble() {
		counter =0;
		qt()
	    .forAll(doubles().allDoubles())
	    .check((d) -> printOK(d)); 
	}
	
	/**
	 * all positive
	 */
	@Test
	public void testAllPositiveDouble() {
		counter =0;
		qt()
	    .forAll(doubles().fromZeroToDoubleMax())
	    .check((f) -> printOK(f)); 
	}
	
	

	@Test
	public void testAllNegativeDouble() {
		counter =0;
		qt()
	    .forAll(doubles().fromNegativeDoubleMaxToNegativeZero())
	    .check((d) -> printOK(d)); 
	}

	
	
	@Test
	public void testFloatFromZeroToOne() {
		counter =0;
		qt()
	    .forAll(doubles().fromZeroToOne())
	    .check((d) -> printOK(d)); 
	}
	
	
}
