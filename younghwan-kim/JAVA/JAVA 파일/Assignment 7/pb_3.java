import java.util.Random;
import java.util.HashSet;
import java.util.ArrayList;

public class pb_3 {
    public static void main(String[] args) throws Exception{
    ArrayList<Integer> Arr = new ArrayList<Integer>(10);
    Random rd = new Random();
    for(int i=0; i<10; i++ ){
        int n = rd.nextInt(5)+1;
        Arr.add(n);
    }
    System.out.println(Arr);
    HashSet<Integer> Arr_1 = new HashSet<Integer>(Arr);
    HashSet<Integer> Arr_2 = new HashSet<Integer>(Arr_1);
    System.out.println(Arr_2);
    }
    
}


