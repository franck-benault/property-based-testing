package net.franckbenault.propertybasedtesting.string;

import static org.junit.Assert.*;

import org.junit.Assume;
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

	 @DataPoint
	 public static String d = null;

	 
	@Theory(nullsAccepted=false)
	public void testConcat(String x, String y) {
		System.out.println("x="+x+" ,y="+y);
		assertEquals(x.length()+y.length(),(x+y).length());
	}

	//default null accepted
	@Theory
	public void testConcatWithAssume(String x, String y) {
		Assume.assumeNotNull(x, y);
		System.out.println("x="+x+" ,y="+y);
		assertEquals(x.length()+y.length(),(x+y).length());
	}
}
