package ds2;

//Kyle Goggio
import algs4.StdIn;
import algs4.StdOut;
public class TextAnalysis {
	

//		while(!StdIn.isEmpty()) {
//			words = StdIn.readString();
//			WordTotal++;
//		}

//		for(String word: words) {
//			if(!values.contains(word)) {
//				values.put(word, true);
//			}
//		}
//		
//		
//	}
	
	
	public static void main(String[] args) {
		StdIn.fromFile("data/tale.txt");
		String[] txt = StdIn.readAllStrings();
		
		
		int count = txt.length;
		int lenOfAllWords = 0;
		int minL = txt[0].length();
		int maxL = txt[0].length();
		
		for(int i = 0; i<count;i++) {
			lenOfAllWords += txt[i].length();
			if(txt[i].length()>maxL) {
				maxL = txt[i].length();
			}
			if(txt[i].length() < minL) {
				minL = txt[i].length();
			}
		}
		float avglen = (float)lenOfAllWords/(float)count;

		
	StdOut.println("Kyle Goggio ***");	
	StdOut.println("The total number of words is "+count+" words.");
	StdOut.println("the total length of all words is "+lenOfAllWords+" characters.");
	StdOut.println("the average word length is "+avglen+" characters.");
	StdOut.println("the minimum length is "+minL+" characters.");
	StdOut.println("the maximum length is "+maxL+" characters.");

}
}