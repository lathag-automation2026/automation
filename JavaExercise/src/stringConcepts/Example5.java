package stringConcepts;

public class Example5
{	
	  String  str = "Learning";
      String str1;
    public static void main(String[] args) {
    	Example5 obj = new Example5();
     obj.str1 = obj.str.substring(0,5);
     System.out.println(obj.str1);
    }
}