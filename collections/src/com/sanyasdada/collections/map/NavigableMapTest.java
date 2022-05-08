package com.sanyasdada.collections.map;

import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.TreeMap;

public class NavigableMapTest {
	public static void main(String[] args) {
		NavigableMap<Integer, String> httpMapCodes = new TreeMap<>();
		// .1xx informational response -> the request was received, continuing process
		httpMapCodes.put(100, "continue");
		httpMapCodes.put(101, "switching protocols");
		// .2xx successful->>> the request was successfully receive, understood,and
		// accepted
		httpMapCodes.put(200, "Ok");
		httpMapCodes.put(203, "non-authoritative Information");
		httpMapCodes.put(204, "no Content");
		// .3xx redirection->>>further action needs to be taken in order to complete the
		// request
		httpMapCodes.put(300, "multiple Choices");
		httpMapCodes.put(305, "use Proxy");
		// .4xx client error->>> the request contains bad syntax or cannot be fulfilled
		httpMapCodes.put(400, "bad Request");
		httpMapCodes.put(401, "unauthorized");
		httpMapCodes.put(402, "payment Required");
		httpMapCodes.put(404, "not Found");
		// .5xx server error->>> the server failed to fulfill an apparently valid
		// request
		httpMapCodes.put(500, "internal Server Error");
		httpMapCodes.put(501, "bad Gateway");

		System.out.println(httpMapCodes);
		System.out.println("Plan always beat Non-Plan");
		System.out.println("=================");

		for (Integer code : httpMapCodes.keySet()) {
			System.out.println(code + "->" + httpMapCodes.get(code));
		}
		Entry<Integer, String> ceilingEntry = httpMapCodes.ceilingEntry(401);
		System.out.println("ceilingEntry:" + ceilingEntry);
		System.out.println("=================");

		Integer ceilingKey = httpMapCodes.ceilingKey(300);
		System.out.println("ceillingKey:" + ceilingKey);

		Entry<Integer, String> firstEntry = httpMapCodes.firstEntry();
		System.out.println("firstEntry:" + firstEntry);

		Entry<Integer, String> lastEntry = httpMapCodes.lastEntry();
		System.out.println("lastEntry:" + lastEntry);

		Entry<Integer, String> floorEntry = httpMapCodes.floorEntry(403);
		System.out.println("floorEnrty:" + floorEntry);

		Integer floorKey = httpMapCodes.floorKey(200);
		System.out.println("floorKey:" + floorKey);

		Integer higherKey = httpMapCodes.higherKey(404);
		System.out.println("higherKey:" + higherKey);

		Entry<Integer, String> higherEntry = httpMapCodes.higherEntry(300);
		System.out.println("higherEntry:" + higherEntry);

		Entry<Integer, String> pollFirstEntry = httpMapCodes.pollFirstEntry();
		System.out.println("pollFirstEntry:" + pollFirstEntry);

		Entry<Integer, String> pollLastEntry = httpMapCodes.pollLastEntry();
		System.out.println("pollLastEntry:" + pollLastEntry);
		// Descending order using NabigableSet
		NavigableSet<Integer> descendingKeySet = httpMapCodes.descendingKeySet();
		System.out.println("descendingKeySet:" + descendingKeySet);

		// Ascending order Using navigableSet
		NavigableSet<Integer> navigableKeySet = httpMapCodes.navigableKeySet();
		System.out.println("navigableKeySet:" + navigableKeySet);

		SortedMap<Integer, String> headMap = httpMapCodes.headMap(300);
		System.out.println("headMap:" + headMap);

		SortedMap<Integer, String> tailMap = httpMapCodes.tailMap(200);
		System.out.println("tailMap:" + tailMap);

		SortedMap<Integer, String> subMap = httpMapCodes.subMap(200, 500);
		System.out.println("subMap:" + subMap);

		boolean inclusive = false;
		NavigableMap<Integer, String> tailMap2 = httpMapCodes.tailMap(300, inclusive);
		System.out.println("tailmap2:" + tailMap2);

		System.out.println(httpMapCodes);
	}

}
