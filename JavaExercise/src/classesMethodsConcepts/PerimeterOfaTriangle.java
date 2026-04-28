
package classesMethodsConcepts;

public class PerimeterOfaTriangle 
{
	
	public int Perimeterofatrian(int x, int y, int z)
    {
       int perimeter = x+y+z;
        System.out.println("Perimeter of the triangle is"+ perimeter);
        return perimeter;
    }
    public static void main(String[] args) {
    	PerimeterOfaTriangle p = new PerimeterOfaTriangle();
        p.Perimeterofatrian(12,15,18);
    }

}
