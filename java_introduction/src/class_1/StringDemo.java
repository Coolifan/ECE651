package class_1;

public class StringDemo {
	public static final String HELLO_WORLD= "Hello World";
	
	public static void main(String[] args) {
		
		System.out.println(HELLO_WORLD);
		
		//two ways to declare & intialize a String object
		String name_heap = new String("Ric Telford");
		String name = "Ric Telford";
		//Note: Comparison
		//In java objects may not be compared with the == operator. It must use the .equals() 
		
		String myname = "Niral Shah";
		
		if(name_heap.equals(myname)) {
			System.out.println("Wow that's impossible!");
		} else {
			//note concatenation with the + operator
			System.out.println(myname+" does not equal "+ name_heap);
		}
		
		//String methods:
		//many more string methods
		int i_space = name.indexOf(' '); // will return first index of char ' ' (space)
		char val = name.charAt(i_space); // will return character at a specific index
		
		int len = name.length(); // gets the length of the string
		
		String lowercase_name = name.toLowerCase();
		System.out.println(lowercase_name);
		
		//For Reference:
		//String pooling discussion:
	
		String name2 = "Ric Telford";
		System.out.println(name==name2); // will output true (as both refer to same reference in memory)
		System.out.println(name==name_heap); // will output false (different locations)
		
		
		
	}

}
