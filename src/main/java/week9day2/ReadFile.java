package week9day2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) throws FileNotFoundException {
		File file= new File ("/Users/allan/Downloads/apache-maven-3.5.4/README.txt");
		Scanner sc = new Scanner(file);
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}

	}

}
