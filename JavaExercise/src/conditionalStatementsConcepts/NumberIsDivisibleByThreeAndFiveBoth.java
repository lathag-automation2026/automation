package conditionalStatementsConcepts;

public class NumberIsDivisibleByThreeAndFiveBoth
{
	
	public static void main(String[] args) {
        int a=97;
     if (a%3==0 && a%5==0)
     {
         System.out.println("Divisible by both 3 and 5");
     }
    else if (a%3==0 && a%5!=0)
    {
        System.out.println("Divisible by 3 only");
    }
    else if (a%3!=0 && a%5==0)
    {
        System.out.println("Divisible by 5 only");
    }
    
    else
    {
        System.out.println("Not divisible by both");
    }

  }
}

