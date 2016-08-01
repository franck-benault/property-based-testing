package net.franckbenault.propertybasetesting.lists;

import static org.quicktheories.quicktheories.QuickTheory.qt;
import static org.quicktheories.quicktheories.generators.SourceDSL.integers;
import static org.quicktheories.quicktheories.generators.SourceDSL.lists;

import java.util.List;

import org.junit.Test;

public class ListTestCase {
	
	private int counter =0;

	private boolean printOK(List l) {
		counter++;
		System.out.println("counter="+counter+ " l="+l);
		return true;
	}
	

	
	@Test
	public void testListOfInteger() {
		counter =0;
		qt()
		.withFixedSeed(0)
	    .forAll(lists().allListsOf(integers().all()).ofSize(10))
	    .check((i) -> printOK(i)); 
	}
	
}
