package mapConcepts;

import java.util.HashMap;
import java.util.Map;

public class HashMapExamples2 
{
	
	public static void main(String[] args) {
        // Create a HashMap where key = Roll Number, value = Student Name
        HashMap<Integer, String> studentMap = new HashMap<>();

        // Add entries to the HashMap
        studentMap.put(101, "Alice");
        studentMap.put(102, "Bob");
        studentMap.put(103, "Charlie");
        studentMap.put(104, "Diana");

        // Display all key-value pairs
        System.out.println("Student Roll Numbers and Names:");
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("Roll No: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        // Get value by key
        int searchRoll = 102;
        if (studentMap.containsKey(searchRoll)) {
            System.out.println("\nStudent with Roll No " + searchRoll + ": " + studentMap.get(searchRoll));
        }

        // Remove an entry
        studentMap.remove(103);

        // Display the updated map
        System.out.println("\nAfter removing Roll No 103:");
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("Roll No: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        // Total number of students
        System.out.println("\nTotal students: " + studentMap.size());
    }

}
