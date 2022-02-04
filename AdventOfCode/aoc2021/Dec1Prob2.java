package aoc2021;

import java.io.*;
import java.util.*;

public class Dec1Prob2 {

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
			int last = depths.get(0) + depths.get(1) + depths.get(2);
			for (int i = 3; i < depths.size(); i++) {
				int cur = depths.get(i) + depths.get(i-1) + depths.get(i-2);
				if (last < cur)
					inc++;
				last = cur;
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
