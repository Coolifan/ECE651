package class_1;
//packages are much like libraries in C and C++

/* 
 *  In java, all code is always written inside a class. Unlike C, code cannot be written outside of a class.
 */

//note that unlike C++ we must specify the visibility type of the class
// Recall visibility types include: public, private, protected
public class Hello {
	
	// This is the main entry point of every java program.
	// note this is how to declare a method (static) in java
	// <visibility> <static or nothing if an instance method> <return type> < method name>
	
	//String[] args is similar to argv, but does not include the name of our program as the first arg
	// int argc can be obtained with args.length
	//String[] args is a required argument, java will not start this is as main without it.
	
//	public static void main(String[] args) {
//		
//		System.out.println("Hello World");
//		
//		//a return type of void means return nothing, unlike C and C++ you should not return an int
//	}
//	
	// this is an example of print out statements and concatenation
	/* **note: if you try to print out object type variables you will get its address value. 
	 *  you must override its toString() method (this is similar to overloading the operator<< in C++)
	 */
	public static void main(String[] args) {
		int x = 3;
		System.out.println("x ="+ x);
	}
	

}
