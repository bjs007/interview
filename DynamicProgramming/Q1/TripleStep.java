public class TripleStep{
public static  int step(int n){
    if(n<0)
    return 0;
    else if(n==0)
    return 1;
    else
    return step(n-1) + step(n-2) + step(n-3);
  }

  public static void main(String args[]){
      int n = 20;
      int count = step(n);
      System.out.println("Number of ways"+count);
  }

}
