package methodOverloadingConcepts2;

public class Main 
{
	    public static void main(String[] args) {

	        Book y = new Book();

	        int m = y.accounts(2, 4);

	        y.accounts(0.5, 0.8);

	        y.maths();

	        System.out.println(m);
	    }
	}

