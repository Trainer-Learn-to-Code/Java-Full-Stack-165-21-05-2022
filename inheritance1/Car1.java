package inheritance1;
class Car1 {
	//Scenario 2
	private double price;
	private String model;

	public void start() {
		System.out.println("Car Start");
	}

	public void stop() {
		System.out.println("Car stop");
	}

	public void move() {
		System.out.println("Car move");
	}

	
	public Car1(double price, String model) {
		super();
		this.price = price;
		this.model = model;
	}
	

	@Override
	public String toString() {
		return price + " " + model ;
	}

	public static void main(String[] args) {
		Car1 c1=new Car1(5.3,"Hyundai Grand i10 Nios");
		System.out.println(c1.toString());
	}

}