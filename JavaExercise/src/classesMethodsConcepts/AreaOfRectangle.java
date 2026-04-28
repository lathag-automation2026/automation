package classesMethodsConcepts;

public class AreaOfRectangle 

{
	
	 static int area;
	    public static int ComputeRectanglearea (int length, int breadth)
	    {
	        area = length * breadth;
	        System.out.println("Area of the rectangle is" + area);
	        return area;
	    }
	    public static void main(String[] args) {
	      ComputeRectanglearea(5,3);
	    }

}
