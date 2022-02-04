package aoc2021;

import java.io.*;
import java.util.*;

public class Dec6Prob1 {

	public static void main(String[] args) {
		ArrayList<Integer> fish = new ArrayList<Integer>();
		
		// Open the file.
		String filename = FileLoc.pickLocRead();
		File file = new File(filename);
		Scanner inputFile = null;
			try {
				inputFile = new Scanner(file);
				// Read lines from the file until no more are left.
				while (inputFile.hasNext()) {
					String line = inputFile.nextLine();
					// break up each line
					StringTokenizer st = new StringTokenizer(line, ",");
					// while the line has more "tokens" or values
					while (st.hasMoreTokens()) {
						// get the next one and convert it to an int
						int age = Integer.parseInt(st.nextToken().trim());
						fish.add(age);		
							

						}
					}
				} catch (IOException ioe) {
					System.out.println("IO Exception.  Need to exit");
					System.exit(0);
				}
				// process numbers to find out how many increases
				finally {
					inputFile.close();
					
					//loop 80 days
					for (int i=0; i<256; i++) {
						//loop thru array
						for (int j=(fish.size()-1); j>=0; j--) {
							if (fish.get(j) == 0) {
								fish.add(8);
								fish.set(j,  6);
							} else {
								fish.set(j,  (fish.get(j) - 1));
							}
								
							}
						}
					int total =0;
					for (int a =0; a< fish.size(); a++) {
						total = total + fish.get(a);
					}
					
					System.out.println("There are " + fish.size() + " lanternfish.");
				}
		

	}

}
