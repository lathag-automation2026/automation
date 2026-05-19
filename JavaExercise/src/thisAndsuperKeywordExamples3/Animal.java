package thisAndsuperKeywordExamples3;

public class Animal 
{
	String name;

	// Constructor using this keyword
	Animal(String name) 
	{
    this.name = name;
	}
	 // Parent method
    public void catsound() {
        System.out.println("Animal name is: " + this.name);
        System.out.println("The animal makes a sound");
    }
}

