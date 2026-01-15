package Assignment3;
import java.util.*;
public class HashtableDemo {

	 public static void main(String[] args) {

	        // Constructors
	        Hashtable<Integer, String> ht1 = new Hashtable<>();
	        Hashtable<Integer, String> ht2 = new Hashtable<>(10);
	        Hashtable<Integer, String> ht3 = new Hashtable<>(10, 0.75f);
	        Hashtable<Integer, String> ht4 = new Hashtable<>(ht1);

	        // Methods
	        ht1.put(1, "Apple");
	        ht1.put(2, "Banana");
	        ht1.putIfAbsent(3, "Mango");
	        ht1.replace(2, "Orange");
	        System.out.println(ht1.get(1));
	        System.out.println(ht1.containsKey(3));
	        System.out.println(ht1.containsValue("Apple"));
	        ht1.remove(1);
	        System.out.println(ht1.size());
	        System.out.println(ht1.isEmpty());
	        System.out.println(ht1.keys());
	        System.out.println(ht1.elements());
	        System.out.println(ht1.entrySet());
	        ht1.clear();
	        System.out.println("Hashtable cleared: " + ht1);
	    }
}