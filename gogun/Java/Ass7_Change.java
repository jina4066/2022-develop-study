public class Ass7_Change {
  public static void main(String args[]) {
		int[] coinUnit = {500, 100, 50, 10};
    int[] coins = new int[4];
		int money = 2680;
		System.out.println("money=" + money);
		for(int i=0; i<coinUnit.length; i++) {
      coins[i] = money / coinUnit[i];
			System.out.println(coinUnit[i] + "원: " + coins[i] + "개");
      money %= coinUnit[i];
    }
	} 
}
