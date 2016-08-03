package net.franckbenault.propertybasetesting.booleans;

import static org.quicktheories.quicktheories.QuickTheory.qt;
import static org.quicktheories.quicktheories.generators.SourceDSL.booleans;

import org.junit.Test;

public class BooleanTestCase {

	private int counter;
	
	private boolean printOK(boolean b1, boolean b2) {
		counter++;
		System.out.println("counter="+counter+ " b1="+b1+" b2="+b2);
		return (b1&&b2) == (b2&&b1);
	}
	
	/**
	 * Seed = the random generated values are always the same...
	 */
	@Test
	public void testAllIntegerWithSeed() {
		counter =0;
		qt()
		.withFixedSeed(0)
	    .forAll(booleans().all(), booleans().all())
	    .check((b1,b2) -> printOK(b1,b2)); 
	}

}
