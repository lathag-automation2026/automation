package thisKeywordExamples;

public class Student 
{
int marks;

	// Constructor
	Student(int marks) 
	{
    this.marks = marks; // this.marks = current object variable
	}

	void display() 
	{
    System.out.println("Marks = " + this.marks);
	}
}

