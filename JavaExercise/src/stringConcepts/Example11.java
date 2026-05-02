package stringConcepts;

public class Example11
{	
	  String  str1 = "IT";
      String  str2 = "World";
      String strjoined;
    public static void main(String[] args) {
    	Example11 obj = new Example11();
     obj.strjoined = obj.str1.concat(obj.str2);
     System.out.println(obj.strjoined);
    }
}