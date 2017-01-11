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
      ArrayList<Node> childs = childs = n.getChilds();
      for(Node node : childs){
        if(!visited.containsKey(node)){
          visited.put(node,true);
          queue.addLast(node);
        }
      }
    }
  }
  void DFS(Graph graph){
    ArrayList<Node>  graphNodes = graph.getGraphNodes();
    Node startingNode = graphNodes.get(0);
    HashMap<Node,Boolean> visited = new HashMap<Node,Boolean>();
    DFS(startingNode,visited);
  }
  void DFS(Node current,HashMap<Node,Boolean> visited){
    if(current == null)
    return;
    ArrayList<Node> childs = current.getChilds();
    System.out.println(current.data);
    visited.put(current,true);
    for(Node node : childs){
      if(!visited.containsKey(node)){
        DFS(node,visited);
      }
    }
  }

  public static void main(String args[]){

    Graph graph = new Graph();
    Node node0 = new Node(0);
    Node node1 = new Node(1);
    Node node2 = new Node(2);
    Node node3 = new Node(3);
    Node node4 = new Node(4);
    Node node5 = new Node(5);
    graph.insertNode(node0);
    graph.insertNode(node1);
    graph.insertNode(node2);
    graph.insertNode(node3);
    graph.insertNode(node4);
    graph.insertNode(node5);

    graph.insertChild(node0,node1);
    graph.insertChild(node0,node4);
    graph.insertChild(node0,node5);

    graph.insertChild(node1,node3);
    graph.insertChild(node1,node4);

    graph.insertChild(node2,node1);
    graph.insertChild(node3,node2);
    graph.insertChild(node3,node4);

    System.out.println(graph.size());
  SearchInGraph search = new SearchInGraph(graph);
  System.out.println("Searching using Breadth First Search");
  search.BFS();
  System.out.println("Searching using Depth First Search");
  search.DFS(graph);


  }
}
