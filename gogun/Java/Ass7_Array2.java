public class Ass7_Array2 {
  public static void main(String[] args) {
    int[][] Ints = new int[4][4];
    int k = 1;
    for (int i = 0; i < Ints.length; i++) {      
      for (int j = 0; j < Ints[i].length; j++) {
        Ints[i][j] = k;
        k++;
      }
    }
    for (int i = 0; i < Ints.length; i++) {      
      for (int j = 0; j < Ints[i].length; j++) {
        System.out.print(Ints[i][j] + "\t");
      }
      System.out.print("\n");
    }
  }
}