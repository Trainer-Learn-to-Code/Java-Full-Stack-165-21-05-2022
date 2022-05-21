package inheritance1;
public class Dog1 {
	//scenario 2
	private int age;
	private String color;
	private String breed;

	
	public Dog1(int age, String color, String breed) {
		super();
		this.age = age;
		this.color = color;
		this.breed = breed;
	}

	void bark() {
		System.out.println("barking....");
	}

	void sleep() {
		System.out.println("sleeping....");
	}
	
	@Override
	public String toString() {
		return age + " "+breed+" "+color;
	}

	public static void main(String[] args) {
		Dog1 d1=new Dog1(2,"German Shepherd","Black");
		System.out.println(d1.toString());
	
	}
}

