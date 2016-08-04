package net.franckbenault.propertybasetesting.enumeration;

import static org.quicktheories.quicktheories.QuickTheory.qt;
import static org.quicktheories.quicktheories.generators.SourceDSL.integers;

import java.util.Random;

import org.junit.Test;
import org.quicktheories.quicktheories.core.Generator;
import org.quicktheories.quicktheories.core.Source;

public class EnumerationTestCase {

	private int counter;

	private boolean printOK(JDKS j) {
		counter++;
		System.out.println("counter="+counter+" j=" + j);
		return true;
	}

	public static enum JDKS {
		JDK5, JDK6, JDK7,
	}

	private Generator<JDKS> jdks() {
		return

		integers().from(0).upTo(JDKS.values().length).andThen(i -> JDKS.values()[i]);
	}

	private Source<JDKS> anyJdks() {
		return Source.of(jdks());
	}

	@Test
	public void test() {
		counter = 0;
		qt().forAll(anyJdks()).check((j) -> printOK(j));
	}

}
