package inheritance1;

public class Circle {
	private double radius;
	private String color;

	public Circle() { 
		radius = 1.0;
		color = "red";
	}

	public Circle(double r) { 
		radius = r;
	}

	public double getRadius() {
		return radius;
	}

	
	public double getArea() {
		return 3.14*radius * radius  ;
	}
	 public static void main(String[] args) {
	      
	      Circle c1 = new Circle();	     
	      Circle c2 = new Circle(2.0);
	      System.out.println("The circle has radius of " 
	         + c2.getRadius() + " and area of " + c2.getArea());
	   }
}
