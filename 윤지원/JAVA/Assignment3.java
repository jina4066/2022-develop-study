import java.util.Scanner;

public class Assignment3 {
    public static void main (String[] args) throws Exception {
      double Fah = 0;
      double Cel = 0;
      Scanner sc = new Scanner(System.in);
      System.out.println("섭씨 온도를 입력하시오: ");
      Cel = sc.nextDouble();
      sc.close();

      Fah = Cel * 1.8 + 32.0;
      System.out.printf("화씨 %.f도는 섭씨로 %.1f도 입니다.", Fah, Cel);
    }
  }