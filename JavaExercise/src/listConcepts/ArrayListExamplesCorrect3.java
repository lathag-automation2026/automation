package listConcepts;

import java.util.ArrayList;

public class ArrayListExamplesCorrect3 
{
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println("List of Numbers:");
        for (Integer number :
        	numbers) 
        {    
            System.out.println(number);   // FIXED
        }  

        numbers.remove(Integer.valueOf(30)); // FIXED

        System.out.println("After removing '30':");
        for (Integer number : numbers) {
            System.out.println(number);   // FIXED
        }
    }
}


