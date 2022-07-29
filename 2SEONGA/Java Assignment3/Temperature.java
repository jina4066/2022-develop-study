import java.util.Scanner;

public class Temperature {
  public static void main(String[] args) throws Exception {
    double celsius, fahrenheit;
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("섭씨 온도 입력 : ");
      celsius = sc.nextDouble();
      fahrenheit = (celsius * 1.8) + 32;
    }
		System.out.printf("화씨 %f도는 섭씨로 " + celsius + "도 입니다.", fahrenheit);
  }
}
