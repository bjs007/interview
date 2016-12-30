import java.util.*;
public class BoxComparator implements Comparator<Box>{
  public int compare(Box x,Box y){
    return y.height - x.height;
  }
}
