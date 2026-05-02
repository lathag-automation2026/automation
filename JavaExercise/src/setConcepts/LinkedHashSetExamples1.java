package setConcepts;

import java.util.LinkedHashSet;

public class LinkedHashSetExamples1 {

	public static void main(String[] args) 
			
		{
	      LinkedHashSet<String> cars=new LinkedHashSet<String>();
			
	      //Insertion order is Maintained
		          cars.add("Volvo");
		          cars.add("BMW");
	    		  cars.add("Ford");
	    		  cars.add("Mazda");
	    		  cars.add("Volvo");//duplicate is not allowed
	    		  cars.add(null);//only once null allowed
	    		  cars.add(null);// duplicate null not allowed

	    		  
	    		 // System.out.println(cars.get(5));//can not access index



			System.out.println(cars);

		}

	}
