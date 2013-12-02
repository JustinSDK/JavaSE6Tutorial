public class AccountDemo { 
    public static void main(String[] args) {
        Account account = new Account();
        System.out.println("±b§·: " + account.getAccountNumber()); 
        System.out.println("æl√B: " + account.getBalance()); 

        account = new Account("123-4567", 100.0);
        account.deposit(1000.0);
        System.out.println("±b§·: " + account.getAccountNumber()); 
        System.out.println("æl√B: " + account.getBalance()); 
    } 
}
