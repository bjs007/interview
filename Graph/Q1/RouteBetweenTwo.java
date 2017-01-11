package Q1;
import java.util.*;
import Baseclass.Node;
import Baseclass.Graph;
public class RouteBetweenTwo{
  Graph graph;
  RouteBetweenTwo(Graph graph){
    this.graph = graph;
  }
  boolean isRouteBetweenTwo(Node source,Node target){
    if (source == null || target == null)
    return false;
    if(source == target)
    return true;
    HashSet<Node> visited = new HashSet<Node>();

    LinkedList<Node> queue = new LinkedList<Node>();
    queue.add(source);
    visited.add(source);
    while(!queue.isEmpty()){
      Node node = queue.poll();
      ArrayList<Node> childs = node.getChilds();
      for(Node child : childs){
        if(!visited.contains(child)){
          if(child == target)
          return true;
          queue.addLast(child);
          visited.add(child);
        }
      }
    }
    return false;
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

    RouteBetweenTwo route = new RouteBetweenTwo(graph);
    System.out.println(route.isRouteBetweenTwo(node1,node5));
  }
}
