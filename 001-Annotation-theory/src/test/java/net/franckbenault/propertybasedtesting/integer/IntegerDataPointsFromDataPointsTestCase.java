package net.franckbenault.propertybasedtesting.integer;

import java.util.Arrays;

import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.FromDataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertTrue;

@RunWith(Theories.class)
public class IntegerDataPointsFromDataPointsTestCase {

	   @DataPoints("small values")
	    public static int[] aValues() {
	        // Use new Random().nextInt() to experiment:
	        int[] ints = {1, 2, 3};
	        System.out.println("Generated test data: "
	                + Arrays.toString(ints));
	        return ints;
	    }
	 
	    @DataPoints("big values")
	    public static int[] bValues() {
	        // Generate dynamically:
	        int[] ints = {30, 40, 1000};
	        System.out.println("Generated test data: "
	                + Arrays.toString(ints));
	        return ints;
	    }
	 
	    @Theory
	    public void 	TestASmallerThanB(@FromDataPoints("small values") int a,
	                                       @FromDataPoints("big values") int b) {
	        System.out.printf("a = %d, b = %d%n", a, b);
	        assertTrue(a < b);
	    }
}
