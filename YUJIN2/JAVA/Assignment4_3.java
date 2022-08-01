import java.util.Scanner;
public class Assignment4_3 {
    public static void main(String[] args) throws Exception {
    /*3. 명지대학교를 졸업하기 위해 최소 140학점을 이수해야 한다고 하자. 
    이수한 학점 중 전공은 70학점 이상이어야 하며, 교양과 일반은 각각 30학점 이상이거나 
    두 영역의 합이 80학점 이상이어야 한다. 
    이수한 세 개의 학점을 각각 키보드로 입력 받아 졸업 여부를 출력하는 프로그램을 
    작성하시오. (위의 나열된 모든 조건 고려, 코드와 결과를 캡쳐하여 첨부하시오.) 
     */
    Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    int b = in.nextInt();
    int c = in.nextInt();
    in.close();

    System.out.println("전공 이수 학점: " + a);
    System.out.println("교양 이수 학점: " + b);
    System.out.println("일반 이수 학점: " + c);


    if (a + b + c >= 140 && a >= 70 && b + c >= 80)
        System.out.println("졸업 가능 여부: 졸업 가능");

    else if (a + b + c >= 140 && a >= 70 && b >= 30 && c >= 30)
        System.out.println("졸업 가능 여부 : 졸업 가능");
    
    }
}
