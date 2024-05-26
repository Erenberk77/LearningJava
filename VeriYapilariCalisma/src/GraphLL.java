import java.util.*;
public class GraphLL {
	int numberV;
	LinkedList<Integer> list[];
	
	public GraphLL(int v) {
		numberV=v;
		list=new LinkedList[v];
		for (int i = 0; i < list.length; i++) {
			list[i]=new LinkedList();
		}
	}
	public void addEdge(int v1, int v2) {
		list[v1].add(v2);
		list[v2].add(v1);
	}
	
	public void  findAdj(int v1) {
		System.out.println(v1 + " ");
		for (int i = 0; i < list[v1].size(); i++) {
			System.out.print(list[v1].get(i)+ " ");
			}
		System.out.println();
}
	public void print() {
		System.out.println();
		for (int i = 0; i < list.length; i++) {
			System.out.print(i + " : ");
			for (int j = 0; j < list[i].size(); j++) {
				System.out.print(list[i].get(j)+ " ");
			}
			System.out.println();
		}
		
	}
	
         public void BFS(int s) {
        	 boolean visited [] =new boolean[numberV];
        	 Queue<Integer> queue=new LinkedList();
        	 visited[s]=true;
        	 queue.add(s);
        	 int tmp;
        	 while(queue.size()!=0) {
        		 s=queue.poll();
        		 System.out.print(s+" ");
        		 for (int i = 0; i < list[s].size(); i++) {
        			 tmp=list[s].get(1);
        			 if(!visited[tmp]) {
        				 visited[tmp]=true;
        				 queue.add(tmp);
        			 }
					
				}
        	 }
         }
         
         public static void main(String[] args) {
        	 GraphLL g1=new GraphLL(6);
     		g1.addEdge(0, 2);
     		g1.addEdge(0, 3);
     		g1.addEdge(0, 5);
     		g1.addEdge(1, 5);
     		g1.addEdge(2, 3);
     		g1.addEdge(3, 4);
     		g1.print();
     		g1.BFS(0);
         }




	
	
	
	
}
