package arrayConcepts;

public class MultiDimensionalArraysExample2 
{
	public static void main(String[] args) {

        // 1. Declaration and Initialization
        // Creating a 2D array with 3 rows and 3 columns

        int[][] matrix = new int[3][3];

        // -----------------------------------------
        // 2. Storing values into the array
        // -----------------------------------------

        int value = 1;
        // Outer loop = rows
        for (int i = 0; i < 3; i++) 
        {
            // Inner loop = columns
            for (int j = 0; j < 3; j++) 
            {
               matrix[i][j] = value;
                value++;
            }
        }

        // -----------------------------------------
        // 3. Printing the array values
        // -----------------------------------------

        System.out.println("3x3 Matrix Elements");
        for (int i = 0; i < matrix.length; i++) 
        {
            for (int j = 0; j < matrix[i].length; j++) 
            {
                System.out.print(matrix[i][j] + " ");
            }

            // Move to next line after one row
            System.out.println();
        }
    }
}
