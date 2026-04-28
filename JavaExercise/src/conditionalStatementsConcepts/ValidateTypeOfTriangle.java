package conditionalStatementsConcepts;

public class ValidateTypeOfTriangle 
{

	 public static void main(String[] args) {
	        int a=9,b=15,c=15;
	        
	     if (a==b && b==c  && c==a)
	     {
	         System.out.println("It is an equilateral triangle");
	     }
	    else if (a==b && b!=c || b==c && c!=a ||a==c && c!=b)
	    {
	        System.out.println("It is an isosceles traingle");
	    }
	    else
	    {
	        System.out.println("It is a scalene triangle");
	    }
	 }
}
