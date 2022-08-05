import java.util.Scanner;  

public class WhileUsing {  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자를 입력하세요: ");  
        int num = sc.nextInt();  
        System.out.printf("factorial(%d) = %d", num, factorial(num)); 
        System.out.println("");
        System.out.println("숫자를 입력하세요: ");
        int num1 = sc.nextInt();
        System.out.println("두 번째 숫자를 입력하세요: ");
        int num2 = sc.nextInt();
        System.out.printf("factorial(%d, %d) = %d", num1, num2, factorial(num1, num2));

        sc.close();
    }

    public static int factorial(int n) {  
        int fact = 1;  
        int i = 1;  

        while(i <= n) {  
            fact *= i;   
            i++;   
        }  
        return fact;  
    }  

    public static int factorial(int n1, int n2) {
        int fact = 1;
        int i = n1;

        while(i <= n2) {
            fact *= i;
            i++;
        }
        return fact;
    }
}  
