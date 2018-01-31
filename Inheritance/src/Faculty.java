
public class Faculty extends Person {

	private double salary;

	public Faculty(Name name) {
		super(name);
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return super.toString() + ", salary=" + salary;
	}

}
