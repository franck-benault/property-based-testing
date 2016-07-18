package net.franckbenault.propertybasetesting.calculator;
/**
 * 
 * @author Franck Benault based on article from ontestautomation.com
 *
 */
public class Calculator {

	private int valueDisplayed;
	
	public Calculator() {
		this.valueDisplayed=0;
	}
	
	public void add(int x) {
		this.valueDisplayed+=x;
	}
	
	public int getResult() {
		return this.valueDisplayed;
	}
}
