//Kyle Goggio
package ds2;
import algs4.*;
import algs4.CC;
import algs4.StdOut;


public class Connected {
	
	public static void main(String[] args) {
		
		int total = 0; 
		for(int n = 50; n <=400; n *=2) {
			int totalEdges = 0;
			for(int iterated = 0; iterated < 500; iterated++){
				Graph mygraph = new Graph(n);
				CC myCC = new CC(mygraph);
				int max = n-1;
				int v = 0 + (int)(Math.random() * ((max-0)+1));
				int u = 0 + (int)(Math.random() * ((max-0)+1));
				while (!myCC.connected(v,u)) {
					totalEdges++;
					mygraph.addEdge(v, u);
					myCC = new CC(mygraph);
				}
				total += totalEdges;
			}
			double average = (double) total/500; //is that right?
			StdOut.println("Vertices in graph: " + n + "	" + " Average # of edges to connected: " + average);
		}
	}
}
							
		
	