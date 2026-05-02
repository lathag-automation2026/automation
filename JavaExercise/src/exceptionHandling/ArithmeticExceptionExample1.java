package exceptionHandling;

import java.util.Scanner;

public class ArithmeticExceptionExample1 
{
	public static void main(String[] args) {
	      
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int result = 200/num;
        System.out.println(result);
    }

}

