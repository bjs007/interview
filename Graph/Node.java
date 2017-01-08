import java.util.*;
public class Node{
  int data;
  ArrayList<Node> childs;
  Node(int data){
    this.data = data;
    childs = new ArrayList<Node>();
  }

  ArrayList<Node> getChilds() {
		return childs;
	}
}
