package java_basics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Read/write file example
 * @author ISIS1226
 */
public class FileInputOutput {

	public static void main(String[] args) {
		try {
			FileReader fileReader = new FileReader("full/path/to/file.txt");
			BufferedReader br = new BufferedReader(fileReader);
			String message = "";
			String line = br.readLine();
			while(line != null) {
				message += line + " "; 
				line = br.readLine();
			}
			System.out.println(message);
			br.close();
			File file = new File("full/path/to/file.txt");
			if (file.createNewFile()) {
				System.out.println("File created: " + file.getName());
			} else {
				System.out.println("File already exists.");
			}
			BufferedWriter writer = new BufferedWriter(new FileWriter("full/path/to/file.txt"));
			writer.write(message);
			writer.close();
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
