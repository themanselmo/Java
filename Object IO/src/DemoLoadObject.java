import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DemoLoadObject {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileInputStream fis = new FileInputStream("students.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);

		for (int i = 0; i < 3; i++) {
			Student s1 =(Student) ois.readObject();
			System.out.println(s1);
		}
		ois.close();
		
		
	}
}
