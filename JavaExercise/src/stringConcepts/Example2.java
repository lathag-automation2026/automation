package stringConcepts;

public class Example2
{	
	String  str = "Java program";
    int length;
  public static void main(String[] args) {
	  Example2 obj = new Example2();
   obj.length = obj.str.length();
   System.out.println(obj.length);
   System.out.println(obj.length*2);

   System.out.println(obj.str.length()*2);

  }
}