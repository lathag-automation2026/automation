package methodOverloadingConcepts2;

public class Book 
{
	 // Method with int parameters
    public int accounts(int a, int b) {
        return (a + b);
    }

    // Method with double parameters
    public double accounts(double a, double f) {
        double c = a * f;
        System.out.println(c);
        return c;
    }

    // Method with no parameters
    public String maths() {
        System.out.println("Applied Mathematics Paper 1");
        return null;
    }
}

