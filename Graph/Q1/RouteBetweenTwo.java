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
    ArrayList<Node> childs = new ArrayList<Node>();
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

  }
  public static void main(String args[]){
    
  }
}
