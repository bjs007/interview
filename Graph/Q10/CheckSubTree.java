package Q10;
import Baseclass.BTnode;
public class CheckSubTree{

  boolean checkSubTree(BTnode root1,BTnode root2){
    if(root1 ==null && root2 ==null)
    return true;
    if(root1 ==null || root2==null)
    return false;
    if(root1.data !=root2.data)
    return false;
    else return checkSubTree(root1.left,root2.left) && c  heckSubTree(root1.right,root2.right);
  }
}
