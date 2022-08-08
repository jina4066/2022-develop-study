// import java.util.Scanner;

// public class App {
//     public static void main(String[] args) throws Exception {
//         double height=0;
//         double weight=0;
//         double BMI=0;
//         double HH=0;
//         Scanner sc = new Scanner(System.in);
//         System.out.print("신장을 입력하시오: ");
//         height = sc.nextDouble();
//         HH = height * height;
//         System.out.print("체중을 입력하시오: ");
//         weight = sc.nextDouble();
//         BMI = weight/HH;
//         System.out.printf("BMI: %f",BMI);
//         System.out.println();
//         if (BMI>=30) {
//             System.out.println("비만도: 비만");
//         } else if (BMI>=25) {
//             System.out.println("비만도: 과체중");
//         } else if (BMI>=18.5) {
//             System.out.println("비만도: 정상");
//         } else {
//             System.out.println("비만도: 저체중");
//         }
//         sc.close();
        
//     }
// }

// public class App {
//     public static void main(String[] args) {
//         light("RED");
//         light("YELLOW");
//         light("GREEN");
//         light("BLUE");
//     }
//     public static void light(String color) {
//         switch (color) {
//         case "RED" -> System.out.println("빨간불이 켜집니다.");
//         case "YELLOW" -> System.out.println("노란불이 켜집니다.");
//         case "GREEN" -> System.out.println("초록불이 켜집니다.");
//         default -> System.out.printf("에러, 잘못된 색 입력: %s\n",color);
//         }
//     }
// }

// public class App {
//     public static void main(String[] args) {
//         for (int i = 1; i < 6; i++) {
//             for (int j = 1; j<=i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

public class App {
    public static void main(String[] args) {
        System.out.printf("factorial(10)= %d ", factorial(10));
        System.out.println();
        System.out.printf("factorial(4,10) = %d", factorial(4,10));
    }
    public static int factorial(int i) {
        if (i==0 || i==1) {
            return 1;
        } else {
            return factorial(i-1) * i;
        }        
    }
    public static int factorial(int l, int j) {
        int mul=1;
        j=10;
        l=4;
        while (j>=l) {
            mul=mul*j;
            j--;
        }
    return mul;
    }
}