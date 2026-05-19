package mapConcepts;

import java.util.Hashtable;

public class HashTableExample 
{
	

	    public static void main(String[] args){

	        Hashtable<String, String> f = new Hashtable<>();

	        f.put("santhosh", "san");
	        f.put("santhosh1", "san2");
	        f.put("santhosh2", "san3");
	        f.put("santhosh2", "san3");


	        for(String key : f.keySet()){

	            System.out.println("Key : " + key);
	            System.out.println("Value : " + f.get(key));
	        }
	    }
}


