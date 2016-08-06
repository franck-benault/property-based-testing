package net.franckbenault.propertybasedtesting.check;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.fail;

public class LengthCheckTestCase {

	
	@DataProvider(name = "validLengths")
	public Object[][] createDataValid() {
	 return new Object[][] {
	   { "six666" },
	   { "seven77"}
	 };
	}
	
	@DataProvider(name = "invalidLengths")
	public Object[][] createDataInvalid() {
	 return new Object[][] {
	   { "1" },
	   { "1234567890123456"}
	 };
	}
	
	@Test(dataProvider = "validLengths")
	public void testPasswordLengths(String input) {
		try {
			LengthCheck.lengthCheck(input);
		} catch (IllegalArgumentException e) {
			fail("Valid length should not fail: " + input + " - " + e.getMessage());
		}
	}

	@Test(dataProvider = "invalidLengths")
	public void testInvalidPasswordLengths(String input) {
		try {
			LengthCheck.lengthCheck(input);
			fail("Invalid length should fail: " + input);
		} catch (IllegalArgumentException e) {
			// Ignore
		}
	}
}
