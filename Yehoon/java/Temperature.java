import java.util.Scanner;

public class Temperature {
  public static void main(String[] args) throws Exception {
    double Fahrenheit  = 0;
    double Celsius = 0;
    Scanner sc = new Scanner(System.in);
    System.out.print("섭씨온도를 입력하세요 : ");
    Celsius = sc.nextDouble();
    sc.close();
    Fahrenheit = (Celsius * 1.8) + 32.0;
    System.out.printf("화씨 %.1f도는 섭씨로 %.1f도 입니다.", Fahrenheit, Celsius);
  }
}