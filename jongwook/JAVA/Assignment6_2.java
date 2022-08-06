public class Assignment6_2 {
  public static void main(String[] args) {
    System.out.printf("factorial(10) = %d\n", factorial(10));
    System.out.printf("factorial(4,10) = %d\n", factorial(4, 10));
  }

  public static int factorial(int i1) {
    int total = 1;
    while (i1 != 0) {
      total = total * i1;
      i1--;
    }
    return total;
  }

  public static int factorial(int i1, int i2) {
    int total = 1;
    while (i1 <= i2) {
      total = total * i2;
      i2--;
    }
    return total;
  }
}
