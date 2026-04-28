package comparatorConcepts;

import java.util.Comparator;

public class MyComparator implements Comparator<AscendingOrderWithComparator>

	{
		public int compare(AscendingOrderWithComparator a1,AscendingOrderWithComparator a2)
		{
			int nameCompare=a1.name.compareTo(a2.name);
			if(nameCompare==0)
			{
				return a1.id-a2.id;
			}
			
			return nameCompare;
		   }

}
