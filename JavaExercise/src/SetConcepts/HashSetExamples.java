package SetConcepts;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetExamples {

	public static void main(String[] args) 
	{
		HashSet<String> cars=new HashSet<>();
		//Insertion order is not Maintained
          cars.add("Volvo");
          cars.add("BMW");
		  cars.add("Ford");
		  cars.add("Mazda");
		  cars.add("Volvo");//duplicate is not allowed
		  cars.add(null);//only once  null allowed
		  cars.add(null);// duplicate null not allowed

		  
		 // System.out.println(cars.get(5));//can not access index
		  System.out.println(cars);
		  
		  //If you want access
		  
			List<String> carsList=new ArrayList<>(cars);
			
			  System.out.println(carsList.get(2));
			  
			  System.out.println(carsList);


			



	}

}
