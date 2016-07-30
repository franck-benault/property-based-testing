package net.franckbenault.propertybasetesting;

import org.testng.annotations.Test;

import static org.quicktheories.quicktheories.QuickTheory.qt;
import static org.quicktheories.quicktheories.generators.SourceDSL.booleans;
import static org.quicktheories.quicktheories.generators.SourceDSL.integers;


public class SimpleTestNGTestCase {

	private int counter =0;
	
	private boolean isSomePositive(int i, int j ) {
		counter++;
		System.out.println("counter "+counter+", i="+i+", j="+j);  
		return i + j > 0;
	}

	private boolean isAssociative(boolean b1, boolean b2 ) {
		counter++;
		System.out.println("counter "+counter+", b1="+b1+", b2="+b2);  
		return (b1&&b2) == (b2&&b1);
	}
	
	  @Test
	  public void testAddingTwoPositiveIntegersAlwaysGivesAPositiveInteger(){
	    counter=0;
		 qt()
	    .forAll(integers().from(1).upTo(3000000)
	          , integers().from(1).upTo(3000000))
	    .check((i,j) -> isSomePositive(i,j)); 
	  }
	  
	  @Test
	  public void testBooleanOrIsAssociative(){
	    counter=0;
		 qt()
	    .forAll(booleans().all(),
	    		booleans().all()
	    		)
	    .check((b1,b2) -> isAssociative(b1,b2)); 
	  }


}
