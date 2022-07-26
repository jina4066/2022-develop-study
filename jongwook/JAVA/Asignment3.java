import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int fahrenheit = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("화씨 온도를 입력해주세요 :");
        fahrenheit = sc.nextInt();
        sc.close();
        double temperature = (fahrenheit - 32.0) / 1.8;
        System.out.printf("화씨 %d도는 섭씨로 %.1f도 입니다.", fahrenheit, temperature);

    }
}