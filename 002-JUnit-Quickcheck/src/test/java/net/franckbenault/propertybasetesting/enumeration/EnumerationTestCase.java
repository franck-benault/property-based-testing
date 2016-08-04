package net.franckbenault.propertybasetesting.enumeration;


import org.junit.runner.RunWith;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

@RunWith(JUnitQuickcheck.class)
public class EnumerationTestCase {
	
	public static enum JDKS {
		JDK5, JDK6, JDK7,
	}
	
	
	@Property(trials=5)
	public void testEnum(JDKS j) {
		System.out.println("j="+j);
	}

}
