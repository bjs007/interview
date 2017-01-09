import java.util.*;
public class SearchInGraph{
  Graph graph;
  SearchInGraph(Graph graph){
    this.graph = graph;
  }
  void BFS(){
    ArrayList<Node>  graphNodes = graph.getGraphNodes();
    Node startingNode = graphNodes.get(0);
    HashMap<Node,Boolean> visited = new HashMap<Node,Boolean>();
    LinkedList<Node> queue = new LinkedList<Node>();
    queue.add(startingNode);
    visited.put(startingNode,true);
    while(!queue.isEmpty()){
      Node n = queue.poll();
      System.out.println(n.data);
      ArrayList<Node> childs = n.getChilds();
      for(Node node : childs){
        if(!visited.get(node)){
          visited.put(node,true);
          queue.addLast(node);
        }
      }
    }
  }
}
