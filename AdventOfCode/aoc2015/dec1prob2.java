package aoc2015;

import java.io.*;
import java.util.*;

public class dec1prob2 {

	public static void main(String[] args) {
		int floor = 0;
		// Get the filename.
		String filename = FileLoc.pickLocRead();

		// Open the file.
		File file = new File(filename);
		Scanner inputFile = null;
		try {
			inputFile = new Scanner(file);

			// Read lines from the file until no more are left.
			while (inputFile.hasNext()) {
				// Read the next line.
				String line = inputFile.nextLine();
				for (int i=0; i<line.length(); i++) {
					char e = line.charAt(i);
					if (e == '(') {
						floor++;
					} else if (e == ')') {
						floor--;
					}
					
					if (floor < 0 ) {
						System.out.println("Santa entered the basement at position " + (i+1));
						inputFile.close();
						System.exit(0);
					}

				}
			}
		} catch (IOException ioe) {
			System.out.println("IO Exception.  Need to exit");
			System.exit(0);

		} finally {
			// Close the file.
			inputFile.close();
			//System.out.println("Santa ended up on floor " + floor);
			System.exit(0);
		}
	}
}
