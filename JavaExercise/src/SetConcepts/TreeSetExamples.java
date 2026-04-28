package SetConcepts;

import java.util.TreeSet;

public class TreeSetExamples {

	public static void main(String[] args) {
		
		TreeSet<String> cars=new TreeSet<>();
		//Sorted By default
        cars.add("Volvo");
        cars.add("BMW");
		  cars.add("Ford");
		  cars.add("Mazda");
		  cars.add("Volvo");//duplicate is not allowed
		//  cars.add(null);//null is not allowed---- java.lang.NullPointerException

		  
		 // System.out.println(cars.get(5));//can not access index



	System.out.println(cars);


	}

}
