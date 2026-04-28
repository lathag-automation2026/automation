package mapConcepts;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class TreeMapExamples {

	public static void main(String[] args)
	{
		

		TreeMap<String,String> capitals=new TreeMap<String,String>();
		
	      //Sorted By deafult

		capitals.put("England", "London");
		capitals.put("India",   "New Delhi");
		capitals.put("India",   null);
		capitals.put("Japan", null);//duplicate null values  allowed 


		capitals.put("Australia", "Wien");
		capitals.put("England", "London");//duplicate key not allowed 

		capitals.put("Norway", "Oslo");
		capitals.put("USA", "Washington DC");
		//capitals.put(null, "Washington DC");//NullPointerException--null Key is not allowed



		System.out.println(capitals);


	}

}
