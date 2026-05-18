package exceptionHandling;

public class ArithmeticExceptionExample3 
{
	 public static void main(String[] args){
	      System.out.println("1");
	      System.out.println("2");
	        try{
	           System.out.println(8/0);}
	        catch(ArithmeticException t){
	           System.out.println("dont / by Zero");
	        }
	        System.out.println("4");

	        }
	}


