import java.util.Scanner;
public class Graduate {
  public static void main(String[] args) throws Exception {
    int a = 0;
    int b = 0;
    int c = 0;
    Scanner in = new Scanner(System.in);
    System.out.print("전공 이수 학점 : ");
    a = in.nextInt();
    System.out.print("교양 이수 학점 : ");
    b = in.nextInt();
    System.out.print("일반 이수 학점 : ");
    c = in.nextInt();
    in.close();
    if (a >= 70 && (b + c >= 80 || (b >= 30 && c >= 30)) && a + b + c >= 140) {
      System.out.println("졸업 가능 여부 : 졸업 가능");    
    } else {
      System.out.println("졸업 가능 여부 : 졸업 불가능"); 
    }
  }
}
