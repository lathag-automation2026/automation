package pack1;

public class AccessModifiersExample 
{
	private int a = 10;
            int b = 20;   // default
  protected int c = 30;
  public    int d = 40;
		
		public void display()
		{
	        System.out.println("private:" +a);
	        System.out.println("default:" +b);
	        System.out.println("protected:" +c);
	        System.out.println("public:" +d);
	
		}
		
		public static void main(String[] args)
	    {
	        AccessModifiersExample obj =new AccessModifiersExample();

	        System.out.println("private:" +obj.a);
            System.out.println("default:" +obj.b);
	        System.out.println("protected:" +obj.c);
	        System.out.println("public:" +obj.d);
	    }
	}
		
