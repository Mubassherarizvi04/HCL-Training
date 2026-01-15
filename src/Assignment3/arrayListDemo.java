package Assignment3;
import java.util.*;

public class arrayListDemo {
   
	public static void main(String[] args) {

        // Constructors
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>(10);
        ArrayList<String> list3 = new ArrayList<>(Arrays.asList("A", "B", "C"));

        // Methods
        list1.add("Java");
        list1.add("Python");
        list1.add(1, "C++");
        list1.addAll(list3);
        list1.remove("B");
        list1.remove(0);
        list1.set(1, "JavaScript");
        System.out.println(list1.get(0));
        System.out.println(list1.contains("Java"));
        System.out.println(list1.indexOf("C"));
        System.out.println(list1.isEmpty());
        System.out.println(list1.size());
        list1.ensureCapacity(20);
        list1.trimToSize();
        list1.clear();
        System.out.println("ArrayList cleared: " + list1);
    }
}

