public class AccountDemo { 
    public static void main(String[] args) {
        Account account = new Account();
        System.out.println("帳戶: " + account.getAccountNumber()); 
        System.out.println("餘額: " + account.getBalance()); 

        account = new Account("123-4567", 100.0);
        account.deposit(1000.0);
        System.out.println("帳戶: " + account.getAccountNumber()); 
        System.out.println("餘額: " + account.getBalance()); 
    } 
}
