
public class YourFirstAccount {

    public static void main(String[] args) {
        Account nachoAccount = new Account("Cuenta de Nacho", 100.0);
        nachoAccount.deposit(20);
        System.out.println(nachoAccount);
    }
}
