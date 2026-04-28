package comparableConcepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AscendingOrderWithComparableMain {

	public static void main(String[] args)
	{
		
		List<AscendingOrderWithComparable> list=new ArrayList<>();
		
		list.add(new AscendingOrderWithComparable(3,"Latha"));
		list.add(new AscendingOrderWithComparable(1,"Ravi"));
		list.add(new AscendingOrderWithComparable(2,"Kumar"));
		
		Collections.sort(list);
		
		for(AscendingOrderWithComparable a:list)
		{
        System.out.println(a.id+ "  "+a.name);

		

	}

	}
}
