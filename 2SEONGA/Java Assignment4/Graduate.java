import java.util.Scanner;

public class Graduate {
  public static void main(String[] args) throws Exception {
    int major = 0, culture = 0, normal = 0, all = 0;
    Scanner sc = new Scanner(System.in);
      System.out.println("전공 이수 학점 : ");
      major = sc.nextInt();
      System.out.println("교양 이수 학점 : ");
      culture = sc.nextInt();
      System.out.println("일반 이수 학점 : ");
      normal = sc.nextInt();
      all = major + culture + normal;

      if (major < 70) {
      System.out.println("졸업 가능 여부 : 졸업 불가능");
      } else if ((culture < 30) && (normal < 30)) {
        System.out.println("졸업 가능 여부 : 졸업 불가능");
      } else if (culture + normal < 80) {
        System.out.println("졸업 가능 여부 : 졸업 불가능");
      } else if (all < 140) {
        System.out.println("졸업 가능 여부 : 졸업 불가능");
      } else {
        System.out.println("졸업 가능 여부 : 졸업 가능");
      }
    sc.close();
  }
}
