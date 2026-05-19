package listConcepts;

import java.util.ArrayList;

public class ArrayLisExamples5 
{
	public static void main(String[] args) {

        // Integer ArrayList
        ArrayList<Integer> san = new ArrayList<>();

        san.add(5);
        san.add(13);
        san.add(44);
        san.add(22);
        san.add(33);

        // Another Integer ArrayList
        ArrayList<Integer> sat = new ArrayList<>();

        sat.add(9);
        sat.add(4);
        sat.add(5);
        sat.add(7);
        sat.add(3);

        // Remove element using index
        san.remove(4);

        // Get value from index 3
        int h = san.get(3);

        System.out.println("Value at index 3 : " + h);

        // Check empty
        System.out.println("sat is Empty : " + sat.isEmpty());

        // Size
        System.out.println("sat Size : " + sat.size());
        System.out.println("san Size : " + san.size());

        // Loop
        System.out.println("\nElements in san:");

        for (Integer sant : san) {
            System.out.println(sant);
        }

        // -----------------------------------------
        // String ArrayList
        // -----------------------------------------

        ArrayList<String> Name = new ArrayList<>();

        // add()
        Name.add("SANTHOSH");
        Name.add("Kumar");
        Name.add("Arun");
        Name.add("Vijay");

        System.out.println("\nOriginal Names : " + Name);

        // get()
        String firstName = Name.get(0);
        System.out.println("Get index 0 : " + firstName);

        // set()
        Name.set(1, "Raj");
        System.out.println("After set() : " + Name);

        // remove()
        Name.remove(3);
        System.out.println("After remove() : " + Name);

        // size()
        System.out.println("Name Size : " + Name.size());

        // isEmpty()
        System.out.println("Is Name Empty : " + Name.isEmpty());

        // for-each loop
        System.out.println("\nPrinting Names one by one:");

        for (String n : Name) {
            System.out.println(n);
        }
    }
}