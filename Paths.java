//Kyle Goggio
package ds2;

import algs4.*;
import algs4.StdOut;


public class Paths {
	public static void main(String[] args) {
		StdIn.fromFile("data/KBGraph.txt");
		Graph g = new Graph(new In("data/KBgraph.txt"));
		DepthFirstPaths dfp = new DepthFirstPaths(g, 1);
		StdOut.println("\nVertex v" + "\t" + "\t" + "Path from 1 to vertex v:");
		for (int vert = 0; vert<g.V(); vert++) {
			if(dfp.hasPathTo(vert)) {
				System.out.printf("%d\t",vert);			
				for(int a: dfp.pathTo(vert)) {
					if(a==1) {StdOut.print(a);
					} else {
					StdOut.print("->"+a);
					}
					
					}
					StdOut.println();
				}
			}
		}
		}
		
		
		
		
	
