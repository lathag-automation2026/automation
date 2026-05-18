package dataTypesConcepts;

public class TypeConversion1 
{
	public static void main(String[] args) 
	{
	int n = '1';
	int t = '0';
	
    System.out.println("n:" +n);
    System.out.println("t:" +t);
    
    char c = 'A';
    int w = c;

    System.out.println("c:" +c); 
    System.out.println("w:" +w); 
    
    int a = 65;
    char d = (char)a;
    System.out.println("d:" +d); 


   }
}
