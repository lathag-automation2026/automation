package abstractClassConcepts3;

public class Main 
{
	public static void main(String[] args) {

        // Parent reference -> Child object
        Latha s = new School();

        Latha v = new College();

        // Calling school class method
        s.itsector();

        // Calling static method
        s.goodman();

        // Calling college class method
        v.itsector();

        // Calling static method
        v.goodman();
    }


}
