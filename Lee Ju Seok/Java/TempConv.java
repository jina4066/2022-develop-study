import java.util.Scanner;

public class TempConv {
    public static void main(String[] args) throws Exception {
        double Celsius;
        Scanner sc = new Scanner(System.in);
        System.out.println("섭씨 온도:");
        Celsius = sc.nextDouble();

        System.out.println("화씨 " + (Celsius * 1.8 + 32.0) + "도는 섭씨로 " + Celsius + "도 입니다.");
    }
}