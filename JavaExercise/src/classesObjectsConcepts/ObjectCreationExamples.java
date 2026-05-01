package classesObjectsConcepts;

public class ObjectCreationExamples 
{
	 int pid;
	   String pname;
	   int age;
	   String department;
	   void displaypatientdetails()
	   {
	     System.out.println("Patient ID:"+pid);
	     System.out.println("Patient name:"+pname);
	     System.out.println("Patient Age:"+age);  
	     System.out.println("Department:"+department);  
	   }
	    public static void main(String[] args) {
	    	ObjectCreationExamples p1 = new ObjectCreationExamples();
	       p1.pid =100;
	       p1.pname = "Rukmani";
	       p1.age = 78;
	       p1.department = "Cardiac diseases";
	       p1.displaypatientdetails();
	       
	       ObjectCreationExamples p2 = new ObjectCreationExamples();
	       p2.pid =101;
	       p2.pname = "Kannan";
	       p2.age = 87;
	       p2.department = "Oncology";
	       p2.displaypatientdetails();
	    }

}
