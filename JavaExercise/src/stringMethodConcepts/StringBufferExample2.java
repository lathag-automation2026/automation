package stringMethodConcepts;

public class StringBufferExample2 
{
	public static void main(String[] args) 
    {
        StringBuffer f = new StringBuffer("Tamilnadu is much better compare other state");

        f.append(" Tamilnadu");
        System.out.println(f);

        f.insert(0, "santhosh ");
        System.out.println(f);
    }
}


//append() means add something at the end.
