package jung.jae.com.mathod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class PassionOfSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<Integer>();
		while(list.size() <=50) {
			double randomdom = Math.random();
			int random = (int)(randomdom * 100) + 1;
			if(list.contains(random)) {
				continue;
			}else {
				list.add(random);
			}
		}
		
			Collections.sort(list, new Comparator<Integer>() {
				@Override
				public int compare(Integer o1, Integer o2) {
					if(o1>o2) {
						return -1;
					}else if(o1<o2) {
						return 1;
					}else {
						return 0;
					}
				}
			});
			for(int i = 0 ; i < list.size() ; i++) {
				//System.out.println("randomNum : " + list.get(i));
			
			System.out.println(list.get(i));
			}
			Iterator<Integer> iter = list.iterator();
			while(iter.hasNext()) {
				int item = iter.next();
				System.out.println(item);
			}
	}
}