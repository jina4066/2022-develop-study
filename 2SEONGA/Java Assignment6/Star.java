public class Star {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 6; i++) {
            String result = new String(new char[i]).replace("\0", "*");
            System.out.println(result);
        }
    }
}
