
package finalVariableConcepts1;

public class VariableAsFinalExample2
{
	//Globally assihned,so we can rechange the value's of k is 'n' number of times.
  static int k;	

	public static void main(String[] args) {
	       System.out.println("value = " + k);

		 k= 100; 
       System.out.println("value = " + k);
       k=200;
       System.out.println("value = " + k);

	}
}
