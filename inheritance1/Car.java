package inheritance1;
class Car {
	//Scenario 1
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	public static void main(String[] args) {
		Car c1=new Car();
		c1.setModel("Tata Nexon EV");
		c1.setPrice(13.99);
		System.out.println(c1.getModel()+" "+c1.getPrice());
	}

}