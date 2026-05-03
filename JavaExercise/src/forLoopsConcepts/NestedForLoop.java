package forLoopsConcepts;

public class NestedForLoop {

	public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {       // rows
            for (int j = 1; j <= i; j++) {   // columns
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
//Nested For Loop:

//The outer loop controls the number of rows.
//The inner loop controls the number of columns in each row.
//Prints * characters to form a pattern.