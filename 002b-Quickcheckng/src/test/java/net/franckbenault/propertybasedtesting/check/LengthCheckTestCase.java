package net.franckbenault.propertybasedtesting.check;

import org.testng.annotations.Test;
import static org.testng.Assert.fail;

public class LengthCheckTestCase {

	@Test(dataProviderClass = LengthGeneratorsDataProviders.class, dataProvider = "validInputs")
	public void testPasswordLengths(String input) {
	  try {
		  LengthCheck.lengthCheck(input);
	  } catch (IllegalArgumentException e) {
	    fail("Valid length should not fail: " + input + " - " + e.getMessage());
	  }
	}

	@Test(dataProviderClass = LengthGeneratorsDataProviders.class, dataProvider = "invalidInputs")
	public void testInvalidPasswordLengths(String input) {
	  try {
		//System.out.println("invalid --"+input);  
		LengthCheck.lengthCheck(input);
	    fail("Invalid length should fail: " + input);
	  } catch (IllegalArgumentException e) {
	    // Ignore
	  }
	}
}
