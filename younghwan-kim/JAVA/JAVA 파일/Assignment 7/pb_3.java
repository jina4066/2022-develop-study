import java.util.Random;
import java.util.*;

public class pb_3 {
    public static void main(String[] args) throws Exception{
    boolean[] Arr = new boolean [10];
    int[] arr = new int[10];
    Random rd = new Random();
    for(int i=0; i<10; i++ ){
        int n = rd.nextInt(5)+1;
        arr[i] = n;
    }
    System.out.println(Arrays.toString(arr));
    for(int i =0; i< 10; i++){
        Arr[arr[i]] = true; 
    }
    System.out.print("[");
    for (int i=0; i<10; i++){
        if(Arr[i]){
            System.out.print(i + " ");
        }
    }
    System.out.print("]");
    }
    
}


