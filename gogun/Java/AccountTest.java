public class AccountTest {
  public static void main(String[] args) {
    Account a = new Account();
    a.setOwner("geon");
    a.setBalance(100000);
    a.deposit(50000);
    a.withdraw(200000);
    System.out.println("잔금: " + a.getBalance());
  }
}
class Account {
private String owner;
private long balance;

public Account() {}

public String getOwner() {
  return owner;
}
public long getBalance() {
  return balance;
}
public void setOwner(String owner) {
  this.owner = owner;
}
public void setBalance(long balance) {
  this.balance = balance;
}
public long deposit(long amount) {
  balance += amount;
  return balance;
}
// Assignment9 3번 문제
// public long withdraw(long amount) {
//   balance -= amount;
//   return balance;
// }

public long withdraw(long amount) {
  if (amount > balance) {
    System.out.println("잔액이 부족합니다.");
  } else {
    balance -= amount;
  }
  return balance;
}

}
