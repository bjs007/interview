import java.util.ArrayList;
import java.util.HashSet;
class Node{
  int x;
  int y;
  Node(int x,int y){
    this.x = x;
    this.y = y;
  }
}
public class Robot{
  ArrayList<Node> getPath(boolean maze[][]){
    ArrayList<Node> path = new ArrayList<Node>();
    if(getPath(maze,maze.length,maze[0].length,path))
    return path;
    return null;
  }

  ArrayList<Node> getPathMemo(boolean maze[][]){
    ArrayList<Node> path = new ArrayList<Node>();
    HashSet<Node> failedNode = new HashSet<Node>();
    if(getPathMemo(maze,maze.length - 1,maze[0].length - 1,path,failedNode))
    return path;
    return null;
  }

    boolean getPath(boolean maze[][],int r,int c,ArrayList<Node> path){
    if(r<0 || c<0 || !maze[r][c])
    return false;


    boolean isOrigin = r == 0 && c == 0;
    if(isOrigin || getPath(maze,r-1,c,path) ||getPath(maze,r,c-1,path)){
      path.add(new Node(r,c));
      return true;
    }
    else{

      return false;
    }

    }

    boolean getPathMemo(boolean maze[][],int r,int c,ArrayList<Node> path,HashSet<Node> failedNode){
    if(r<0 || c<0 || !maze[r][c])
    return false;
    Node p = new Node(r,c);
    if(failedNode.contains(p))
    return false;

    boolean isOrigin = r == 0 && c == 0;
    if(isOrigin || getPathMemo(maze,r-1,c,path,failedNode) || getPathMemo(maze,r,c-1,path,failedNode)){
      path.add(p);
      return true;
    }
    else{
      failedNode.add(p);
      return false;
    }

    }


}
