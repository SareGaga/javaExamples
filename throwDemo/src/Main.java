public class Main {
    public static void main(String[] args)  {
        AccountManager manager =new AccountManager();
        System.out.println("hesap = "+manager.getBalance());
        manager.deposit(100);
        System.out.println("hesap = "+manager.getBalance());

        try {
            manager.withdraw(90);
        }catch (BalanceInsufficentException exception){ // balance yerine exceptionda yazabilirdik.
            System.out.println(exception.getMessage());
        }

        System.out.println("hesap = "+manager.getBalance());
        try {
            manager.withdraw(90);
        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }

        System.out.println("hesap = "+manager.getBalance());
    }
}