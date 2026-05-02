package interfaceConcepts2;

public  class Rectangle  implements Shape
{
	double length,width;
	
	Rectangle(double l,double w)
	{
	length=l;
	width=w;
    }
	public double calculateArea()
	{
		return length*width;
	}
	

}
