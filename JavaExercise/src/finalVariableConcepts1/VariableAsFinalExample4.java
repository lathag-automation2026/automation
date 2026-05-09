package finalVariableConcepts1;

public class VariableAsFinalExample4 
{
	public static void main(String[] args) {
		final  int value = 100; // constant
        System.out.println("value = " + value);

        // Exception in thread "main" java.lang.Error: Unresolved compilation problem: 

        //value = 200;//The final local variable value cannot be assigned. It must be blank and not using a compound assignment
    }

}
