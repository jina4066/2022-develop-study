// import java.util.Scanner;

// public class App {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("0~999 사이의 숫자를 입력하시오: ");
//         int num = sc.nextInt();
//         int num_hun = num/100 ;
//         int num_ten = (num/10) % 10;
//         int num_one = num%10;
//         int sum = num_hun+num_one+num_ten;
//         System.out.printf("각 자릿수의 합: %d",sum );
//         sc.close();
        
//     }   
// }
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("전공 이수 학점: ");
        int major = sc.nextInt();
        System.out.println("교양 이수 학점:");
        int culture = sc.nextInt();
        System.out.println("일반 이수 학점:");
        int general = sc.nextInt();
        int sum = major + culture + general;
        if ((major>=70 && culture>=30 && general>=30 && sum>=140) | culture + general>=80 )
            {System.out.println("졸업 가능 여부: 졸업 가능");}
        else {
            System.out.println("졸업 가능 여부: 졸업 불가능");
        }
        sc.close();
    }
}

