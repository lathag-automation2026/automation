package abstractClassConcepts2;

import java.util.Scanner;

public class MainMethods 
{
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius");
		Shape c=new Circle(sc.nextDouble());
		System.out.println("Circle Area:" +c.calculateArea());
		
		System.out.println("Enter length");
		double l=sc.nextDouble();
		System.out.println("Enter width");
		double w=sc.nextDouble();
		
		Shape r=new Rectangle(l,w);
        System.out.println("\n Rectangle Area:" +r.calculateArea());
        sc.close();
		
		
	}


}
