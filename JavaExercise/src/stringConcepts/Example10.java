package stringConcepts;

public class Example10
{	
	 String  str = " Java      Programming ";
     String str1;
   public static void main(String[] args) {
	   Example10 obj = new Example10();
    obj.str1 = obj.str.trim();
    System.out.println(obj.str1);
   }
}