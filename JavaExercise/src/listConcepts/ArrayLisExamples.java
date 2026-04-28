
package listConcepts;

import java.util.ArrayList;

public class ArrayLisExamples {

	public static void main(String[] args) 
	
	{
      ArrayList<String> cars=new ArrayList<String>();
		
      //Insertion order is Maintained
    		  cars.add("Volvo");
    		  cars.add("BMW");
    		  cars.add("Ford");
    		  cars.add("Mazda");
    		  cars.add("Volvo");//duplicate allowed
    		  cars.add(null);//null allowed
    		  cars.add(null);//duplicate null allowed since duplicate allowed.
    		  
    		  System.out.println(cars.get(5));//can access index



		System.out.println(cars);

	}

}
