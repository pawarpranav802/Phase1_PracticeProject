package AssistedPractice.com;

//Java Program to Demonstrate
//Working of Map interface

import java.util.*;
public class UsesOfMap {

	// Main driver method
	public static void main(String args[])
	{
		// Creating an empty HashMap
		Map<String, Integer> hm
			= new HashMap<String, Integer>();
		hm.put("a", new Integer(45));
		hm.put("b", new Integer(50));
		hm.put("c", new Integer(60));
		hm.put("d", new Integer(70));

		// Traversing through Map using for-each loop
		for (Map.Entry<String, Integer> me :
			hm.entrySet()) {

			// Printing keys
			System.out.print(me.getKey() + ":");
			System.out.println(me.getValue());
		}
	}
}

