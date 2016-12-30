import  java.util.*;
public class EightQueens{
  static int GRID_SIZE = 8;
  public static void placeQueen(int row,Integer[] column,ArrayList<Integer[]> result){
    if(row == GRID_SIZE){
      result.add(column.clone());
    }else{
      for(int col = 0; col<GRID_SIZE;col++){
        if(check(col,row,column)){
          column[row] = col;
          placeQueen(row + 1,column,result);
        }
      }
    }
  }
public static boolean check(int col1,int row1,Integer[] column){
  for(int row2=0 ;row2 < row1; row2++){
    int col2 = column[row2];
    if(col2 == col1)
    return false;

    int coldiff = Math.abs(col2 - col1);
    int rowdiff = row1 - row2;
    if(coldiff == rowdiff)
    return false;

  }
return true;
}

public static void printBoards(Integer column[]){
  drawLine();
  for(int i=0 ;i<GRID_SIZE ;i++){
    System.out.print("|");
    for(int j=0;j<GRID_SIZE;j++){
      if(column[i] == j)
      System.out.print("Q|");
      else
      System.out.print(" |");
    }
    System.out.print("\n");
    drawLine();
  }
  System.out.println("");
}

public  static void drawLine(){
  StringBuffer line = new StringBuffer();
  for(int i=0;i<GRID_SIZE*2 + 1;i++)
  System.out.print("-");
  System.out.println();
}

public static void printBoards(ArrayList<Integer[]> boards){
  for(Integer column[] : boards){
    printBoards(column);
  }
}

public static void clear(Integer[] columns) {
		for (int i = 0; i < GRID_SIZE; i++) {
			columns[i] = -1;
		}
	}

public static void main(String args[]){
    ArrayList<Integer[]> results = new ArrayList<Integer[]>();
		Integer[] columns = new Integer[GRID_SIZE];
    clear(columns);
    placeQueen(0, columns, results);
		printBoards(results);
		System.out.println(results.size());
}

}
