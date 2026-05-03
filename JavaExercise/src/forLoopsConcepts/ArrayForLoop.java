package forLoopsConcepts;

public class ArrayForLoop {

	public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        for (int i = 0; i <=numbers.length-1; i++) {
            System.out.println(numbers[i]);
        }
    }
}


//For Loop with Array:

//Iterates over each element of the numbers array using an index i.
//Prints the value of the current element numbers[i].