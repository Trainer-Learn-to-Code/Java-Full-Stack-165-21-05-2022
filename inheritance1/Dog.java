package inheritance1;

public class Dog {
	//Scenario 1
	private int age;
	private String color;
	private String breed;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	void bark() {
		System.out.println("barking....");
	}

	void sleep() {
		System.out.println("sleeping....");
	}
	public static void main(String[] args) {
		Dog d1=new Dog();
		d1.setAge(1);
		d1.setBreed("Bulldog");
		d1.setColor("White");
		System.out.println(d1.getAge()+" "+d1.getColor()+" "+d1.getBreed());
	}
}
