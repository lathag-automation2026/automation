package stringConcepts;

import java.util.Scanner;

public class StringExamples 
{
	public static void main(String[] args){

        Scanner var = new Scanner(System.in);
        System.out.println("Enter the String:");
        String v = var.nextLine();
//    String v = "This is Santhosh govintharaj  ";
      String w = "This class is Java class";

            int a = v.length();
            System.out.println("The length is " +a);


            String b = v.substring(18);
            System.out.println("The substring is "+b);
            String c = v.substring(0,4);
            System.out.println("The substring method II is " +c);
            String d = v.toLowerCase();
            System.out.println("The lower case is " +d);
            String e = w.replaceFirst("class","MURUGAN");
            System.out.println("The replace is :" +e);
            String f = v.toUpperCase();
            System.out.println("The Upper case Is  " +f);
            String g = v.trim();
            System.out.println("The trimp is:" +g);
            //String h = v.replaceAll("h","\\$");
            String h = v.replaceAll("h","@");
            System.out.println("The Replace letter are:"+h);
            String l = v.concat(",").concat(v);
            System.out.println("The Word are Concat: "+l);



            boolean i = v.startsWith("This");
            boolean j = v.endsWith("SANTHOSH");
            System.out.println("The Start Charecter is " +i);
            System.out.println("The End of Word is "+j);
            boolean k = v.isEmpty();
            System.out.println("The input is Empty / not Empty:" +k);
            boolean m = v.equals(v);
            System.out.println("The check equality:" +m);
  }
}


