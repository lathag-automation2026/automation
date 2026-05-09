package pack1;

public class SubClassSamePackage extends AccessModifiersExample 
{

	
	public static void main(String[] args)
    {
        AccessModifiersExample obj =new AccessModifiersExample();

        //System.out.println("private:" +obj.a);//Error
        System.out.println("default:" +obj.b);
        System.out.println("protected:" +obj.c);
        System.out.println("public:" +obj.d);
    }
}

/*
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	The field AccessModifiersExample.a is not visible

	at pack1.SubClassSamePackage.main(SubClassSamePackage.java:19)
	
	*/
