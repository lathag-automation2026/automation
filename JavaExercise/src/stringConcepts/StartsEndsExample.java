package stringConcepts;

public class StartsEndsExample 
{
	public static void main(String[] args) {
        String sentence = "Akash is a student learning Selenium with Java for automation testing purposes,and Quick Response.";

        // Check if sentence starts with "Akash"
        boolean starts = sentence.startsWith("Akash");

        // Check if sentence ends with "purposes"
        boolean ends = sentence.endsWith("Response.");

        System.out.println("Sentence: " + sentence);
        System.out.println("Starts with 'Akash'? " + starts);
        System.out.println("Ends with 'Response.'? " + ends);
    }


}
