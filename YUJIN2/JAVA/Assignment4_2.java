import java.util.Scanner;
public class Assignment4_2 {
    public static void main(String[] args) throws Exception {
    /*2.다음과 같이 키보드로 0부터 999 사이의 정수를 입력 받아 각 자릿수를 더한 결과를 
    다음과 같이 출력하는 프로그램을 작성하시오. (코드와 결과를 캡쳐하여 첨부하시오.) */
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        in.close();
        System.out.println("0~999 사이의 숫자를 입력하시오: " + i);

        int a = i / 100;
        int b = i % 100 / 10;
        int c = i % 100 % 10;
        int sum = a + b + c;
        
        System.out.println("각 자릿수의 합: " + sum);
    
    
    
    
    
    }
}
