public class Factorial {
  public static void main(String[] args) {
    System.out.println("factorial(10) = " + factorial(10));
    System.out.println("factorial(4, 10) = " + factorial(4, 10));
  }

  public static int factorial(int n) {
    int i = 1;
    int ans = 1;
    while (i <= n) {
      ans *= i;
      i++;
    }
    return ans;
  }
  public static int factorial(int n, int m) {
    int i = n;
    int ans = 1;
    while (i <= m) {
      ans *= i;
      i++;
    }
    return ans;
  }
}
