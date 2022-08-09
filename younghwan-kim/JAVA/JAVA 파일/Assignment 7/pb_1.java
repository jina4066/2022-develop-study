import java.util.Scanner;

public class pb_1 {
    public static void main(String[] args) {
        
        int[] number = new int[5];
        int size = number.length;
        Scanner sc = new Scanner(System.in);
        System.out.print("입력: ");
        for(int i=0; i<size; i++){
            number[i] = sc.nextInt();            
        }
        sc.close();
        System.out.print("출력: ");
        for(int i=0; i<size; i++){
            System.out.print(number[i]+" ");
        }
    }
}
