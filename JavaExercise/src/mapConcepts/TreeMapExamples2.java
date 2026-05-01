
package mapConcepts;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExamples2 
{
	public static void main(String[] args) {
        // Create a TreeMap where key = Roll Number, value = Student Name
        TreeMap<Integer, String> studentMap = new TreeMap<>();

        // Add entries
        studentMap.put(103, "Charlie");
        studentMap.put(101, "Alice");
        studentMap.put(104, "Diana");
        studentMap.put(102, "Bob");

        // Display the TreeMap (keys will be sorted automatically)
        System.out.println("Student Roll Numbers (Sorted):");
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("Roll No: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        // Get first and last entry (lowest and highest key)
        System.out.println("\nFirst entry: " + studentMap.firstEntry());
        System.out.println("Last entry: " + studentMap.lastEntry());

        // Remove an entry
        studentMap.remove(104);

        // Display updated map
        System.out.println("\nAfter removing Roll No 104:");
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("Roll No: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        // Size of map
        System.out.println("\nTotal students: " + studentMap.size());
    }
}


