
public class GraphM {
	int numberV;
	boolean adj[][];
	
	public GraphM(int v) {
		numberV=v;
		adj= new boolean[v][v];
		
	}
	public void addEdge(int v1, int v2) {
		adj[v1][v2]=true;
		adj[v2][v1]=true;
	}
	public void removeEdge(int v1, int v2) {
		adj[v1][v2]=false;
		adj[v2][v1]=false;
	}
	
	public void  findAdj(int v) {
		System.out.print(v + " : ");
		for (int i = 0; i < numberV; i++) {
			if(adj[v][i]) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
	public void print() {
		System.out.println("Graph: ");
		for (int i = 0; i < numberV; i++) {
			for (int j = 0; j < numberV; j++) {
				System.out.print((adj[i][j] ? 1 : 0)+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		GraphM g1=new GraphM(6);
		g1.addEdge(0, 2);
		g1.addEdge(0, 3);
		g1.addEdge(0, 5);
		g1.addEdge(1, 5);
		g1.addEdge(2, 3);
		g1.addEdge(3, 4);
		g1.print();
		g1.findAdj(0);
		g1.removeEdge(0,3);
		g1.findAdj(0);
	}
	
}









