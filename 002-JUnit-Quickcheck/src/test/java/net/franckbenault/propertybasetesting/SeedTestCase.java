package net.franckbenault.propertybasetesting;



import org.junit.runner.RunWith;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.When;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;


@RunWith(JUnitQuickcheck.class)
public class SeedTestCase {

	
		
	@Property(trials=2)
	public void testTheory(@When(seed = -1L) int i) {
		System.out.println("testQuickcheck i="+i);
	}
}
