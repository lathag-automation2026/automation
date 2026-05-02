package interfaceConcepts2;

public class Circle implements Shape
{
	double radius;
	
	Circle(double r)
	{
		radius=r;
	}
	
	public double calculateArea()
	{
		return Math.PI*radius*radius;
	}

}
