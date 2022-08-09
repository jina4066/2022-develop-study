import java.util.Scanner; 
public class pb_2 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("금액을 입력하시오.");
    int n = sc.nextInt();
    int a = n/500;
    int b = n%500/100;
    int c = n%500%100/50;
    int d = n%500%100%50/10;
    sc.close();
    
    
    
    System.out.printf("거스름 돈 : %d / 500원 : %d개 / 100원 : %d / 50원 : %d개 / 10원 : %d개",n,a,b,c,d);
}
}
