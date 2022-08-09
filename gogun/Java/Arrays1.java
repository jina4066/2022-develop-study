import java.util.Arrays;
import java.util.Random;

public class Arrays1 {
  public static void main(String[] args) throws Exception {
    Random random = new Random();
    int[] Ints = new int[10];
    for (int i = 0; i < Ints.length; i++) {
      Ints[i] = random.nextInt(5) + 1;
    }
    System.out.print(Arrays.toString(Ints));
    int[] temp = new int[5];
    int cnt = 0;
    for (int i = 0; i < Ints.length; i++) {
      boolean exist = false;
      for (int j = 0; j < temp.length; j++) {
        if (Ints[i] == temp[j]) {
          exist = true;
        }
      }
      if(exist == false) {
        temp[cnt++] = Ints[i];
      }
    }
    int[] answer = new int[cnt];
    for (int i = 0; i < answer.length; i++) {
      answer[i] = temp[i];
    }
    System.out.print(" -> ");
    System.out.print(Arrays.toString(answer));
  }
}