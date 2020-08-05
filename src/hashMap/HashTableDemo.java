package hashMap;

import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//Synchronized
//default capacity 11
//cannot contain null keys/values

public class HashTableDemo {
	public static void main(String[] args) {
		Map<String,String> map = new Hashtable<>();
		
		map.put("123", "Sabin");
		map.put("135", "amit");
		map.put("212", "prabhat");
		map.put("12", "aayush");
		map.put("312", "denis");
		map.put("75", "suman");
		map.put("87", "mandy");
		

		Set<Entry<String,String>> entries= map.entrySet();	//Entry<> is like a row of objects
		for (Entry<String,String> e: entries) {	//entries points to all set of row of objects
			System.out.println(e.getKey()+" "+e.getValue()); // e points to each row/Entry<>
			//System.out.println(e.getValue());
		}
	}

}
