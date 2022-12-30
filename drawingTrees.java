package ds2;

import algs4.StdOut;
import algs4.StdIn;
import algs4.AVLTreeST;
import algs4.RedBlackBSTEssential;
import algs4.BSTEssential;


public class drawingTrees {
	
	public static void main(String[] args) { 
	BSTEssential<String, Integer> tree = new BSTEssential<>();
		//RedBlackBSTEssential<String, Integer> tree = new RedBlackBSTEssential<>();
        StdIn.fromFile("data/meme.txt");
        String[] words = StdIn.readAllStrings();
        for (String word: words) {
            Integer count = tree.get(word);
            if (count == null) {
                count = 1;
                tree.put(word, 1);
            }
            tree.put(word, count+1);
        }
        //StdOut.println("The word 'was' occurs " + tree.get("was") + " times.");
        tree.drawTree();
        //StdOut.print(tree.height());
        
        

    }

}

