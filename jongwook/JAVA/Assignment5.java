import java.util.Scanner;

public class Assignment5 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("신장을 입력하시오: "); // m 단위로 입력
    double height = in.nextDouble();
    System.out.print("체중을 입력하시오: "); // kg 단위로 입력
    double weight = in.nextDouble();
    double bmi = weight / (height * height);
    String bodyCondition = "";
    if (bmi >= 30) {
      bodyCondition = "비만";
    } else {
      if (bmi >= 25) {
        bodyCondition = "과체중";
      } else {
        if (bmi >= 18.5) {
          bodyCondition = "정상";
        } else {
          bodyCondition = "저체중";
        }
      }
    }
    System.out.printf("BMI: %.2f\n", bmi);
    System.out.printf("비만도: %s", bodyCondition);
  }
}
