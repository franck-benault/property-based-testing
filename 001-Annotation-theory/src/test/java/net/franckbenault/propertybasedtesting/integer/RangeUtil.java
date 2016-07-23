package net.franckbenault.propertybasedtesting.integer;

import java.util.Random;

public class RangeUtil {
	
	/**
	 * random value between min and max
	 * 
	 * @param min
	 * @param max
	 * @return
	 */
	public static int range(int min, int max) {
		Random r = new Random();
		int i1 = r.nextInt(max - min + 1) + min;
		return i1;
		
	}

}
