package com.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HM1 {

	public static void main(String[] args) {
			HashMap hm=new HashMap<>();
			System.out.println(hm.size());
			System.out.println(hm.isEmpty());
			hm.put(1, "Dinga");
			hm.put(3, "kalu");
			hm.put(2, "Dingi");
			hm.put("Simba",null );
			System.out.println("++++++++++");
			System.out.println(hm);
			hm.put(3, "Kaali");
			System.out.println("++++++++++");
			System.out.println(hm);
			System.out.println(hm.put(null, 2));//it returns key 
			System.out.println("+++++++++++++++++");
			System.out.println(hm);
			System.out.println(hm.put(null, "hi"));//it returns previous key value
			System.out.println(hm);
			System.out.println(hm.remove("Simba"));// it returns value
			System.out.println(hm.containsKey(3));
			//we can iterate through keySet
			Set keys=hm.keySet();
			System.out.println(keys);
			Iterator n = keys.iterator();
			while(n.hasNext()) {
				System.out.println(n.next());
			}
			//We can iterate through values through Collections values()
			Collection values = hm.values();
			System.out.println(values);
			System.out.println("++++++++++++++");
			Iterator n1 = values.iterator();
			while(n1.hasNext()) {
				System.out.println(n1.next());
			}
			
			System.out.println(hm.get(2));//to get the value return value
			System.out.println(hm.remove(1));//remove and return the value
			hm.clear();
			System.out.println(hm);
	}

}
