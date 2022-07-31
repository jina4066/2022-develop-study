import java.util.Scanner;

public class Assignment4_1 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("0~999 사이의 숫자를 입력하시오: ");
    int number = in.nextInt();
    in.close();
    String str = "" + number; // 정수를 문자열로 전환
    int sum = 0;
    for (int i = 0; i < str.length(); i++) { // 자릿수 모두 더하기
      int num = Integer.parseInt(str.substring(i, i + 1));
      sum += num;
    }
    System.out.println("각 자릿수의 합:" + sum);
  }
}