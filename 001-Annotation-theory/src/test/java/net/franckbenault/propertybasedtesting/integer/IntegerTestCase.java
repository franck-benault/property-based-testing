package net.franckbenault.propertybasedtesting.integer;

import static org.junit.Assert.*;

import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class IntegerTestCase {
	
	 @DataPoint
	 public static int i1 = RangeUtil.range(1, 10);
	 
	 @DataPoint
	 public static int i2 = RangeUtil.range(1, 10);
	 
	 @DataPoint
	 public static int i3 = RangeUtil.range(1, 10);

	@Theory
	public void testAplusBGreaterThanA(int a, int b) {
		System.out.println("a="+a+", b="+b);
		assertTrue((a+b) >a);
	}

}
