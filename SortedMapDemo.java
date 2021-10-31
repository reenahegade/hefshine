package Collection;

import java.util.HashMap;
import java.util.SortedMap;

public class SortedMapDemo {

	public static void main(String[] args) {
	SortedMap hm=new SortedMap();
		
		hm.put(9, "rani");
		hm.put(5, "prachi");
		hm.put(7, "ravina");
		hm.put(1, "lina");
		hm.put(3, "mittal");	
		System.out.println(hm);
		System.out.println(hm.replace(1, "sita"));
		System.out.println(hm.entrySet());
		System.out.println(hm.keySet());
		
	}
	}

