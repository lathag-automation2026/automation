package exceptionHandling;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionExample2 
{
	
	 public static void main(String[] args) {
	        int a[] = new int[5];
	        Scanner sc = new Scanner(System.in);

	        try {
	            System.out.println("Enter the position:");
	            int pos = sc.nextInt();

	            System.out.println("Enter the value:");
	            int value = sc.nextInt();

	            a[pos] = value;

	            System.out.println("Element inserted at position " + pos);
	        } 
	        catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Invalid position! Please enter between 0 and 4.");
	        }
	    }
	}