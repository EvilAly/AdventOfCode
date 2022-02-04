package aoc2015;

import java.io.*;
import java.util.*;

public class dec2prob1 {

	public static void main(String[] args) {
		int tsqft = 0;
		int sqft=0;
		
		String filename = FileLoc.pickLocRead();
		File file = new File(filename);
		Scanner inputFile = null;
		try {
			inputFile = new Scanner(file);
			while (inputFile.hasNext()) {
				// Read the next line.
				String line = inputFile.nextLine();
				// create a StringTokenizer and break the line at the spaces
				// I use the StringTokenizer - more flexible than the Scanner for complex
				// objects
				StringTokenizer st = new StringTokenizer(line, "x");
				// while the line has more "tokens" or values
				int l = Integer.parseInt(st.nextToken());
				int w = Integer.parseInt(st.nextToken());
				int h = Integer.parseInt(st.nextToken());
				
				int sideA = l * w;
				int sideB = w * h;
				int sideC = h * l;
				int sArea = ((2*sideA)+(2*sideB)+(2*sideC));
				
				if (sideA < sideB && sideA < sideC) {
					sqft = sArea + sideA;
				}
				else if (sideB < sideA && sideB < sideC) {
					sqft = sArea + sideB;
				}
				else if (sideC < sideA && sideC < sideB) {
					sqft = sArea + sideC;
				}
				
				System.out.println(sqft);
				tsqft = tsqft + sqft;
			}

			

		} catch (IOException ioe) {
			System.out.println("IO Exception.  Need to exit");
			System.exit(0);

		} finally {
			// Close the file.
			inputFile.close();
			System.out.println("Total " + tsqft);
			System.exit(0);
		}
	}

}
