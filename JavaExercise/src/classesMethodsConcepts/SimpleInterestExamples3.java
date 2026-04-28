package classesMethodsConcepts;

public class SimpleInterestExamples3 
{
	
	 static int interest;
	  public  static int Computesimpleinterest (int p, int n, int r)
	  {
	    
	     interest = p*n*r/100;
	     
	     return interest;
	  }
	     public static void main(String[] args) {
	     //Main simpleinterest = new Main();
	     Computesimpleinterest(1000,2,5);
	     System.out.println("Interest is"+ interest);
	    }

}
