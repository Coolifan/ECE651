package class_1;

public class Point implements Comparable<Point> {
	
	public int x;
	public int y;
	
	public Point() {
		x =0;
		y=0;
	}
	
	public Point(int x1, int y1) {
		x=x1;
		y=y1;
	}
	
	//instance method:
	//this makes sense as it requires the properties of the object (public int x,...) 

	public Point add(Point b) {
		int newx = this.x+b.x;
		int newy = this.y+b.y;
		Point temp = new Point(newx,newy);
		return temp;
	}
	
	public static double eucl_dist(Point a, Point b) {
		double x_dist = a.x-b.x;
		double y_dist = a.y-b.y;
		return Math.sqrt(Math.pow(x_dist, 2)+Math.pow(y_dist, 2)); 
	}
	
	//overrides Object class' toString Method
	public String toString() {
		String temp = "("+this.x+","+this.y+")";
		return temp;
	}

	@Override
	public int compareTo(Point p) {
		if(this.x>p.x) {
			return 1;
		}else if(this.x<p.x) {
			return -1;
		}
		return 0;
	}
	
}
