package arrayConcepts;

public class MultiDimensionalArraysExample1 
{

	public static void main(String[] args) {

        // Jagged Array (Different number of marks for each student)
        int[][] marks = {
                {85, 92, 78, 67},   // Student 1
                {95, 88},           // Student 2
                {72, 84, 89}        // Student 3
        };

        // -----------------------------
        // Printing all student marks
        // -----------------------------
        for (int i = 0; i < marks.length; i++) 
        {
           System.out.print("Student " + (i + 1) + ": ");
            for (int j = 0; j < marks[i].length; j++) 
            {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }

        // --------------------------------
        // Sum of Student 2 marks
        // --------------------------------

        int sum = 0;
        for (int j = 0; j < marks[1].length; j++) 
        {
            sum = sum + marks[1][j];
        }
        System.out.println();
        System.out.println("Sum of Student 2: " + sum);

        // --------------------------------
        // Average of Student 2 marks
        // --------------------------------
        double average = (double) sum / marks[1].length;
        System.out.println();
        System.out.println("Average Grade of Student 2: " + average);

    }
}
