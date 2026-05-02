package stringConcepts;

public class Example15
{	
	 public static void main(String[] args) {
	      String str = "try";
	      String str1 = "TrY";
	      boolean iscasesame;
	      iscasesame = str.equalsIgnoreCase(str1);
	     System.out.println(iscasesame);
	    }
	}