import java.util.Scanner;

public class Assignment5_1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double height, weight, result, BMI;

        System.out.println("신장을 입력하세요: ");
        height = sc.nextDouble();
        System.out.println("체중을 입력하세요: ");
        weight = sc.nextDouble();
        result = Math.pow(height, 2);
        BMI = weight / result;
        System.out.println(String.format("BMI: %.2f",BMI));
        
        if (BMI>=30) {
            System.out.println("비만도: 비만");
        }
        else if (BMI>=25) {
            System.out.println("비만도: 과체중");
        }
        else if (BMI>=18.5) {
            System.out.println("비만도: 정상");
        }
        else {
            System.out.println("비만도: 저체중");
        }

        sc.close();
    }
}
