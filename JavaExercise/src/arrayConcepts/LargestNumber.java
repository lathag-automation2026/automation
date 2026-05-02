package arrayConcepts;

public class LargestNumber 
{
	
	public static void main(String[] args) {
        int[] numbers = {5, 12, 87, 22, 17};

        int largest = numbers[0];
        for (int num : numbers) {
            if (num > largest) {
                largest = num;
            }
        }

        System.out.println("Largest number is: " + largest);
    }

}
