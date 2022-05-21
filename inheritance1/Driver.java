package inheritance1;
class Driver {
	private String name;
	private int age;

	public void drive() {

		System.out.println("Driver drive car");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public static void main(String[] args) {
		Driver d1=new Driver();
		d1.setAge(30);
		d1.setName("John");
		System.out.println(d1.getAge()+" "+d1.getName());
	}
}