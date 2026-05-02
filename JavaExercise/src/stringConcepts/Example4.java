package stringConcepts;

public class Example4
{	
	 String  str = "Learning pace";
     char ch;
   public static void main(String[] args) {
	   Example4 obj = new Example4();
    obj.ch = obj.str.charAt(11);
    System.out.println(obj.ch);
   }
}