public class Factorial {

    public static void main (String[] args) {
        int startFact = 4, finishFact = 10;
        System.out.printf("factorial(%d) = %d%n", finishFact, factorial(finishFact));
        System.out.printf("factorial(%d, %d) = %d", startFact, finishFact, factorial(startFact, finishFact));
    }
    public static int factorial(int finishFact) {
        if (finishFact <= 1)
          return finishFact;
        else
          return factorial(finishFact-1) * finishFact;
    }
    
      public static int factorial(int startFact, int finishFact) {
        if (startFact <= 1)
          return startFact;
        else
          return factorial(finishFact-1) * startFact;

    }
}