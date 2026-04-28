package conditionalStatementsConcepts;

public class UsernamePasswordLogin 
{
	
	public static void main(String[] args) {
	      String username = "Admin";
	      String password = "Passcode@06";
	      if(username=="Admin"&& password=="Passcode@p6")
	      {
	       System.out.println("Login successful!!");   
	      }
	      else
	      {
	          System.out.println("Invalid credentials");
	      }
	    }

}
