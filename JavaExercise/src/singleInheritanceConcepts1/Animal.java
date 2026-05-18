package singleInheritanceConcepts1;

//A single child class inherits from a single parent class.

public class Animal 
{
	int x=100;
	 void eat()
	    {
	        System.out.println("Animals is eating...");
	        System.out.println("Values of x:" +(x+100));
	    }
	 
	 int value()
	 {  
		    int m=7000;
	        System.out.println("Print values of m:" +m);
	        return m;

	 }
}
