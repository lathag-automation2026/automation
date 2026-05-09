package conditionalStatementsConcepts;

public class NestedIfExample2 

{
	
	public static void main(String[] args) {

        String name = "Shree";
        int age = 20;

        // Outer if
        if (name.equals("Shree")) {

            System.out.println("Outer if executed");

            // Inner if
            if (age >= 18) {
                System.out.println("Inner if executed");
                System.out.println("Shree is eligible to vote");
            } else {
                System.out.println("Inner else executed");
                System.out.println("Shree is not eligible to vote");
            }

        } else {

            System.out.println("Outer else executed");

            // Inner if inside else
            if (age >= 18) {
                System.out.println("Name is different but age is above 18");
            } else {
                System.out.println("Name is different and age is below 18");
            }
        }
    }
}


