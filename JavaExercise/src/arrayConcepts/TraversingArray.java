package arrayConcepts;

//👉 Traversing = going through all elements of an array one by one
public class TraversingArray 
{
	 public static void main(String[] args) {
	        int[] numbers = {10, 25, 30, 40, 50};
	        System.out.println("Array elements:");
	        for (int num : numbers) {
	            System.out.println(num);
	        }
	    }


}


/* Traversing using for loop 
for(int i = 0; i < arr.length; i++) 
{
    System.out.println(arr[i]);
}
*/

