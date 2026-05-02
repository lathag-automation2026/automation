package exceptionHandling;

public class StringIndexOutOfBoundsExceptionExample2 
{
		    
	    public static void main(String[] args) {
	        String name = "Java";

	        try {
	            // Invalid index
	            System.out.println(name.charAt(10));
	        } 
	        catch (StringIndexOutOfBoundsException e) {
	            System.out.println("Invalid index! String length is " + name.length());
	        }
	    }
	}