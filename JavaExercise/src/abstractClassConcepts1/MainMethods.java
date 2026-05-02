package abstractClassConcepts1;

public class MainMethods 
{
	public static void main(String[] args)
	{
		Animal myDog=new Dog();
		Animal mycat=new Cat();
		
		System.out.println("Dog");
		myDog.makeSound();
		myDog.eat();
		
		System.out.println("\nCat");
		mycat.makeSound();
		mycat.eat();
		
		myDog.sleep();
		
	}

}
