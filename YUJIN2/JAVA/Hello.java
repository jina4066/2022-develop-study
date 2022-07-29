import java.util.Scanner;
public class Hello {
    public static void main(String[] args) throws Exception {
        float b=0;
        System.out.println("화씨온도를 입력하세요.");
        Scanner s = new Scanner(System.in);
        b = s.nextFloat();
        double C = (b - 32.0) / 1.8;
        System.out.printf("화씨 %.1f도는 섭씨로 %.1f도 입니다", b,C);
    }
}
