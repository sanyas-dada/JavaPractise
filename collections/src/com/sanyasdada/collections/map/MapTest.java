package com.sanyasdada.collections.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapTest {
	public static void main(String[] args) {
		Map<Integer, String> mapping = new TreeMap<Integer, String>();
		mapping.put(10, "Sanyas");
		mapping.put(21, "CEO");
		mapping.put(5, "Millionare");
		mapping.put(49, "Billionare");
		mapping.put(50, "Energetic");
		System.out.println(mapping);
		System.out.println("___________");

		Map<String, String> coding = new HashMap<String, String>();
		coding.put("ja", "Java");
		coding.put("Py", "Python");
		coding.put("Al", "ArtificalIntelligent");
		coding.put("c#", "c-sharp");

		System.out.println(coding);
		System.out.println("________");
		Set<String> keyset = coding.keySet();
		Iterator<String> it = keyset.iterator();
		while (it.hasNext()) {
			String next = it.next();
			String string = coding.get(next);
			System.out.println(next + "=>" + string);

		}
		System.out.println("==================");
		Set<Entry<String, String>> entrySet = coding.entrySet();
		for (Entry<String, String> entry : entrySet) {
			String key2 = entry.getKey();
			String value = entry.getValue();
			System.out.println(key2 + "-->>" + value);

		}
		System.out.println("===================");
         // If the specified key value is not associated the 
		// value in preceding the map,then it returns null, otherwise it returns value associated with it.
		String putIfAbsent = coding.putIfAbsent("c", "code");
		System.out.println(putIfAbsent);
		System.out.println(coding);
		System.out.println("=====================");
		


		/// In Hashmap,order of element is not guaranteed maintated.but,
		// order of element is guaranteed maintained in treemap.
		Set<Integer> keySet2 = mapping.keySet();
		for (int key : keySet2) {
			String s = mapping.get(key);
			System.out.println(key + ":" + s);

		}

		String string = mapping.get(10);
		System.out.println(string);

		boolean containsValue = mapping.containsValue("Billionare");
		if (containsValue) {
			System.out.println("i am going to make powerful software application inthis world");
		} else {
			System.out.println("yes, i always get up early in the morning no matter when i go to bed ");
		}

		// size of the mapping
		int size = mapping.size();
		System.out.println(size);

		// removing the element using by key value
		// String remove = mapping.remove(50);
		// System.out.println(remove);

		// removing the pair by using key and values pair
		mapping.remove(50, "Energetic");

		// replacing the value using specified keys
		mapping.replace(32, "Enthusiastic");

		System.out.println(mapping);

		boolean containsKey = mapping.containsKey(10);
		if (containsKey) {
			System.out.println("I am going to change rational or logical decision completeley");
		}

		// Replacing the existing value into new value using same key
		mapping.replace(32, "Enthusiastic", "HungryforKnowledge");
		System.out.println("____****_____*****");
		System.out.println(mapping);
		Collection<String> values = mapping.values();
		Set<Integer> keySet = mapping.keySet();
		System.out.println(values);
		System.out.println(keySet);

	}

}
