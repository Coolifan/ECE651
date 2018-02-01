package class_1;

public class ColorPoint extends Point {
	
	String color;
	
	public ColorPoint(int x, int y, String c) {
		super.x=x;
		super.y=y;
		color =c;
	}
	
	public String toString() {
		return super.toString()+" :: "+color;
	}
}
