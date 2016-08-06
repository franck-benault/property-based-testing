package net.franckbenault.propertybasedtesting.check;

import java.util.Iterator;

import org.testng.annotations.DataProvider;
import static com.theoryinpractise.quickcheckng.testng.GeneratorProvider.toObjectArrayIterator;


public class LengthGeneratorsDataProviders {

	/**
	 * A TestNG @DataProvider for the validInputs quickcheck generator
	 */
	@DataProvider
	public static final Iterator<Object[]> validInputs() {
		return toObjectArrayIterator(LengthGenerators.validLengths());
	}

	/**
	 * A TestNG @DataProvider for the invalidInputs quickcheck generator
	 */
	@DataProvider
	public static final Iterator<Object[]> invalidInputs() {
		return toObjectArrayIterator(LengthGenerators.invalidLengths());
	}

}
