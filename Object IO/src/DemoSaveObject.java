
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DemoSaveObject {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Student s1 = new Student("Adam", "111", "m");
		Student s2 = new Student("Bill", "222", "m");
		Student s3 = new Student("Suzy", "333", "f");

		Student[] students = { s1, s2, s3 };

		FileOutputStream fos = new FileOutputStream("students.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		for (int i = 0; i < students.length; i++) {
			oos.writeObject(students[i]);
		}
		oos.close();

		// we had an error in class because I forgot to add "implements Serializable" to the 
		// Person class.
		
	}

}