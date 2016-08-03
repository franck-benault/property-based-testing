package net.franckbenault.propertybasetesting.objects;

public class Square {

	private float length;
	
	public Square(float length) {
		this.length = length;
	}
	
	public float area() {
		return length * length;
	}
}
