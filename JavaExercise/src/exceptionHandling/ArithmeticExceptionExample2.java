package exceptionHandling;

import java.util.Scanner;

public class ArithmeticExceptionExample2 
{


	    public static void main(String[] args) {
	        
	        Scanner sc = new Scanner(System.in);

	        try {
	            System.out.println("Enter a number:");
	            int num = sc.nextInt();

	            int result = 200 / num;  // may cause exception
	            System.out.println("Result: " + result);
	        } 
	        catch (ArithmeticException e) {
	            System.out.println("Cannot divide by zero!");
	        }
	    }
	}