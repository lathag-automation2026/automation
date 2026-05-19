package listConcepts;

import java.util.ArrayList;

public class ArrayListExamples3 
{
	public static void main(String[] args) {

        // First ArrayList
        ArrayList<Integer> san = new ArrayList<>();

        san.add(5);
        san.add(13);
        san.add(44);
        san.add(22);
        san.add(33);

        // Second ArrayList
        ArrayList<Integer> sat = new ArrayList<>();

        sat.add(9);
        sat.add(4);
        sat.add(5);
        sat.add(7);
        sat.add(3);

        // remove element at index 4
        san.remove(4);

        // get value from index 3
        int h = san.get(3);

        System.out.println(h);

        // check empty or not
        System.out.println("isEmpty : " + sat.isEmpty());

        // size of sat
        System.out.println("SIZE of sat : " + sat.size());

        // size of san
        System.out.println("SIZE of san : " + san.size());

        // print elements
        for (Integer sant : san) {

            for (Integer santt : sat) {

                // inner loop
                 System.out.print(santt +" ");
            }

            System.out.println(sant);
        }
    }
}

