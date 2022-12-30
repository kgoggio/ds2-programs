package ds2;

import ds2.A5BSTDepth;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;
import algs4.StdIn;
import algs4.StdOut;

//Kyle Goggio
public class A5Test {

	
	public static void main(String[] args) { 
		A5BSTDepth<String, Integer> tree = new A5BSTDepth<>();
		StdIn.fromFile("data/Tale.txt");
		String[] words = StdIn.readAllStrings();
        for (String word: words) {
            Integer count = tree.get(word);
            if (count == null) {
                count = 1;
                tree.put(word, 1);
            }
            tree.put(word, count+1);
        }
        tree.assignDepths();
        double inOrderAverage = tree.averageDepth();
	
	//this will shuffle the array
	List<String> list = Arrays.asList(words);
	Collections.shuffle(list);
	list.toArray(words);
	A5BSTDepth<String, Integer> tree2 = new A5BSTDepth<>();
	
    for (String word: words) {
        Integer count = tree2.get(word);
        if (count == null) {
            count = 1;
            tree2.put(word, 1);
        }
        tree2.put(word, count+1);
    }
    tree2.assignDepths();
    double randomAverage = tree2.averageDepth();

    
     list = Arrays.asList(words);
     list.sort(Comparator.naturalOrder());
     list.toArray(words);
     A5BSTDepth<String, Integer> tree3 = new A5BSTDepth<>();
    for (String word: words) {
        Integer count = tree3.get(word);
        if (count == null) {
            count = 1;
            tree3.put(word, 1);
        }
        tree3.put(word, count+1);
    }
    tree3.assignDepths();
    double ascendingAverage = tree3.averageDepth();
    
    
	StdOut.println("Kyle Goggio ***");	
	StdOut.println("Average depths on words in text order: "+inOrderAverage);
	StdOut.println("Average depths on words in random order: "+randomAverage);
	StdOut.println("Average depths on words in ascending order: "+ascendingAverage);
	
	
	
	
}
	
}

