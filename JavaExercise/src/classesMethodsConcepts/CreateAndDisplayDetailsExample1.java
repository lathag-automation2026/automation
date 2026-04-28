package classesMethodsConcepts;

public class CreateAndDisplayDetailsExample1 
{

	    public String Bookdetails() {
	        String bookname = "Harry Potter Series";
	        String author = "JK Rowling";
	        return "Name of the book: " + bookname + ", Author: " + author;
	    }

	    public static void main(String[] args) {
	    	CreateAndDisplayDetailsExample1 b = new CreateAndDisplayDetailsExample1();
	        System.out.println(b.Bookdetails());
	    }
	}

