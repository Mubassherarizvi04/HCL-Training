package Assignment3;
import java.util.*;

public class HashMapDemo {

	public static void main(String[] args) {

        // Constructors
        HashMap<Integer, String> map1 = new HashMap<>();
        HashMap<Integer, String> map2 = new HashMap<>(16);
        HashMap<Integer, String> map3 = new HashMap<>(16, 0.75f);
        HashMap<Integer, String> map4 = new HashMap<>(map1);

        // Methods
        map1.put(1, "Java");
        map1.put(2, "Python");
        map1.putIfAbsent(3, "C++");
        map1.replace(2, "JavaScript");
        System.out.println(map1.get(1));
        System.out.println(map1.containsKey(3));
        System.out.println(map1.containsValue("Java"));
        map1.remove(1);
        System.out.println(map1.size());
        System.out.println(map1.isEmpty());
        System.out.println(map1.keySet());
        System.out.println(map1.values());
        System.out.println(map1.entrySet());
        map1.clear();
        System.out.println("HashMap cleared: " + map1);
    }
}

