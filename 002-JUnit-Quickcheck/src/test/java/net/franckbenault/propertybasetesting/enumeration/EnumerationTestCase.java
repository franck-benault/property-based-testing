package net.franckbenault.propertybasetesting.enumeration;


import org.junit.runner.RunWith;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.generator.ValuesOf;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

@RunWith(JUnitQuickcheck.class)
public class EnumerationTestCase {
	
	public static enum JDKS {
		JDK5, JDK6, JDK7, JDK8,
	}
	
	
	@Property(trials=8)
	public void testEnumRandom(JDKS j) {
		System.out.println("random j="+j);
	}

	@Property(trials=8)
	public void testEnumOrdered(@ValuesOf JDKS j) {
		System.out.println("ordered j="+j);
	}
}
