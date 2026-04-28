package classesMethodsConcepts;

public class AreaOfCircle 
{
	
	static double area;
	  public static double ComputeCirclearea (double radius)
	  {
	      area = 3.14*radius*radius;
	      System.out.println("Area of the circle is"+ area);
	      return area;
	  }
	     public static void main(String[] args) {
	     ComputeCirclearea(6);
	    }

}

