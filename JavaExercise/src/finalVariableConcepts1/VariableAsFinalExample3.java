
package finalVariableConcepts1;

public class VariableAsFinalExample3
{
	//Globally assihned,so we can rechange the value's  of k is  'n' number of times.
   int k;	

	public static void main(String[] args) {
		VariableAsFinalExample3 obj=new VariableAsFinalExample3();
	       System.out.println("value = " + obj.k);

		 obj.k= 100; 
        System.out.println("value = " + obj.k);
        obj.k=200;
        System.out.println("value = " + obj.k);

	}
}
