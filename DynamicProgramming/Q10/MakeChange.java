public class MakeChange{

public  static int makeChange(int amount){
  int[] denom = {25,10,5,1};
  return makeChange(amount,denom,0);
}

public  static int makeChange(int amount,int[] denom,int index){
  if(index + 1 == denom.length)
  return 1;
  int ways = 0;
  int denomAmount = denom[index];
  for(int i=0;i * denomAmount <=amount ;i++){
    int remainingAmount = amount - i * denomAmount;
    ways +=makeChange(remainingAmount,denom,index + 1);
  }
  return ways;
}
public static void main(String args[]){
int amount = 100;
System.out.println(makeChange(amount));
}
}
