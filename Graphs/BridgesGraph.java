/*===============================================
=            Find Bridges in a Graph            =
===============================================*/

import java.util.*;
public class BridgesGraph {

    private int n;
    private List<List<Integer>> graph;

    private boolean [] visited;
    private List<Integer> bridges;
    private int [] low;
    private int [] ids;
    private int id;

    public BridgesGraph(List<List<Integer>> graph) {
      this.n = graph.size();
      this.graph = graph;
      this.bridges = new ArrayList<Integer>();
    }


    static List<List<Integer>> createEmptyGraph(int n){
      List<List<Integer>> g = new ArrayList<>();
      for (int i = 0; i < n; i++) g.add(new ArrayList<>());
      return g;
    }

    static void addDirectedEdge(List<List<Integer>> g, int from, int to) {
      g.get(from).add(to);
    }

    static void addUndirectedEdge(List<List<Integer>> g, int from, int to) {
      addDirectedEdge(g, from, to);
      addDirectedEdge(g, to, from);
    }

    private void dfs(int at , int parent , List<Integer> bridges){
      visited[at] = true;
      List<Integer> neighbours = graph.get(at);
      ids[at] = low[at] = id++;
      for(Integer to : neighbours) {
        if (to == parent) continue; // since undirect graph ignore the parent back
        if(!visited[to]){
          dfs( to , at , bridges);
          low[at] = Math.min(low[to] , low[at]);
          if(ids[at] < low[to]){
            bridges.add(at);
            bridges.add(to);
          }

        }else{
          low[at] = Math.min(ids[to] , low[at]);
        }
      }

    }

    private void findBridges(){
      ids = new int [n];
      low = new int [n];
      visited = new boolean[n];
      for (int i = 0; i < n ; ++i) {
        if(!visited[i]){
          dfs(i,-1,bridges);
        }
      }

    }


  public static void main (String [] args) {
    Scanner in=new Scanner(System.in);
    int testcases = in.nextInt();
    for (int t = 0; t < testcases ; ++t) {
      int n = in.nextInt();
      List<List<Integer>> g = BridgesGraph.createEmptyGraph(4);
          addUndirectedEdge(g, 0, 1); 
          addUndirectedEdge(g, 3, 2); 
          addUndirectedEdge(g, 2, 1); 
          //addUndirectedEdge(g, 0, 3); 
          //addUndirectedEdge(g, 3, 4);
          BridgesGraph solver = new BridgesGraph(g);
          solver.findBridges();
          System.out.println(solver.bridges.size()); 
          for (int i = 0 ; i < (solver.bridges.size())/2 ; ++i) {
            System.out.println(solver.bridges.get(2*i) + " " + solver.bridges.get(2*i+1));  
          }
    }
  }
}

/*=====  End of Find Bridges in a Graph  ======*/