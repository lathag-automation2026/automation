package abstractClassConcepts2;

public class Circle extends Shape
{
	double radius;
	
	Circle(double r)
	{
		radius=r;
	}
	
	double calculateArea()
	{
		return Math.PI*radius*radius;
	}

}
