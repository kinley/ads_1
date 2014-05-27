import java.util.Arrays;


public class SCCTarjan {

	  int[] lowlink;
	  boolean[] vis;
	  List<Integer> stack;
	  int time;
	  int components;
	  List<Integer>[] graph;
	  int[] res;

	  public int[] scc(List<Integer>[] graph) {
	    int n = graph.length;
	    this.graph = graph;
	    lowlink = new int[n];
	    vis = new boolean[n];
	    stack = new List<Integer>();
	    res = new int[n];
	    time = 0;
	    components = 0;

	    for (int u = 0; u < n; u++)
	      if (!vis[u])
	        dfs(u);

	    return res;
	  }

	  void dfs(int u) {
	    vis[u] = true;
	    lowlink[u] = time++;
	    stack.add(u);

	    for (int v : graph[u])
	      if (!vis[v])
	        dfs(v);

	    boolean isRoot = true;
	    for (int v : graph[u])
	      if (lowlink[u] > lowlink[v]) {
	        lowlink[u] = lowlink[v];
	        isRoot = false;
	      }

	    if (isRoot) {
	      while (true) {
	        int v = stack.remove(stack.size() - 1);
	        res[v] = components;
	        lowlink[v] = Integer.MAX_VALUE;
	        if (v == u)
	          break;
	      }
	      ++components;
	    }
	  }

	  // ������
	  public static void main(String[] args) {
	    int n = 3;
	    List<Integer>[] g = new List[n];
	    for (int i = 0; i < n; i++) {
	      g[i] = new List<Integer>();
	    }
	    g[2].add(0);
	    g[2].add(1);
	    g[0].add(1);
	    g[1].add(0);

	    int[] res = new SCCTarjan().scc(g);
	    System.out.println(Arrays.toString(res));
	
	}

}
