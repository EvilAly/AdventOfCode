package aoc2021;

import java.io.*;
import java.util.*;

public class Dec3Prob1 {

	public static void main(String[] args) {
		// read file into AL
		Scanner scan = new Scanner(System.in);
		String filename = FileLoc.pickLocRead();
		ArrayList<String> binary = new ArrayList<String>();
		ArrayList<Integer> g = new ArrayList<Integer>();
		ArrayList<Integer> e = new ArrayList<Integer>();

		// Open the file.
		File file = new File(filename);
		Scanner inputFile = null;
		try {
			inputFile = new Scanner(file);
			// Read lines from the file until no more are left.
			while (inputFile.hasNext()) {
				String line = inputFile.nextLine();
				// add string to AL
				binary.add(line);
			}
		}catch (IOException ioe) {
			System.out.println("IO Exception.  Need to exit");
			System.exit(0);
		}
		// process numbers to find out how many increases
		finally {
			
			for (int i = 0; i < 12; i++) {
				int ct0 = 0;
				int ct1 = 0;
				for (int j = 0; j < binary.size(); j++) {
					String bin = binary.get(j);
					int num = bin.charAt(i);

					if (num == 49) {
						ct1++;
					} else if (num == 48) {
						ct0++;
					}
				}

				if (ct1 > ct0) {
					g.add(1);
					e.add(0);
				} else {
					g.add(0);
					e.add(1);
				}
			}

			System.out.println("Gamma is: ");
			for (int a = 0; a < g.size(); a++) {
				System.out.print(g.get(a));
			}

			System.out.println("\nEpsilon is: ");
			for (int b = 0; b < e.size(); b++) {
				System.out.print(e.get(b));
			}

			inputFile.close();
			scan.close();
			System.exit(0);

		

	}
}}
