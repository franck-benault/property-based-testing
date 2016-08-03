package net.franckbenault.propertybasetesting.floats;

import static org.quicktheories.quicktheories.QuickTheory.qt;
import static org.quicktheories.quicktheories.generators.SourceDSL.floats;

import org.junit.Ignore;
import org.junit.Test;

public class FloatTestCase {
	
	private int counter =0;

	private boolean printOK(float f) {
		counter++;
		System.out.println("counter="+counter+ " f="+f);
		return true;
	}
	
	@Test
	public void testAllFloat() {
		counter =0;
		qt()
	    .forAll(floats().allFloats())
	    .check((f) -> printOK(f)); 
	}
	
	/**
	 * all positive
	 */
	@Test
	public void testAllPositiveFloat() {
		counter =0;
		qt()
	    .forAll(floats().fromZeroToFloatMax())
	    .check((f) -> printOK(f)); 
	}
	
	

	@Test
	public void testAllNegativeFloat() {
		counter =0;
		qt()
	    .forAll(floats().fromNegativeFloatMaxToNegativeZero())
	    .check((f) -> printOK(f)); 
	}

	
	
	@Test
	public void testFloatFromZeroToOne() {
		counter =0;
		qt()
	    .forAll(floats().fromZeroToOne())
	    .check((f) -> printOK(f)); 
	}
	
	
}
