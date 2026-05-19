package arrayConcepts;

public class ArrayExamples4 
{
	public static void main(String[] args){

        int [][] a = {
                {1,2,3,4},
                {5,6,7,8}
        };

        for(int m = 0; m < a.length; m++) {

            System.out.println("Row " + (m+1));
            

            for(int n = 0; n < a[m].length; n++) {

                System.out.println("Column " + (n+1) +
                        " Value = " + a[m][n]);
            }

            System.out.println();
        }
    }
}
