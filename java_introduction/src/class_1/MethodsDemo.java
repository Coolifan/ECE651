package class_1;

public class MethodsDemo {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point abc = new Point();
		Point efg = new Point(1,2);
		
		//instance method
		System.out.println(abc.add(efg));
		
		
		//static method:
		System.out.println(Point.eucl_dist(abc, efg));
		
	}

}
