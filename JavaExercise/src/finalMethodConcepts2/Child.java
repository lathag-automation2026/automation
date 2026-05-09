package finalMethodConcepts2;

public class Child extends Parent {
    // Trying to override display() will cause error----Cannot override the final method from Parent
	//Exception in thread "main" java.lang.IncompatibleClassChangeError: class finalConcepts2.Child overrides final method finalConcepts2.Parent.display()V

  //  void display() 
    //{ 
    //	System.out.println("Override attempt"); 
    //}
}


