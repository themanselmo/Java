
public class Demo {

	public static void main(String[] args) {
		Name name1 = new Name("John", "Doe");
		Name name2 = new Name("Jane", "Doe");
		Name name3 = new Name("Adam", "Smith");
		
		Student s1 = new Student(name1);
		s1.setGpa(4.0);
		s1.getName().setFirstName("Johnny");
		Faculty f1 = new Faculty(name2);
		f1.getName().setLastName("Complicated");
		f1.setSalary(10000.00);
		Faculty f2 = new Faculty(name3);
		f2.getName().setMiddleInitial('A');
		
		System.out.println(s1);
		System.out.println(f1);
		System.out.println(f2);
	}

}