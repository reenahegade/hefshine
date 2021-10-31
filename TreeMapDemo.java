package Collection;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
      

		TreeMap hm=new TreeMap();
			
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
