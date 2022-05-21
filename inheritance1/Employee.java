package inheritance1;

public class Employee {
	private String firstName;
	private String lastName;
	private double salary;

	public Employee(String fName, String lName, double sal) {
		if (fName != null)
			firstName = fName;
		if (lName != null)
			lastName = lName;
		if (sal > 0.0) {
			salary = sal;
		} else {
			salary = 0.0;
		}
	}

//set methods
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public double getSalary() {
		return salary;
	}

	public void setFirstName(String fName) {
		if (fName != null)
			firstName = fName;
	}

	public void setLastName(String lName) {
		if (lName != null)
			lastName = lName;
	}

	public void setSalary(double sal) {
		if (sal > 0.0) {
			salary = sal;
		} else {
			salary = 0.0;
		}
	}

	public static void main(String args[]) {
		Employee employee1 = new Employee("Mohamed", "Ali", 20000.00);
		Employee employee2 = new Employee("Ahmed", "Ibrahim", 50000.00);
		System.out.println(employee1.getFirstName() + " " + employee1.getLastName() + " " + employee1.getSalary());
		System.out.println(employee2.getFirstName() + " " + employee2.getLastName() + " " + employee2.getSalary());
		// set raise 10%
		employee1.setSalary((.1 * employee1.getSalary()) + employee1.getSalary());
		employee2.setSalary((.1 * employee2.getSalary()) + employee2.getSalary());
		System.out.println(employee1.getFirstName() + " " + employee1.getLastName() + " " + employee1.getSalary());
		System.out.println(employee2.getFirstName() + "" + employee2.getLastName() + "" + employee2.getSalary());
	}

}