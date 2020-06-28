package sef.module6.activity;

public class Rectangle extends Shape {
	private double length;
	private double width;

	public Rectangle() {
		super();
	}

	public Rectangle(double l, double w) {
		super();

		this.length = l;
		this.width = w;
	}

	public double calculateArea() {
		return this.length * this.width;
	}

	public double calculatePerimiter() {
		return 2 * (this.length + this.width);
	}
}