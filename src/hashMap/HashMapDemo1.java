package hashMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//keys cannot be duplicated (but value can be duplicates)
//keys should override hashCode and equals methods
//keys are not ordered
//keys can contain only one null value
//values can contain any number of null, since duplicates are allowed for values

public class HashMapDemo1 {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<>();
		
		map.put("123", "Sabin");
		map.put("135", "amit");
		map.put("212", "prabhat");
		map.put("12", "aayush");
		map.put("312", "denis");
		map.put("75", "suman");
		map.put("87", "mandy");
		
	//	map.put("123", "SABIN");
		
		String oldValue = map.put("123", "SABIN");
		System.out.println(oldValue);
	
		//	System.out.println(map);
		
		map.put(null, "suman");
		map.put(null, "mandy");
		
		/*Map<String,String> outmap=Collections.unmodifiableMap(map);
		outmap.put("134", "mandy"); //Exception since outmap is read only copy
		*/
		
		//Iteration by using Map.Entry interface...this is the fastest method for iterating a map
		
		/*Set<Entry<String,String>> entries= map.entrySet();	//Entry<> is like a row of objects
		for (Entry<String,String> e: entries) {	//entries points to all set of row of objects
			System.out.println(e.getKey()+" "+e.getValue()); // e points to each row/Entry<>
			//System.out.println(e.getValue());
		}*/
		
		//Using iterator
		Set<Entry<String,String>> entry = map.entrySet();
		Iterator<Entry<String,String>> it = entry.iterator();
		while(it.hasNext()) {
			Map.Entry<String,String> e= it.next();
			System.out.println(e.getKey()+" "+e.getValue());
		}

	}

}
