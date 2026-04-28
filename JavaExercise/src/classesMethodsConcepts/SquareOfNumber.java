package classesMethodsConcepts;

public class SquareOfNumber
{
	
	public int Calculatesquareofanumber(int n)
	  {
	      int square = n*n;
	      System.out.println("square of the number is"+square);
	      return square;
	  }
	     public static void main(String[] args) {
	    	 SquareOfNumber s = new SquareOfNumber();
	     s.Calculatesquareofanumber(6);
	    }

}
