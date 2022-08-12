public class pb_6 {
    public static void main(String[] args) {
        int[][] arr = new int [4][4];
        int k=0;
        for (int i =0; i<4; i++){
            for (int j =0; j<4; j++){
                k +=1; 
                arr[i][j] = k;
                System.out.print(arr[i][j]+ "  ");
            }
            System.out.print("\n");
        }
    
    }
}
