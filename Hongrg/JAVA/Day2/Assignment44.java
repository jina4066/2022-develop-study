import java.util.Scanner ;

public class Assignment44 {
  
  public static void main (String[]args) {
    int major = 0;
    int refine = 0;
    int general =0; 
    Scanner sc = new Scanner(System.in) ;
    System.out.println("전공 이수 학점: ");
    System.out.println("교양 이수 학점: ");
    System.out.println("일반 이수 학점: ");
    major = sc.nextInt();
    refine = sc.nextInt();
    general = sc.nextInt();

    if(major < 70){
      System.out.println("졸업 가능 여부 : 졸업 불가능") ;
    }else if((general < 30) && (refine < 30)){
      System.out.println("졸업 가능 여부 : 졸업 불가능") ;
    }else if(refine + general < 80){
      System.out.println("졸업 가능 여부 : 졸업 불가능") ;
    }else if(refine + general + major < 140){
      System.out.println("졸업 가능 여부 : 졸업 불가능") ;
    }else{
      System.out.println("졸업 가능 여부 : 졸업 가능") ;
    }

    sc.close();
  }
}
