package net.franckbenault.propertybasedtesting.string;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

/**
 * string a, b
 * a.length()+b.length() = (a+b).length
 * 
 */
@RunWith(Theories.class)
public class StringTestCase {
	

	 @DataPoint
	 public static String a = "a";
	 
	 @DataPoint
	 public static String b = "bb";
	 
	 @DataPoint
	 public static String c = "ccc";


	@Theory
	public void testConcat(String x, String y) {
		assertEquals(x.length()+y.length(),(x+y).length());
	}

}
