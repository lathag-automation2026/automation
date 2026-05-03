package operatorsConcepts;

public class OpratorsCombine {
	
	    public static void main(String[] args) {
	        int x = 5;
	        int y = 3;

	        int add = x + y;
	        int sub = x - y;
	        int mul = x * y;
	        int div = x / y;      // quotient
	        int rem = x % y;      // remainder

	        System.out.println("x > y: " + (x > y));
	        System.out.println("Addition: " + add);
	        System.out.println("Subtraction: " + sub);
	        System.out.println("Multiplication: " + mul);
	        System.out.println("Quotient (Division): " + div);
	        System.out.println("Remainder: " + rem);
	        System.out.println("x == y: " + (x == y));
	    }
	}