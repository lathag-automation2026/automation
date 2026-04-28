package comparatorConcepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AscendingOrderWithComparatorMain {

	public static void main(String[] args)
	{
		
		List<AscendingOrderWithComparator> list=new ArrayList<>();
		
		list.add(new AscendingOrderWithComparator(3,"Ravi"));
		list.add(new AscendingOrderWithComparator(1,"Anu"));
		list.add(new AscendingOrderWithComparator(2,"Ravi"));
		list.add(new AscendingOrderWithComparator(4,"Anu"));

		
		Collections.sort(list,new MyComparator());
		
		for(AscendingOrderWithComparator a:list)
		{
        System.out.println(a.id+ "  "+a.name);

		

	}

	}

	
}
