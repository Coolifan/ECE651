package class_1;

public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point efg = new Point(1,2);
		
		ColorPoint abc = new ColorPoint(1,2,"Red");
		
		System.out.println(abc);
		
		System.out.println(abc.compareTo(efg));
	}

}
