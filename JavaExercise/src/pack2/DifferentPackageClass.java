package pack2;

import pack1.AccessModifiersExample;

public class DifferentPackageClass 
{
	public static void main(String[] args)
    {
        AccessModifiersExample obj =new AccessModifiersExample();
        //System.out.println("private:" +obj.a);//Error
        //System.out.println("default:" +obj.b);//Error
        //System.out.println("protected:" +obj.c);//Error
         System.out.println("public:" +obj.d);
    }

}

/*
Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
	The field AccessModifiersExample.a is not visible
	The field AccessModifiersExample.b is not visible
	The field AccessModifiersExample.c is not visible

	at package2Concepts.DifferentPackageClass.main(DifferentPackageClass.java:10)
*/