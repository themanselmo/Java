

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromTextFile {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("data/Students.txt");
		Scanner out = new Scanner(file);
		while (out.hasNextLine()) {
			String name1 = out.nextLine();
//			String[] nameTokens = name1.split("[. ]+");
//			Name name = new Name(nameTokens[0], nameTokens[1], nameTokens[2]);
//			String phone = out.nextLine();
//			String address = out.nextLine();
			System.out.println(name1);
		}
		out.close();
	}

}
