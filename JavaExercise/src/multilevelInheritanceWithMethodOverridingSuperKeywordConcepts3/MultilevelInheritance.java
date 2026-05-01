package multilevelInheritanceWithMethodOverridingSuperKeywordConcepts3;

public class MultilevelInheritance 
{
	
 public static void main(String[] args) {
    
    Cow cobj = new Cow();
    cobj.makesound();
    System.out.println(cobj.feed);
     System.out.println(cobj.food);
     
     Animal dobj = new Cow();
     dobj.makesound();
     
     Animal eobj = new Animal();
     eobj.makesound();


    
  }

}
