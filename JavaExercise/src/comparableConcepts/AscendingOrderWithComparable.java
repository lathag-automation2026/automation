package comparableConcepts;

public class AscendingOrderWithComparable  implements  Comparable<AscendingOrderWithComparable>
{
	int id ;
	String name;
	
	AscendingOrderWithComparable( int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public int compareTo(AscendingOrderWithComparable a)
	{
		return this.id- a.id;
	}
	

}
