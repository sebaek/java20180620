package chapter10;

public class AccountExample {
    public static void main(String[] args) {
        Account account = new Account();
        
        account.deposit(10000);
        System.out.println("예금액 : " + account.getBalance());
        
        try {
            account.withdraw(1000);
            return ;
        } catch (BalanceInsufficientException e) {
            String message = e.getMessage();
            System.out.println(message);
            System.out.println();
            e.printStackTrace();
        } finally {
            System.out.println("파이널리블럭");
        }
    }
}
