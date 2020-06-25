package sef.module6.activity;

public class AbstractionActivity
{

	public static void main(String[] args)
		{
			Shape s1 = new Rectangle(5, 6);
			Shape s2 = new Square(5);
			
			s1.setColor("red");
			s2.setColor("blue");
			
			System.out.println("Rectangle: ");
			s1.printInfo();
			
			System.out.println("Square: ");
			s2.printInfo();
			
	    }
	}
