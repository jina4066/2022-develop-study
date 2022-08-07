public class Assgnment66 {
  
  public static void main (String[] args) {
    int n = 10, n1 = 4, n2 = 10;

    System.out.printf("factorial(%d) = %d%n", n, factorial(n));
    System.out.printf("factorial(%d, %d) = %d", n1, n2, factorial(n1, n2));
  }

  public static int factorial(int n) {
    if (n <= 1)
      return n;
    else
      return factorial(n-1) * n;
  }

  public static int factorial(int n1, int n2) {
    if (n1 <= 1)
      return n1;
    else
      return factorial(n2-1) * n1;
  }
}
