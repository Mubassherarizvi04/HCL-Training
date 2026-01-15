package Assignment3;
import java.util.*;

public class TreeMapDemo {

	 public static void main(String[] args) {

	        // Constructors
	        TreeMap<Integer, String> tm1 = new TreeMap<>();
	        TreeMap<Integer, String> tm2 = new TreeMap<>(Comparator.reverseOrder());
	        TreeMap<Integer, String> tm3 = new TreeMap<>(tm1);

	        // Methods
	        tm1.put(1, "One");
	        tm1.put(2, "Two");
	        tm1.put(3, "Three");
	        tm1.putIfAbsent(4, "Four");
	        System.out.println(tm1.get(2));
	        System.out.println(tm1.firstKey());
	        System.out.println(tm1.lastKey());
	        System.out.println(tm1.ceilingKey(2));
	        System.out.println(tm1.floorKey(3));
	        System.out.println(tm1.higherKey(2));
	        System.out.println(tm1.lowerKey(3));
	        System.out.println(tm1.keySet());
	        System.out.println(tm1.values());
	        tm1.remove(1);
	        tm1.clear();
	        System.out.println("TreeMap cleared: " + tm1);
	    }
}
