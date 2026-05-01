package constructorConcepts;

public class ParameterizedConstructos 
{
	 int sid;
	   String sname;
	   ParameterizedConstructos(int id, String name)
	     {
	     sid = id;
	     sname= name;
	     } 
	   void display()
	     {
	        System.out.println(sid+" "+sname); 
	     }
	    public static void main(String[] args) {
	    	ParameterizedConstructos s = new ParameterizedConstructos(100, "Smriti");
	    s.display();
	    }

}
