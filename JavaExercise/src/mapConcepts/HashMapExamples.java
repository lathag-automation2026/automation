package mapConcepts;

import java.util.HashMap;

public class HashMapExamples {

	public static void main(String[] args)
	{
		
		HashMap<String,String> capitals=new HashMap<String,String>();
		
	      //Insertion order is not  Maintained

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
