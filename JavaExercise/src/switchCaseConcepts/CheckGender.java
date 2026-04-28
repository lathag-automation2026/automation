package switchCaseConcepts;

public class CheckGender
{
	
	public static void main(String[] args) {
	       char gender = 'F';
	       switch(gender)
	       {
	               case 'M':
	               System.out.println("male");
	               break;
	               case 'F':
	               System.out.println("female");
	               break;
	               default:
	               System.out.println("invalid gender");
	       }
	    }

}
