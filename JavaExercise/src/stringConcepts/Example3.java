package stringConcepts;

public class Example3
{	
	String  str = "Learning";
    char ch;
  public static void main(String[] args) {
	  Example3 obj = new Example3();
   obj.ch = obj.str.charAt(4);
   System.out.println(obj.ch);
  }
}