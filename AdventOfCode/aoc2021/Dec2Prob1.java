package aoc2021;

import java.io.*;
import java.util.*;

public class Dec2Prob1 {

	public static void main(String[] args) {
		// read file into AL
		Scanner scan = new Scanner(System.in);
		String filename = FileLoc.pickLocRead();
		int depths = 0;
		int horz = 0;
		
		// Open the file.
		File file = new File(filename);
		Scanner inputFile = null;
		try {
			inputFile = new Scanner(file);
			// Read lines from the file until no more are left.
			while (inputFile.hasNext()) {
				String line = inputFile.nextLine();
				// break up each line
				StringTokenizer st = new StringTokenizer(line, " ");
				// while the line has more "tokens" or values
				while (st.hasMoreTokens()) {
					// get the next one and convert it to an int
					String dir = st.nextToken().trim();
					int move = Integer.parseInt(st.nextToken().trim());
					
					if (dir.equals("up")) {
						depths = depths - move;
					} else if (dir.equalsIgnoreCase("down")) {
						depths = depths + move;
					} else {
						horz = horz + move;
					}

				}
			}
		} catch (IOException ioe) {
			System.out.println("IO Exception.  Need to exit");
			System.exit(0);
		}
		// process numbers to find out how many increases
		finally {
			System.out.println(depths * horz);
			inputFile.close();
			scan.close();
			System.exit(0);

		}

	}
}
