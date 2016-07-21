package net.franckbenault.propertybasetesting.shrinking;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.runner.RunWith;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.generator.InRange;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

@RunWith(JUnitQuickcheck.class)
@Ignore
public class IntegersTest {

	@Property(shrink=false, trials=1000)
	public void testIsSmallerThanFour(@InRange(minInt=2) int i) {
		System.out.println("Shrink false i="+i);
		assertTrue(String.valueOf(i), Integers.isSmallerThanFour(i));
	}	

	
	@Property(shrink=true, trials=1000)
	public void testIsSmallerThanFourShrinkingTrue(@InRange(minInt=2) int i) {
		System.out.println("Shrink true i="+i);
		assertTrue(String.valueOf(i), Integers.isSmallerThanFour(i));
	}

}
