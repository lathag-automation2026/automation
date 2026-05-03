package singleInheritanceConcepts1;

public class SingleInheritance 
{
	public static void main(String[] args) {
        Dog obj = new Dog();
        obj.bark();
        obj.eat();
    }
}


//Explanation:

//Base Class (Parent Class):

//Animal is the base class.
//It has a method eat().
//Derived Class (Child Class):

//Dog is the derived class, inheriting from Animal.
//It inherits the eat() method from Animal.
//It has its own specific method bark().
//Inheritance in Action:

//In the main method, a Dog object is created.
//The dog object can access both inherited methods (eat()) and its own specific method (bark()).

