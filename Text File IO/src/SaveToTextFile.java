

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SaveToTextFile {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("data/output.txt", true); // true: append
		PrintWriter pw = new PrintWriter(fw, true); // wrapper class. true means autoflush
		pw.println("Joe");
		pw.write("John");
		pw.close(); // time to write to the file: flush
		System.out.println("Done writing!");
	}

}
