package net.franckbenault.propertybasedtesting.string;

import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.FromDataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

/**
 * string a, b a.length()+b.length() = (a+b).length
 * 
 */
@RunWith(Theories.class)
public class StringDataPointsFromDataPointsTestCase {

	@DataPoints("suspects")
	public static String[] whoMadeIt = { "Miss Rose", "Mrs. Peacock", "Professor Plum" };
	
	@DataPoints("suspects")
	public static String[] orMaybeItWasSomeoneElse = { "Mr. Slate-Grey", "Captain Brown" };
	
	@DataPoints("rooms")
	public static String[] whereWasIt = { "Hall", "Kitchen" };

	@Theory
	public void dummyTest(@FromDataPoints("suspects") String murderer,
			@FromDataPoints("rooms") String murderScene) {
		System.out.println(String.format("%s murdered Colonel Mustard in the %s", murderer, murderScene));
	}
}