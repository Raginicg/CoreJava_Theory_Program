package Basic;
/**@author ragigupt
 */

/*
 * Q. Can we overload java main() method? 
 * Yes, by method overloading. You can have any number of main methods in a class by method overloading. 
 * But JVM calls main() method which receives string array as arguments only. 
 * Let's see the simple example:
 */

public class MainMethodOverload {
public static void main(String[] args) {
	System.out.println("Main method with String[]");
}
public static void main(String a) {
	System.out.println("Same name as main method " + a);
}
public static void main() {
	System.out.println("Main with no argument");
}
}
