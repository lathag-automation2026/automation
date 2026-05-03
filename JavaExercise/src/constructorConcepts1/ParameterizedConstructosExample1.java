package constructorConcepts1;

public class ParameterizedConstructosExample1 
{
	 int sid;
	   String sname;
	   ParameterizedConstructosExample1(int id, String name)
	     {
	     sid = id;
	     sname= name;
	     } 
	   void display()
	     {
	        System.out.println(sid+" "+sname); 
	     }
	    public static void main(String[] args) {
	    	ParameterizedConstructosExample1 s = new ParameterizedConstructosExample1(100, "Smriti");
	    s.display();
	    }

}
