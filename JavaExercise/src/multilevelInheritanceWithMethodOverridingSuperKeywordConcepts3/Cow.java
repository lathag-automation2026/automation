package multilevelInheritanceWithMethodOverridingSuperKeywordConcepts3;

public class Cow extends Animal
{
    String feed = "grass";
    void makesound()
    {
       super.makesound();
       System.out.println("Cow moos..."); 
    }
  } 
