import java.util.Scanner ;

public class Assignment4 {

  public static void main (String[] args) {
      int sum = 0 ;
      int num = 0 ;
      Scanner sc = new Scanner(System.in) ;
      System.out.println("0~999 사이의 숫자를 입력하시오: ") ;
      num = sc.nextInt();

      while(num != 0){
        sum += num%10;
        num /= 10;  
      }

      System.out.println("각 자릿수의 합: " + sum) ;
      sc.close();

    }
}

      

