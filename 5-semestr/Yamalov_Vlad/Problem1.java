package ololo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.List;
import java.util.Map;
 
public class Problem1 {
 
    static class Mark {
        public Mark(int pre, int post) {
            this.pre  = pre;
            this.post = post;
        }
        public int pre;
        public int post;
    };
 
    
    static UndirectedGraph graph;
    
    static Map<String, Mark> visitedMap = new LinkedHashMap<String, Mark>();
    
    static int counter = 1;
 
    public static void main(String[] args) {
 
        graph = new UndirectedGraph();
        graph.addEdge("A", "B");
        graph.addEdge("A", "E");
        graph.addEdge("B", "C");
        graph.addEdge("B", "E");
        graph.addEdge("C", "F");
        graph.addEdge("E", "F");
        graph.addEdge("F", "I");
 
        graph.addEdge("D", "G");
        graph.addEdge("D", "H");
        graph.addEdge("G", "H");
 
        Map<String, List<String>> vm = graph.getVertexMap();
 
        List<String> vertexList = new ArrayList<String>(vm.size());
        vertexList.addAll(vm.keySet());
        Collections.sort(vertexList);   
 
        for (String v : vertexList) {
            dfs(v);
        }
 
        for (Map.Entry<String, Mark> entry : visitedMap.entrySet()) {
            Mark m = entry.getValue();
            System.out.format("%1$s : (%2$d, %3$d)\n", entry.getKey(), m.pre, m.post);
        }
    }    
 
    static void dfs(String vertexName) {
        if (visitedMap.containsKey(vertexName)) return;
 
        
        visitedMap.put(vertexName, new Mark(counter,-1));
        counter++;
 
       
        Map<String, List<String>> vm = graph.getVertexMap();
        List<String> adjacentVertices = vm.get(vertexName);
 
        for (String v : adjacentVertices) {
            if (visitedMap.containsKey(v)) continue;
            dfs(v);
        }
 
        
        Mark m = visitedMap.get(vertexName);
        m.post = counter++;
    }
} class UndirectedGraph {
	 
    private HashMap<String, List<String>> vertexMap = new HashMap<String, List<String>>();
 
    public void addVertex(String vertexName) {
        if (!hasVertex(vertexName)) {
            vertexMap.put(vertexName, new ArrayList<String>());
        }
    }
 
    public boolean hasVertex(String vertexName) {
        return vertexMap.containsKey(vertexName);
    }
 
    public boolean hasEdge(String vertexName1, String vertexName2) {
        if (!hasVertex(vertexName1)) return false;
        List<String> edges = vertexMap.get(vertexName1);
        return Collections.binarySearch(edges, vertexName2) != -1;
    }
 
    public void addEdge(String vertexName1, String vertexName2) {
        if (!hasVertex(vertexName1)) addVertex(vertexName1);
        if (!hasVertex(vertexName2)) addVertex(vertexName2);
        List<String> edges1 = vertexMap.get(vertexName1);
        List<String> edges2 = vertexMap.get(vertexName2);
        edges1.add(vertexName2);
        edges2.add(vertexName1);
        Collections.sort(edges1);
        Collections.sort(edges2);
    }
 
    public Map<String, List<String>> getVertexMap() {
        return vertexMap;
    }
}