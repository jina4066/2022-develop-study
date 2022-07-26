import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) throws Exception {
        double F;
        float C;
        Scanner sc = new Scanner(System.in);
        System.out.print("섭씨 온도를 입력하세요 : ");
        C = sc.nextFloat();

        F = C * 1.8 + 32.0;
        System.out.printf("화씨 %.1f도는 섭씨로 %.1f도 입니다.",F,C);        
    }
}
