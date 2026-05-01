package methodOverridingConcepts;

//2. Subclass (Child Class)

public class Child extends Parent 
{
    
    // Method Overriding:
    // The Son provides a new implementation for the inherited 'marry()' method.
    // The signature (name and parameter list) must match exactly.
    @Override 
    public void marry() 
    {
        System.out.println("Son says: I will marry my true love, not your choice!Bride B");
    }

}
