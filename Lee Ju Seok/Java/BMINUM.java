import java.util.Scanner;

public class BMINUM {
    public static void main(String[] args) throws Exception {
        float W;
        float T;

        Scanner sc = new Scanner(System.in);
        System.out.print("신장을 입력하시오: ");
        T = sc.nextFloat();
        System.out.print("체중을 입력하시오: ");
        W = sc.nextFloat();

        double bmi = W / (T/100 * T/100);
        
        System.out.printf("BMI : %.2f", bmi);
        System.out.println("");

        if (bmi >= 30) {
            System.out.println("비만도 : 비만");
        }
        else {
            if (bmi >= 25) {
                System.out.println("비만도 : 과체중");
            }
            else {
                if (bmi >= 18.5) {
                    System.out.println("비만도 : 정상");
                }
                else {
                    System.out.println("비만도 : 저체중");
                }
            }
        }
    }
}
