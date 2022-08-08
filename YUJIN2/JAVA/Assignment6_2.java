public class Assignment6_2 {
    public static void main(String[] args){
        System.out.println(factorial(10));
        System.out.println(factorial(4,10));
    }
    
    public static int factorial(int n){
        if(n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }

    public static int factorial(int start, int end) {
        int n=start;
        int ans=1;
        while (n<=end) {
            ans*=n;
            n++;
        } 

        return ans;
    }
}

