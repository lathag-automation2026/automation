package listConcepts;

import java.util.ArrayList;

public class ArrayListExamples4 
{
	 public static void main(String[] args) {

	        // String ArrayList
	        ArrayList<String> name = new ArrayList<>();

	        // Boolean ArrayList
	        ArrayList<Boolean> x = new ArrayList<>();

	        // Adding values
	        name.add("a");
	        name.add("c");
	        name.add("g");

	        x.add(Boolean.TRUE);
	        x.add(false);


	        // Printing ArrayLists
	        System.out.println("Names: " + name);
	        System.out.println("Boolean values: " + x);
	    }
	}
