public class Problem6 {
    public static void main(String[] args) throws Exception {
        int[][] arr = new int[4][4];

        int num = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = num++;
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }
    }
}
