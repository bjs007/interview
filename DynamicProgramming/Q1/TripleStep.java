public class TripleStep{
public static  int step(int n){
    if(n<0)
    return 0;
    else if(n==0)
    return 1;
    else
    return step(n-1) + step(n-2) + step(n-3);
  }

  public static  int stepMemo(int n,int memo[]){
      if(n<0)
      return 0;
      else if(n==0)
      return 1;
      else if(memo[n] > 0)
      return memo[n];
      else {
        memo[n] = stepMemo(n-1,memo) + stepMemo(n-2,memo) + stepMemo(n-3,memo);
        return memo[n];
      }

    }

  public static void main(String args[]){
      int n = 20;
      int count1 = step(n);
      int memo[] = new int[n+1];
      int count2 = stepMemo(n,memo);

      System.out.println("Number of ways (without memo)"+count1);
      System.out.println("Number of ways (with memo)"+count1);
  }

}
