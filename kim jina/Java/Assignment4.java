import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) throws Exception { 
        int x = 0;
        int y = 0;
    
        Scanner sc = new Scanner(System.in);
        System.out.println("0~999 사이의 숫자를 입력하시오: ");
        x = sc.nextInt();
        
        while (x != 0){
            y += x % 10;
            x /= 10;
        }
        System.out.println("각 자릿수의 합: " + y);
        sc.close();

    }
}
