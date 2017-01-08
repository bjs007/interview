import java.util.*;
public class Graph{
  ArrayList<Node> nodes;
  Graph(){
    nodes = new ArrayList<Node>();
  }
  void insertNode(Node node){
    nodes.add(node);
  }
  void insertChild(Node parent,Node child){
    if(parent==null || child == null)
    return;

    ArrayList<Node>childs = parent.getChilds();
    childs.add(child);
  }

  ArrayList<Node> getGraphNodes(){
    return nodes;
  }

}
