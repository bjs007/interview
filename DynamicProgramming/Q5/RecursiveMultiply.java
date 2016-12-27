public class RecursiveMultiply{
  public static int multiply(int a,int b){
    int x = Math.max(a,b);
    int y = Math.min(a,b);
    return multiplyHelper(x,y);
  }

public static  int multiplyHelper(int x,int y){
    if(y==0)
    return 0;
    if(y==1)
    return x;
    int s = y >> 1;
    int half = multiplyHelper(x,s);
    if (y%2 == 0)
    return half + half;
    else
    return half + half + x;
  }

  public static void main(String args[]){
    int a = 44;
    int b = 0;
    System.out.println( "Product of " + a + " and "+ b +" is :"+ multiply(a,b));
  }
}
