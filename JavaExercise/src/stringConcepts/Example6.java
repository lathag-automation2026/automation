package stringConcepts;

public class Example6
{	
	  String  str = "Learning";
      String str1;
    public static void main(String[] args) {
    	Example6 obj = new Example6();
     obj.str1 = obj.str.substring(1,4);
     System.out.println(obj.str1);
    }
}