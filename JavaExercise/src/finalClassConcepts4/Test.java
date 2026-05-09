/* package finalClassConcepts4;

public class Test 
{
	final Test()   //Illegal modifier for the constructor in type Test; only public, protected & private are permitted
    {

    }
}


 In Java, we cannot make a constructor final.


Java gives compile-time error because:
======================================

Constructors are not inherited, so there is no need to prevent overriding.

final keyword is used to stop:
===============================

1.variable value changing can not do .
2.method overriding is not possible.(final method can be inherited ,but can not be overrridden).
3.class inheritance is not possible
4.constructor  can not create.

*/
