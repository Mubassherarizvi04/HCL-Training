package Assignment3;
import java.util.*;

public class vectorDemo {

	public static void main(String[] args) {

        // Constructors
        Vector<Integer> v1 = new Vector<>();
        Vector<Integer> v2 = new Vector<>(10);
        Vector<Integer> v3 = new Vector<>(10, 5);
        Vector<Integer> v4 = new Vector<>(Arrays.asList(1, 2, 3));

        // Methods
        v1.add(10);
        v1.addElement(20);
        v1.add(30);
        v1.insertElementAt(40, 1);
        v1.removeElement(20);
        v1.remove(0);
        v1.set(0, 100);
        System.out.println(v1.get(0));
        System.out.println(v1.capacity());
        System.out.println(v1.size());
        System.out.println(v1.contains(30));
        System.out.println(v1.firstElement());
        System.out.println(v1.lastElement());
        v1.clear();
        System.out.println("Vector cleared: " + v1);
    }
}
