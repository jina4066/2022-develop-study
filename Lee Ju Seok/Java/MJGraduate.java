import java.util.Scanner;

public class MJGraduate {
    public static void main(String[] args) {
        int major;
        int liberalart;
        int normal;

        Scanner sc = new Scanner(System.in);

        System.out.print("전공 이수 학점: ");
        major = sc.nextInt();
        System.out.print("교양 이수 학점: ");
        liberalart = sc.nextInt();
        System.out.print("일반 이수 학점: ");
        normal = sc.nextInt();

        if (major >= 70 && (liberalart >= 30 && normal >= 30 || liberalart + normal >= 80) && major + liberalart + normal >= 140) {
            System.out.println("졸업 가능 여부: 졸업 가능");
        } 
        else {
            System.out.println("졸업 가능 여부: 졸업 불가능");
        }
        sc.close();
    }
}
