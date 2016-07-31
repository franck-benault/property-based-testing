package net.franckbenault.propertybasetesting.integer;

import static org.quicktheories.quicktheories.QuickTheory.qt;
import static org.quicktheories.quicktheories.generators.SourceDSL.integers;

import org.junit.Ignore;
import org.junit.Test;

public class IntegerTestCase {
	
	private int counter =0;

	private boolean printOK(int i) {
		counter++;
		System.out.println("counter="+counter+ " i="+i);
		return true;
	}
	
	/**
	 * Seed = the random generated values are always the same...
	 */
	@Test
	public void testAllIntegerWithSeed() {
		counter =0;
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
		counter =0;
		qt()
		.withFixedSeed(0)
	    .forAll(integers().allPositive())
	    .check((i) -> printOK(i)); 
	}
	
	/**
	 * shrinking
	 * excepted smallest value 23
	 */
	@Test
	@Ignore
	public void testIntegerShrinking() {
		counter =0;
		qt()
		.withFixedSeed(0)
	    .forAll(integers().from(23).upTo(100000))
	    .check((i) -> i>43); 
	}
	
	/**
	 * all negative using assuming
	 */
	@Test
	public void testAllNegativeIntegerUsingAssuming() {
		counter =0;
		qt()
		.withFixedSeed(0)
	    .forAll(integers().all())
	    .assuming(i -> i <0)
	    .check((i) -> printOK(i)); 
	}

	
	
	@Test
	public void testBetween() {
		counter =0;
		qt()
		.withFixedSeed(0)
	    .forAll(integers().between(1, 100))
	    .check((i) -> printOK(i)); 
	}
	
	/**
	 * other version for between
	 */
	@Test
	public void testFromUpTo() {
		counter =0;
		qt()
		.withFixedSeed(0)
	    .forAll(integers().from(1).upTo(100))
	    .check((i) -> printOK(i)); 
	}
}
