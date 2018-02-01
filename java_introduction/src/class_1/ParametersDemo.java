package class_1;

public class ParametersDemo {

	
	public static void swap(String v1, String v2) {
		String temp = v1;
		v1 = v2;
		v2 = temp;
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myname = "Niral Shah";
		String profname = "Ric Telford";
		System.out.println(myname+", "+profname);
		
		//since java only has references we can't implement a proper swap function as we might in C or C++ 
		// with pointers
		swap(myname,profname);
		System.out.println(myname+", "+profname);
	}

}
