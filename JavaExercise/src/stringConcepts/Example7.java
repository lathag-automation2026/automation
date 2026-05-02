package stringConcepts;

public class Example7
{	
	  String  str = "Learning";
      String str1;
    public static void main(String[] args) {
    	Example7 obj = new Example7();
     obj.str1 = obj.str.substring(4);
     System.out.println(obj.str1);
    }
}