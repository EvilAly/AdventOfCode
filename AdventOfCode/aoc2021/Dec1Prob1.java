package aoc2021;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Dec1Prob1 {

	public static void main(String[] args) {
		// read file into AL
		Scanner scan = new Scanner(System.in);
		String filename = FileLoc.pickLocRead();
		ArrayList<Integer> depths = new ArrayList<Integer>();
		int inc = 0;
		// Open the file.
		File file = new File(filename);
		Scanner inputFile = null;
		try {
			inputFile = new Scanner(file);
			// Read lines from the file until no more are left.
			while (inputFile.hasNext()) {
				// Read the next int The Scanner class can directly read it as an int
				int deep = inputFile.nextInt();
				depths.add(deep);
			}
			for (int i = 1; i < depths.size(); i++) {
				int last = depths.get(i - 1);
				int cur = depths.get(i);
				if (last < cur)
					inc++;
			}
		} catch (IOException ioe) {
			System.out.println("IO Exception.  Need to exit");
			System.exit(0);
		}
		// process numbers to find out how many increases
		finally {
			System.out.println(inc);
			inputFile.close();
			scan.close();
			System.exit(0);

		}

	}
}
