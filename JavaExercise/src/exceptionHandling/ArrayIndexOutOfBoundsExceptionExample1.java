package exceptionHandling;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionExample1 
{
	
	    public static void main(String[] args) {
	        int a[] = new int[5];
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter the position (0 to 4):");
	        int pos = sc.nextInt();

	        System.out.println("Enter the value:");
	        int value = sc.nextInt();

	        // This line may cause exception
	        a[pos] = value;

	        System.out.println("Element inserted at position " + pos);
	    }
	}