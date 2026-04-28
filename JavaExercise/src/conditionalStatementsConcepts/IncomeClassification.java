package conditionalStatementsConcepts;

public class IncomeClassification 
{
	
	 public static void main(String[] args) {
	        int income = 1965000;
	       if(income>=1000000)
	       {
	           System.out.println("Very high");
	       }
	       else if (income>=500000 && income<= 1000000)
	       {
	        System.out.println("high");   
	       }
	       else if (income>=100000 && income<= 500000)
	       {
	         System.out.println("medium"); 
	       }
	        else if (income>=10000 && income<= 100000)
	       {
	         System.out.println("low"); 
	       }
	        else 
	       {
	         System.out.println("very low"); 
	       }
	    }

}
