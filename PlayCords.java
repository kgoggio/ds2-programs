package ds2;

import algs4.StdAudio;
import algs4.StdOut;
import algs4.StdIn;
import algs4.BSTEssential;

//Kyle Goggio

public class PlayCords {
	public static void playChord(double... frequencies) {
		final int sliceCount = (int) (StdAudio.SAMPLE_RATE * 0.5);
		final double[] slices = new double[sliceCount+1];
		for (int i = 0; i <= sliceCount; i++) {
			for (double frequency: frequencies) {
				slices[i] += Math.sin(2 * Math.PI * i * frequency / StdAudio.SAMPLE_RATE);
			}
			slices[i] /= frequencies.length;
		}
		StdAudio.play(slices);
	}
	
public static void main(String[] args) {
	StdOut.println("Kyle Goggio ***");
	BSTEssential<String, Double> myNotes = new BSTEssential<>();
	StdIn.fromFile("data/notes_frequencies.txt");
	while (StdIn.isEmpty()!=true) {
		String string = StdIn.readLine();
		String[] myFrequencies = string.split("\\s+");
		myNotes.put(myFrequencies[0], Double.parseDouble(myFrequencies[1]));
 	}
	
	StdIn.fromFile("data/intro.txt");
	while(StdIn.isEmpty() != true) {
		String string = StdIn.readLine();
		String[] words = string.split("\\s+");
		double[] musicFile = new double[words.length];
		int counter = 0;
		for (String word: words) {
			double frequency = myNotes.get(word);
			musicFile[counter] = frequency;
			counter++;
		}
		playChord(musicFile);
	}
}
}
		
		
		
	