package constructorConcepts1;

public class NoArgumentConstructosExample1 
{
	 int pid;
	   String pname;
	   NoArgumentConstructosExample1()
	     {
	     pid = 100;
	     pname= "Rukmani";
	     } 
	   void display()
	     {
	        System.out.println(pid+" "+pname); 
	     }
	    public static void main(String[] args) {
	    	NoArgumentConstructosExample1 p = new NoArgumentConstructosExample1();
	    p.display();
	    }

}
