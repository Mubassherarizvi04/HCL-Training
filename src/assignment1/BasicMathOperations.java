package assignment1;
import java.util.Scanner;
public class BasicMathOperations {

		    static int add(int a, int b) { return a + b; }
		    static int subtract(int a, int b) { return a - b; }
		    static int multiply(int a, int b) { return a * b; }
		    static int divide(int a, int b) { return a / b; }
		    static int remainder(int a, int b) { return a % b; }
		    static int square(int a) { return a * a; }
		    static int cube(int a) { return a * a * a; }
		    static int absolute(int a) { return Math.abs(a); }

		    public static void main(String[] args) {
		        Scanner Sc = new Scanner(System.in);

		        System.out.print("Enter first number: ");
		        int a = Sc.nextInt();
		        System.out.print("Enter second number: ");
		        int b = Sc.nextInt();

		        System.out.println("Addition: " + add(a, b));
		        System.out.println("Subtraction: " + subtract(a, b));
		        System.out.println("Multiplication: " + multiply(a, b));
		        System.out.println("Division: " + divide(a, b));
		        System.out.println("Remainder: " + remainder(a, b));
		        System.out.println("Square: " + square(a));
		        System.out.println("Cube: " + cube(a));
		        System.out.println("Absolute: " + absolute(a));
		    }
		    
}
