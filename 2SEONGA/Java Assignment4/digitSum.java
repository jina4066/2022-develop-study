import java.util.Scanner;

public class digitSum {
  public static void main (String[] args) {
    int inputInt = 0, sum = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("0~999 사이의 숫자를 입력하시오. : ");
    inputInt = sc.nextInt();

    while (inputInt != 0) {
      sum += inputInt % 10;
      inputInt /= 10;
    }
    
    System.out.println("각 자릿수의 합 : " + sum);
    sc.close();
    
  }
}