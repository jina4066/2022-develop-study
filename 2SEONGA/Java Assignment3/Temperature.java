import java.util.Scanner;

public class Temperature {
  public static void main(String[] args) throws Exception {
    double celsius;
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("섭씨 온도 입력 : ");
      celsius = sc.nextDouble();
    }
		System.out.printf("화씨 %f25.0도는 섭씨로 " + celsius + "도 입니다.", (celsius * 1.8) + 32);
  }
}
