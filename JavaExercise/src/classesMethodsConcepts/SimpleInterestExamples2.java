package classesMethodsConcepts;

public class SimpleInterestExamples2 
{
	
	 public int Computesimpleinterest (int p, int n, int r)
	  {
	     int interest;
	     interest = p*n*r/100;
	     System.out.println("Interest is"+interest);
	     return interest;
	  }
	     public static void main(String[] args) {
	    	 SimpleInterestExamples2 simpleinterest = new SimpleInterestExamples2();
	     simpleinterest.Computesimpleinterest(1000,2,5);
	    }

}
