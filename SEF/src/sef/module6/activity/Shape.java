package sef.module6.activity;

public abstract class Shape {

	public String color;
	
	public Shape() {
	}
	
	// Complete the code and Add abstract method calculateArea() and calculatePerimeter() with return type as double

	
	public void setColor(String c) {
		color = c;
	}
	public String getColor() {
		return color;
	} 

    public abstract double calculateArea();

    public abstract double calculatePerimiter();

    public void printInfo()
    {
        System.out.println("Color = " + this.getColor());
        System.out.println("Area = " + this.calculateArea());
        System.out.println("Perimiter = " + this.calculatePerimiter());
    }
}