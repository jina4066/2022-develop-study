import java.util.Scanner;

public class Assignment4_2 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("전공 이수 학점: ");
        int a = sc.nextInt();
        System.out.println("교양 이수 학점: ");
        int b = sc.nextInt();
        System.out.println("일반 이수 학점: ");
        int c = sc.nextInt();

        if (a+b+c>=140) {
            if (a>=70 && (b>=30 && c>=30) || (b+c>=80))
                System.out.println("졸업 가능 여부: 졸업 가능");
        }
        else {
            System.out.println("졸업 가능 여부: 졸업 불가능");
        }

        sc.close();    
        }
    }

