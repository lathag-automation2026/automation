package operatorsConcepts;

public class DifferenceTwoNumbers
{
	
	  public int differee(int a, int b)
	    {
	       int difference;
	       difference = a-b;
	        System.out.println("Difference is"+ difference);
	        return difference; 
	    }
	    public static void main(String[] args) {
	    	DifferenceTwoNumbers obj = new DifferenceTwoNumbers();
	        obj.differee(300,550);
	        
	    
	    }
}
