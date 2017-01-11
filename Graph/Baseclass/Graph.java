package Baseclass;
import java.util.*;
public class Graph{
  ArrayList<Node> nodes;
public  Graph(){
    nodes = new ArrayList<Node>();
  }
  public void insertNode(Node node){
    nodes.add(node);
  }
  public void insertChild(Node parent,Node child){
    if(parent!=null && child != null){
    ArrayList<Node> childs = parent.getChilds();
    childs.add(child);
    }

  }
 public int size(){
   return nodes.size();
 }
public   ArrayList<Node> getGraphNodes(){
    return nodes;
  }

}
