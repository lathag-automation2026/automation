package constructorConcepts;

public class NoArgumentConstructos 
{
	 int pid;
	   String pname;
	   NoArgumentConstructos()
	     {
	     pid = 100;
	     pname= "Rukmani";
	     } 
	   void display()
	     {
	        System.out.println(pid+" "+pname); 
	     }
	    public static void main(String[] args) {
	    	NoArgumentConstructos p = new NoArgumentConstructos();
	    p.display();
	    }

}
