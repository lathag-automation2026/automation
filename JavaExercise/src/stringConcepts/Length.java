package stringConcepts;

public class Length 
{
	public static void main(String[] args) {
        String s = "Akash";                  // String literal
        String ss = new String("Akash");     // String object using constructor

        System.out.println("String length : " + ss.length());
        
        //we can store it also like
        
        int lengthOfStrings=ss.length();
        
        System.out.println("String length storing with variable : " + lengthOfStrings);

        
    }


}
