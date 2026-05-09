package pack2;

import pack1.AccessModifiersExample;

public class SubClassOutsidePackage extends AccessModifiersExample 
{
	public static void main(String[] args)
    {
		SubClassOutsidePackage obj =new SubClassOutsidePackage();

        //System.out.println("private:" +obj.a);
        //System.out.println("default:" +obj.b);
          System.out.println("protected:" +obj.c);
          System.out.println("public:" +obj.d);
    }

}

/*
Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
	The field AccessModifiersExample.a is not visible
	The field AccessModifiersExample.b is not visible

	at pack2.SubClassOutsidePackage.main(SubClassOutsidePackage.java:11)

*/

/*

Rule for protected

Outside package:

✅ Accessible only through child class object/reference
❌ Not accessible using parent class object

        AccessModifiersExample obj =new AccessModifiersExample();
        then problem to access obj.c 

*/