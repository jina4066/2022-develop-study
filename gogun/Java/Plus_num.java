import java.util.Scanner;

public class Plus_num {
  public static void main(String[] args) throws Exception{
    String s;
    Scanner in = new Scanner(System.in);
    System.out.print("0부터 999 사이의 숫자를 입력하시오 : ");
    s = in.next();
    in.close();   
    int ans = 0;
    for (int i=0; i<s.length(); i++) {
      ans += Integer.parseInt(s.substring(i, i+1));
    }
    System.out.println("각 자릿수의 합 : " + ans);
  }
} 


