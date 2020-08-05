package hashMap;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		//Map<Integer,String> map = new TreeMap<>();
		Map<Integer,String> map = new TreeMap<>( new SortMapInDescendingOrder());
		
		map.put(123, "Sabin");
		map.put(135,"amit");
		map.put(212, "prabhat");
		map.put(12, "aayush");
		map.put(312, "denis");
		map.put(75, "suman");
		map.put(87, "mandy");
		
		//System.out.println(map);
		
		Set<Entry<Integer,String>> entries= map.entrySet();	//Entry<> is like a row of objects
		for (Entry<Integer,String> e: entries) {	//entries points to all set of row of objects
			System.out.println(e.getKey()+" "+e.getValue()); // e points to each row/Entry<>
			//System.out.println(e.getValue());
		}

	}

}
