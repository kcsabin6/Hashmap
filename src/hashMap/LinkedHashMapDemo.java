package hashMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

//LinkedHashMap maintains order

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		Map<Integer,String> map = new LinkedHashMap<>();
		
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

	}
	}

}
