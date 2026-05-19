package mapConcepts;

import java.util.HashMap;

public class HashMapExamples3 
{
	public static void main(String[] args){

        HashMap<String, Integer> hashMap = new HashMap<>();

        // Add elements
        hashMap.put("John", 25);
        hashMap.put("Jane", 30);
        hashMap.put("Jim", 35);

        // Print HashMap
        System.out.println(hashMap);
    }
}

