package methodOverridingConcepts3;

public class Main 
{


	    public static void main(String[] args) {

	        // Parent class object
	        Months p = new Months();
	        p.may();

	        // Child class object with overriding
	        Years s = new Years();
	        s.may();

	        // Child class object without overriding
	        Dates bs = new Dates();
	        bs.may();
	    }
	}


