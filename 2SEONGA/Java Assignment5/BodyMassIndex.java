import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) throws Exception {
    double height = 0, weight = 0, BMI = 0;

    Scanner sc = new Scanner(System.in);
    System.out.println("신장을 입력하시오. (m) : ");
    height = sc.nextDouble();
    System.out.println("체중을 입력하시오. (kg): ");
    weight = sc.nextDouble();

    BMI = weight / Math.pow(height,2);
    System.out.printf("BMI : %.2f %n", BMI);
    
    if (BMI < 18.5) {
        System.out.println("비만도 : 저체중");
    } else if (BMI < 25) {
        System.out.println("1,.비만도 : 정상 체중");
    } else if (BMI < 30) {
        System.out.println("비만도 : 과체중");
    } else {
        System.out.println("비만도 : 비만");
    }
    sc.close();
    }
}
