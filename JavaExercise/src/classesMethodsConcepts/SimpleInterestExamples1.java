package classesMethodsConcepts;

public class SimpleInterestExamples1 
{
	
	 static int interest;
	  public int Computesimpleinterest (int p, int n, int r)
	  {
	     
	     interest = p*n*r/100;
	     System.out.println("Interest is"+interest);
	     return interest;
	  }
	     public static void main(String[] args) {
	    	 SimpleInterestExamples1 simpleinterest = new SimpleInterestExamples1();
	     simpleinterest.Computesimpleinterest(1000,2,5);
	    }

}
