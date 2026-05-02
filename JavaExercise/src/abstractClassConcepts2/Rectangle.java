package abstractClassConcepts2;

public  class Rectangle  extends Shape
{
	double length,width;
	
	Rectangle(double l,double w)
	{
	length=l;
	width=w;
    }
	double calculateArea()
	{
		return length*width;
	}
	

}
