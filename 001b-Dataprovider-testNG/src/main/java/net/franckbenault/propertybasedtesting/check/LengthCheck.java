package net.franckbenault.propertybasedtesting.check;

public class LengthCheck {
	
	public static int MIN_LENGTH = 5;
	public static int MAX_LENGTH = 15;
	

	public static void lengthCheck(String input) {
		if (input.length() < MIN_LENGTH) {
			throw new IllegalArgumentException("Too short.");
		} else if (input.length() > MAX_LENGTH) {
			throw new IllegalArgumentException("Too long.");
		}
	}
}
