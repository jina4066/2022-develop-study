import java.util.Scanner ;

public class Assignment3 {
  public static void main (String[] args) {
    double fah ;
    double cel ;

    Scanner sc = new Scanner(System.in);
    System.out.println("화씨를 입력하세요: ");
    fah = sc.nextDouble();

    cel = ((fah-32.0)/1.8);

    System.out.printf("화씨 %.1f도는 섭씨로 %.1f도 입니다.",fah,cel);
  }
}