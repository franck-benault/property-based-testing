package net.franckbenault.propertybasetesting.objects;


import org.junit.Test;
import org.quicktheories.quicktheories.core.Generator;
import org.quicktheories.quicktheories.core.Source;


import static org.quicktheories.quicktheories.generators.SourceDSL.floats;
import static org.quicktheories.quicktheories.QuickTheory.qt;


public class ObjectTestCase {
	
	private Generator<Square> squares() {
	    return floats().fromZeroToFloatMax()
	    		.andThen( length -> new Square(length));
	  }
	
	 private Source<Square> anySquare() {
		    return Source.of(squares());
		  }

	@Test
	public void test() {
		qt().forAll(anySquare())
		.check((s) -> s.area()>=0); 
	}

}
