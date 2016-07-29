package net.franckbenault.propertybasetesting;

import static org.junit.Assert.*;
import static org.quicktheories.quicktheories.QuickTheory.qt;
import static org.quicktheories.quicktheories.generators.SourceDSL.*;

import org.junit.Test;

public class SimpleJUnitTestCase {
	
	private int counter =0;
	
	private boolean isSomePositive(int i, int j ) {
		counter++;
		System.out.println("counter "+counter+", i="+i+", j="+j);  
		return i + j > 0;
	}

	  @Test
	  public void addingTwoPositiveIntegersAlwaysGivesAPositiveInteger(){
	    qt()
	    .forAll(integers().from(1).upTo(3000000)
	          , integers().from(1).upTo(3000000))
	    .check((i,j) -> isSomePositive(i,j)); 
	  }

}
