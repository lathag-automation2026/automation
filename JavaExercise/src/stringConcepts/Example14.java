package stringConcepts;

public class Example14
{	
	 public static void main(String[] args) {
	      String str = "try";
	      String str1 = "TRY";
	      boolean iscasesame;
	      iscasesame = str.equalsIgnoreCase(str1);
	     System.out.println(iscasesame);
	    }
	}