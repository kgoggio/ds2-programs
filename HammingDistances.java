//Kyle Goggio
package ds2;


import algs4.StdIn;
import algs4.StdOut;
import algs4.BSTEssential;

public class HammingDistances {


	private static double Ham(String seq1, String seq2) {

		int diff = 0; 

		for(int i = 0; i < seq1.length(); i++) {
			if(seq1.charAt(i) !=seq2.charAt(i)) {
				diff++;
			}
		}
		double hDist = (double) diff/ (double) seq1.length();
		return hDist;

	}
	public static void main(String[] args) {

		System.out.println("Kyle Goggio***");
		
		BSTEssential <String, String> myBST = new BSTEssential<>();
		BSTEssential <String, BSTEssential<String, Double>> diffRatio = new BSTEssential<>();

		StdIn.fromFile("data/largesequences.txt");
		while (!StdIn.isEmpty()) {
			String line = StdIn.readLine();
			String[] words = line.split("\\t");
			String speciesName = words[0];
			String dnaSeq = words[1];
			myBST.put(speciesName, dnaSeq);

		}
		for (String spec1 : myBST.keys()) {
			for (String spec2 : myBST.keys()) {
				if(!diffRatio.contains(spec1)) {
					diffRatio.put(spec1, new BSTEssential<String,Double>());
				}
				String seq1 = myBST.get(spec1);
				String seq2 = myBST.get(spec2);
				double calculatedHam = Ham(seq1, seq2);
				diffRatio.get(spec1).put(spec2, calculatedHam);

			}
		}
		for (String spec1: diffRatio.keys() ) {
			StdOut.printf("%-12s\t", spec1);
			for(String spec2: diffRatio.get(spec1).keys()) {
				StdOut.printf(" %5.4f", diffRatio.get(spec1).get(spec2));
			}
			StdOut.println();
		}
		
	}
}