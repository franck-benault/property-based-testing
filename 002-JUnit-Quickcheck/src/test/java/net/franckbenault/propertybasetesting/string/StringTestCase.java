package net.franckbenault.propertybasetesting.string;

import com.pholser.junit.quickcheck.From;
import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;


import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(JUnitQuickcheck.class)
public class StringTestCase {

	@Property(trials=5) 
    public void concatenationLength(String s1, String s2) {
    	
    	System.out.println("Generated strings for concatenationLength "+s1+" "+s2);
    	
        assertEquals(s1.length() + s2.length(), (s1 + s2).length());
    }

	@Property(trials=5) 
    public void concatenationLength2(
    		@From(MyCharacterGenerator.class) String s1, 
    		@From(MyCharacterGenerator.class) String s2) {
    	
    	System.out.println("Generated strings for concatenationLength2 "+s1+" "+s2);
    	
        assertEquals(s1.length() + s2.length(), (s1 + s2).length());
    }

}
