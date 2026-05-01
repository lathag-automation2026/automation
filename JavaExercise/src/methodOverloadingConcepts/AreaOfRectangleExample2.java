package methodOverloadingConcepts;

public class AreaOfRectangleExample2 
{
	
	int rectanglearea ;
	int squarearea;
	void Area()
	{
	    System.out.println("Area of different shapes");
	}
	void Area(int l, int b)
	{
	  rectanglearea  = l*b;
	}
	void Area(int a)
	{
	    squarearea = a*a;
	    System.out.println("Area of the square"+squarearea);
	}
	   
	    public static void main(String[] args) {
	    AreaOfRectangleExample2 sh = new AreaOfRectangleExample2();
	    sh.Area();
	    sh.Area(20,30);
	    System.out.println("Area of the rectangle"+ sh.rectanglearea);
	    sh.Area(40);
	    }

}

