package hust.soict.hedspi.garbage;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class GarbageCreator {
	public static void main(String[] args) throws FileNotFoundException{
		FileReader input = new FileReader("C:\\Users\\lenovo\\Desktop\\garbage.txt");
		Scanner inFile = new Scanner(input);	
		String s = "" ;
		while(inFile.hasNextLine()) {
			s += inFile.nextLine();
			System.out.println(s);
		}
		inFile.close();
	}
}
