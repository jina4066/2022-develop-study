import java.util.Scanner;

public class BMI {
  public static void main(String[] args) throws Exception { 
    Scanner sc = new Scanner(System.in);
    System.out.print("신장을 입력하시오: "); // T : 신장(cm)
    double Tall = sc.nextDouble();
    double T = Tall/100;
    System.out.print("체중을 입력하시오: "); // W : 체중(kg)
    double W = sc.nextDouble();
    sc.close();
    double BMI = W / (T*T);
    System.out.printf("BMI: %.2f\n",BMI);
    if (BMI >= 30) {
      System.out.println("비만도: 비만");
    } else if (BMI >= 25) {
      System.out.println("비만도: 과체중");
    } else if (BMI >= 18.5) {
      System.out.println("비만도: 정상");
    } else {
      System.out.println("비만도: 저체중");
    }
  }
}
