package assignment1;

public class StringOperations {

	 public static void main(String[] args) {
	        String s = " Hello Java ";

	        System.out.println("Length: " + s.length());
	        System.out.println("Is Empty: " + s.isEmpty());
	        System.out.println("CharAt: " + s.charAt(1));
	        System.out.println("Equals: " + s.equals("Java"));
	        System.out.println("CompareTo: " + s.compareTo("Hello"));
	        System.out.println("Contains: " + s.contains("Java"));
	        System.out.println("IndexOf: " + s.indexOf('a'));
	        System.out.println("LastIndexOf: " + s.lastIndexOf('a'));
	        System.out.println("StartsWith: " + s.startsWith(" "));
	        System.out.println("EndsWith: " + s.endsWith(" "));
	        System.out.println("Substring: " + s.substring(1, 6));
	        System.out.println("Lowercase: " + s.toLowerCase());
	        System.out.println("Trim: " + s.trim());
	        System.out.println("Replace: " + s.replace("Java", "World"));
	    }
}
