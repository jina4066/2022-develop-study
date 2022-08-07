import java.util.Scanner ;

public class Assignment5 {
  
  public static void main (String[]args) {
    double height = 0 ;
    double weight = 0 ;
    double bmi;

    Scanner sc = new Scanner(System.in);
    System.out.println("신장을 입력하시오 (m): ") ;
    height = sc.nextDouble();
    System.out.println("체중을 입력하시오 (kg): ") ;
    weight = sc.nextDouble();

    bmi = weight /Math.pow(height,2);
    System.out.printf("bmi: %.2f %n",bmi);

    if(bmi >= 30) {
      System.out.println("비만도: 비만");
    }else if(bmi >= 25) {
      System.out.println("비만도: 과체중");
    }else if(bmi >= 18.5) {
      System.out.println("비만도: 정상");
    }else{
      System.out.println("비만도: 저체중");
    }
    sc.close();
  }
}
