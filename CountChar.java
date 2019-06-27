
import java.io.*;
import java.util.Scanner;

public class CountChar {
	
	public static void main(String[] args) throws IOException {
		
		String fileName = args[0];//file path
		char x = args[1].charAt(0);// char we are looking for
		String line = "";
		Scanner scanner = new Scanner(new FileReader(fileName));
		int counter = 0;
		try {
			while ( scanner.hasNextLine() ) {
				line = scanner.nextLine();
				
				for (int i=0; i < line.length(); i++ ) {
					if (line.charAt(i) == x) {
						counter++;
					}
				}
			}
		}
		finally {
			scanner.close();
		}
		System.out.print(counter);
	}
}
