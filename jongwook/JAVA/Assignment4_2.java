import java.util.Scanner;

public class Assignment4_2 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("전공 이수 학점: ");
    int major = in.nextInt();
    System.out.print("교양 이수 학점: ");
    int refinement = in.nextInt();
    System.out.print("일반 이수 학점: ");
    int general = in.nextInt();
    in.close();
    int qualification = 0;
    if (major + refinement + general >= 140) { // 1번 조건
      qualification += 1;
    }
    if (major >= 70) { // 2번 조건
      qualification += 1;
    }
    if (refinement >= 30 && general >= 30) { // 3-1번 조건
      qualification += 1;
    } else if (refinement + general >= 80) { // 3-2번 조건
      qualification += 1;
    }
    if (qualification == 3) { // 조건 1,2,3번 모두 충족시 졸업 가능
      System.out.println("졸업 가능 여부: 졸업 가능");
    } else {
      System.out.println("졸업 가능 여부: 졸업 불가능");
    }

  }
}
