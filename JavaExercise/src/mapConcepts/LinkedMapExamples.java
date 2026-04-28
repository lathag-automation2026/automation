package mapConcepts;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedMapExamples {

	public static void main(String[] args) {


		LinkedHashMap<String,String> capitals=new LinkedHashMap<String,String>();
		
		   //Insertion order is   Maintained

				capitals.put("England", "London");
				capitals.put("India",   "New Delhi");
				capitals.put("Bangalore",   null);
				capitals.put("Japan", null);//duplicate null values  allowed 


				capitals.put("Australia", "Wien");
				capitals.put("England", "London");//duplicate key not allowed 

				capitals.put("Norway", "Oslo");
				capitals.put("USA", "Washington DC");
				capitals.put(null, " DC");
				capitals.put(null, "Silkboard");//duplicate null key  not allowed 



		System.out.println(capitals);
	}

}
