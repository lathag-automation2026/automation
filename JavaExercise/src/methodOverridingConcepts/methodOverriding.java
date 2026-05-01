package methodOverridingConcepts;

public class  methodOverriding


{
public static void main(String[] args) {
        
        // --- Scenario 1: Son object reference ---
        Child mySon = new Child();
        System.out.print("1. Son's action: ");
        // This calls the OVERRIDDEN method in the Son class.
        mySon.marry(); 

        System.out.println("----------------------------------------");

        // --- Scenario 2: Parent object reference ---
        Parent myParent = new Parent();
        System.out.print("2. Parent's action: ");
        // This calls the original method in the Parent class.
        myParent.marry();

        System.out.println("----------------------------------------");
        
        // --- Scenario 3: Polymorphic reference (Runtime Polymorphism) ---
        // Reference type is Parent, but the actual object type is Son.
   
        
        Parent sonAsParent = new Child(); 
        System.out.print("3. Polymorphic action: ");
        
        // The method called is determined at RUNTIME based on the actual object (Son),
        // not the reference type (Parent).
        sonAsParent.marry(); 
    }

}
