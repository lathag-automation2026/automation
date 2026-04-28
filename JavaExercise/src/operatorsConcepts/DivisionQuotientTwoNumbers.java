

package operatorsConcepts;

public class  DivisionQuotientTwoNumbers
{
	
	 public int division(int a, int b)
	    {
	    int quotient = a/b;
	    System.out.println("The Quotient is"+ quotient);
	    return quotient;
	    }
	    public int remainder(int a, int b)
	    {
	    int remainder = a%b;
	    System.out.println("The Remainder is"+ remainder);
	    return remainder;
	    }
	    public static void main(String[] args) 
	    {
	    	DivisionQuotientTwoNumbers obj= new DivisionQuotientTwoNumbers();
	        obj.division(300,60);
	        obj.remainder(300,9);

    }
}
