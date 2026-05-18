package stringMethodConcepts;

public class StringBufferExample1 
{
	public static void main(String [] args){

        StringBuilder m = new StringBuilder("SAnthosh");
        m.replace(2,3,"sab");
        System.out.println(m);


        m.reverse();
        System.out.println("REVERSE : - " +m);

        int g = m.length();
        System.out.println("length is " +g);

        int f = m.capacity();
        System.out.println("Capacity is " +f);

        m.delete(3,4);
        System.out.println("delete is " +m);




    }
}


