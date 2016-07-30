package net.franckbenault.propertybasetesting.integer;

import static org.quicktheories.quicktheories.QuickTheory.qt;
import static org.quicktheories.quicktheories.generators.SourceDSL.integers;

import org.junit.Test;

public class IntegerTestCase {

	private boolean printOK(int i) {
		System.out.println("i="+i);
		return true;
	}
	
	/**
	 * Seed = the random generated values are always the same...
	 */
	@Test
	public void testAllIntegerWithSeed() {
		qt()
		.withFixedSeed(0)
	    .forAll(integers().all())
	    .check((i) -> printOK(i)); 
	}
	
	/**
	 * all positive
	 */
	@Test
	public void testAllPositiveInteger() {
		qt()
		.withFixedSeed(0)
	    .forAll(integers().allPositive())
	    .check((i) -> printOK(i)); 
	}
	
	/**
	 * all positive
	 */
	@Test
	public void testAllNegativeIntegerUsingAssuming() {
		qt()
		.withFixedSeed(0)
	    .forAll(integers().all())
	    .assuming(i -> i <0)
	    .check((i) -> printOK(i)); 
	}

}
