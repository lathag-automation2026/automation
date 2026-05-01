package methodOverloadingConcepts;

public class AreaOfRectangleExample1 

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
	   System.out.println("Area of the rectangle"+rectanglearea);
	}
	void Area(int a)
	{
	    squarearea = a*a;
	    System.out.println("Area of the square"+squarearea);
	}
	   
	    public static void main(String[] args) {
	    	AreaOfRectangleExample1 sh = new AreaOfRectangleExample1();
	    sh.Area();
	    sh.Area(20,30);
	    sh.Area(40);
	    }

}
