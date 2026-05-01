package forLoopsConcepts;

public class AverageOfNumbers 
{
	
	public static void main(String[] args) {
        int n = 5;
        int sum = 0;
        int avg=0;
        for(int i=1;i<=n;i++)
        {
         sum = sum+i;
         avg = sum/n;
        }
         System.out.println(avg);
    }

}
