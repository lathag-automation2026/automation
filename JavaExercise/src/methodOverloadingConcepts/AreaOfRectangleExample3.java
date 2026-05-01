package methodOverloadingConcepts;

public class AreaOfRectangleExample3 
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
		   //System.out.println("Area of the rectangle"+rectanglearea);
		}
		int Area(int a)
		{
		    squarearea = a*a;
		    //System.out.println("Area of the square"+squarearea);
		    return squarearea;
		}
		    public static void main(String[] args) {
		    	AreaOfRectangleExample3 sh = new AreaOfRectangleExample3();
		    sh.Area();
		    sh.Area(20,30);
		    System.out.println("Area of the rectangle"+ sh.rectanglearea);
		    sh.Area(40);
		    int sqarea =sh.squarearea;
		    System.out.println(sqarea);
		    }

}


