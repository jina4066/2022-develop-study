import java.util.Scanner;
public class Ass7_FiveInt {
  public static void main(String []args) {
    Scanner sc = new Scanner(System.in);
    int[] Ints = new int[5];
    for (int i = 0; i<Ints.length; i++) {
      Ints[i] = sc.nextInt();
    }
    for (int i = 0; i<Ints.length; i++) {
      System.out.print(Ints[i]);
      System.out.print(" ");
    }
    sc.close();
  }
}