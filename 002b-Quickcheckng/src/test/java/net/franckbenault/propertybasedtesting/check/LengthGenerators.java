package net.franckbenault.propertybasedtesting.check;

import net.java.quickcheck.Generator;
import static net.java.quickcheck.generator.PrimitiveGenerators.strings;

public class LengthGenerators {

	public static Generator<String> validLengths() {
		return strings(LengthCheck.VALID_CHARACTERS, LengthCheck.MIN_LENGTH, LengthCheck.MAX_LENGTH);
	}

	public static Generator<String> invalidLengths() {
		final Generator<String> underSized = strings(LengthCheck.VALID_CHARACTERS, Integer.MIN_VALUE,
				LengthCheck.MIN_LENGTH);

		final Generator<String> overSized = strings(LengthCheck.VALID_CHARACTERS, LengthCheck.MAX_LENGTH + 1,
				LengthCheck.MAX_LENGTH + 100);

		return new Generator<String>() {
			boolean useFirst = false;

			@Override
			public String next() {
				useFirst = !useFirst;
				return useFirst ? underSized.next() : overSized.next();
			}
		};
	}
}
