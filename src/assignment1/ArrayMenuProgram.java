package assignment1;
import java.util.Scanner;
public class ArrayMenuProgram {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println("\n1.Linear Search\n2.Maximum\n3.Even/Odd Count\n4.Insertion Sort");
        System.out.print("Enter choice: ");
        int ch = sc.nextInt();

        switch (ch) {
            case 1:
                System.out.print("Enter element to search: ");
                int key = sc.nextInt();
                boolean found = false;
                for (int i = 0; i < n; i++) {
                    if (arr[i] == key) {
                        System.out.println("Found at index " + i);
                        found = true;
                        break;
                    }
                }
                if (!found)
                    System.out.println("Element not found");
                break;

            case 2:
                int max = arr[0];
                for (int i = 1; i < n; i++)
                    if (arr[i] > max)
                        max = arr[i];
                System.out.println("Maximum value: " + max);
                break;

            case 3:
                int even = 0, odd = 0;
                for (int i : arr) {
                    if (i % 2 == 0) even++;
                    else odd++;
                }
                System.out.println("Even: " + even + " Odd: " + odd);
                break;

            case 4:
                for (int i = 1; i < n; i++) {
                    int temp = arr[i];
                    int j = i - 1;
                    while (j >= 0 && arr[j] > temp) {
                        arr[j + 1] = arr[j];
                        j--;
                    }
                    arr[j + 1] = temp;
                }
                System.out.println("Sorted Array:");
                for (int i : arr)
                    System.out.print(i + " ");
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }
}

