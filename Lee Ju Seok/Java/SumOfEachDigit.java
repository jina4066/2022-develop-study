import java.util.Scanner;

public class SumOfEachDigit {
    public static void main (String[] args) {
        int num = 0;
        int sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("0~999 사이의 숫자를 입력하시오: ");
        num = sc.nextInt();

        while(num != 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println("각 자릿수의 합: "+sum);
        sc.close();
    }
}
